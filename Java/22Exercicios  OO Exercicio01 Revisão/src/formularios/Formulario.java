package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Beans;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtClassificacao;
	private JTextField txtValor;
	private JTable table;

	public Formulario() {
		
		Acao a = new Acao();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 48, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(99, 8, 200, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblGnero = new JLabel("G\u00EAnero:");
		lblGnero.setBounds(10, 39, 48, 14);
		contentPane.add(lblGnero);
		
		JLabel lblPlataforma = new JLabel("Plataforma:");
		lblPlataforma.setBounds(10, 67, 79, 14);
		contentPane.add(lblPlataforma);
		
		JLabel lblClassificao = new JLabel("Classifica\u00E7\u00E3o:");
		lblClassificao.setBounds(10, 95, 79, 14);
		contentPane.add(lblClassificao);
		
		txtClassificacao = new JTextField();
		txtClassificacao.setColumns(10);
		txtClassificacao.setBounds(99, 92, 200, 20);
		contentPane.add(txtClassificacao);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setBounds(10, 123, 79, 14);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(99, 120, 200, 20);
		contentPane.add(txtValor);
		
			JButton btnNewButton = new JButton("Alterar");
		btnNewButton.setBounds(125, 148, 105, 23);
		btnNewButton.setEnabled(false);
		contentPane.add(btnNewButton);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(240, 148, 105, 23);
		btnExcluir.setEnabled(false);
		contentPane.add(btnExcluir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 194, 476, 223);
		contentPane.add(scrollPane);
		
		table = new JTable(a.selecionar());
		scrollPane.setViewportView(table);
		
		JComboBox cbxGenero = new JComboBox();
		cbxGenero.setBounds(99, 35, 200, 18);
		cbxGenero.addItem("A��o");
		cbxGenero.addItem("Aventura");
		cbxGenero.addItem("Suspense");
		contentPane.add(cbxGenero);
		
		JComboBox cbxPlataforma = new JComboBox();
		cbxPlataforma.setBounds(99, 63, 200, 18);
		cbxPlataforma.addItem("Xbox One");
		cbxPlataforma.addItem("Ps4");
		cbxPlataforma.addItem("PC");
		contentPane.add(cbxPlataforma);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Beans b = new Beans();
				
				try {
				b.setNome(txtNome.getText());
				b.setGenero(cbxGenero.getSelectedItem().toString());		
				b.setPlataforma(cbxPlataforma.getSelectedItem().toString());
				b.setClassificacao(Integer.parseInt(txtClassificacao.getText()));
				b.setValor(Integer.parseInt(txtValor.getText()));
				
				if(a.verificar(b)) {
					a.cadastrar(b);
				}else {
					JOptionPane.showMessageDialog(null, "Este jogo ja foi cadastrado nesta plataforma!");
				}
				
				txtNome.setText("");
				cbxGenero.setSelectedIndex(0);
				cbxPlataforma.setSelectedIndex(0);
				txtClassificacao.setText("");
				txtValor.setText("");
				
				table.setModel(a.selecionar());
				
				}catch(Exception erro) {
					JOptionPane.showMessageDialog(null, "N�o foi possivel cadastrar o jogo!");
;
				}
				
				
			}
		});
		btnCadastrar.setBounds(10, 148, 105, 23);
		contentPane.add(btnCadastrar);
		
	
	}
}
