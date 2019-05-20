package formulario;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import array.Array;
import beans.Beans;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class FormularioCadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JPasswordField txtPass;


	public FormularioCadastrar() {
	
		DecimalFormat df = new DecimalFormat("00");
		LocalDateTime momento = LocalDateTime.now();
		int dia = momento.getDayOfMonth();
		int mes = momento.getMonthValue();
		int ano = momento.getYear();
		int hora = momento.getHour();
		int minutos = momento.getMinute();
		
		Acao a = new Acao();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeDeUsuario = new JLabel("Nome de Usu\u00E1rio:");
		lblNomeDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNomeDeUsuario.setBounds(10, 11, 133, 30);
		contentPane.add(lblNomeDeUsuario);
		
		txtNome = new JTextField();
		txtNome.setBounds(144, 19, 200, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSenha.setBounds(10, 52, 133, 30);
		contentPane.add(lblSenha);
		
		JLabel lblTipoDeUsurio = new JLabel("Tipo de usu\u00E1rio:");
		lblTipoDeUsurio.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTipoDeUsurio.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTipoDeUsurio.setBounds(10, 93, 133, 30);
		contentPane.add(lblTipoDeUsurio);
		
		JComboBox cbxTipo = new JComboBox();
		cbxTipo.setBounds(144, 100, 200, 22);
		cbxTipo.addItem("Administrador");
		cbxTipo.addItem("Simples");
		contentPane.add(cbxTipo);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEmail.setBounds(10, 134, 133, 30);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(144, 142, 200, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(Color.BLACK);
		btnCadastrar.setContentAreaFilled(false);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Beans b = new Beans();
				
				try {
				b.setNome(txtNome.getText());
				b.setSenha(String.valueOf(txtPass.getPassword()));
				b.setTipo(cbxTipo.getSelectedItem().toString());
				b.setEmail(txtEmail.getText());
				b.setData(df.format(dia)+"/"+df.format(mes)+"/"+df.format(ano)+" - "+df.format(hora)+":"+df.format(minutos));
				if(a.valide(b)) {	
				
				Array.vetorJogos.add(b);
				
				
				JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
				
				dispose();
				}
				}catch(Exception erro) {
				JOptionPane.showMessageDialog(null, "Não foi possivel cadastar o usuário!");
				}
				
				
			}
		});
		btnCadastrar.setBounds(10, 187, 148, 41);
		contentPane.add(btnCadastrar);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(144, 60, 200, 22);
		contentPane.add(txtPass);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(Color.BLACK);
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setBounds(223, 187, 121, 41);
		contentPane.add(btnVoltar);
	}
}
