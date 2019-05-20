package formulario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import array.Array;
import beans.Beans;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioEditar extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSenha;
	private JTextField txtEmail;



	/**
	 * Create the frame.
	 */
	public FormularioEditar() {
		
		Acao a = new Acao();
		
		int indicar=0;
		for(int i=0;i<Array.vetorJogos.size();i++) {
			if(Array.vetorJogos.get(i).getValid()==1) {
				indicar=i;
				break;
			}
		}
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 168);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIndice = new JLabel("");
		lblIndice.setBounds(156, 121, 78, 8);
		lblIndice.setVisible(false);
		contentPane.add(lblIndice);
		lblIndice.setText(""+indicar);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 48, 14);
		contentPane.add(lblNome);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 36, 48, 14);
		contentPane.add(lblSenha);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(10, 61, 48, 14);
		contentPane.add(lblEmail);
		
		txtNome = new JTextField(Array.vetorJogos.get(indicar).getNome());
		txtNome.setBounds(68, 8, 160, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtSenha = new JTextField(Array.vetorJogos.get(indicar).getSenha());
		txtSenha.setBounds(68, 33, 160, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		txtEmail = new JTextField(Array.vetorJogos.get(indicar).getEmail());
		txtEmail.setBounds(68, 58, 160, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBackground(Color.BLACK);
		btnAlterar.setContentAreaFilled(false);
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int indica = Integer.parseInt(lblIndice.getText());
				
				Beans alt = new Beans();
				alt.setNome(txtNome.getText());
				alt.setSenha(txtSenha.getText());
				alt.setEmail(txtEmail.getText());
				alt.setTipo("Simples");
				alt.setData(Array.vetorJogos.get(indica).getData());
				
				
				a.alterar(alt, indica);
				
			}
		});
		btnAlterar.setBounds(10, 86, 100, 32);
		contentPane.add(btnAlterar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(Color.BLACK);
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnVoltar.setBounds(124, 86, 100, 32);
		contentPane.add(btnVoltar);
		
		
	}
}
