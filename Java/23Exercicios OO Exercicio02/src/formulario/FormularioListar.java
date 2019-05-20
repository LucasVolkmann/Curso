package formulario;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import array.Array;
import beans.Beans;

import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class FormularioListar extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtNome;
	private JTextField txtSenha;
	private JTextField txtEmail;

	/**
	 * Create the frame.
	 */
	public FormularioListar() {
		
		Acao a = new Acao();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cbxTipo = new JComboBox();
		cbxTipo.setBounds(68, 77, 182, 20);
		cbxTipo.addItem("Administrador");
		cbxTipo.addItem("Simples");
		contentPane.add(cbxTipo);
		
		JLabel lblIndice = new JLabel("");
		lblIndice.setBounds(10, 0, 48, 14);
		lblIndice.setVisible(false);
		contentPane.add(lblIndice);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int indice = Integer.parseInt(lblIndice.getText());
				
				Beans b = new Beans();
				
				b.setNome(txtNome.getText());
				b.setSenha(txtSenha.getText());
				b.setTipo(cbxTipo.getSelectedItem().toString());
				b.setEmail(txtEmail.getText());
				b.setData(table.getValueAt(indice, 3).toString());
				
				
				
				if(a.adm(indice)) {
					JOptionPane.showMessageDialog(null, "Não é possivel alterar um administrador!");
				}else if(txtNome.getText().contentEquals(Array.vetorJogos.get(indice).getNome())) {
					a.alterar(b, indice);
					JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!");
				}else if(a.valide(b)) {
					a.alterar(b, indice);
					JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!");
				}
				
				txtNome.setText("");
				txtSenha.setText("");
				cbxTipo.setSelectedIndex(0);
				txtEmail.setText("");
				
				table.setModel(a.selecionar());
			}
		});
		btnAlterar.setBounds(10, 312, 112, 38);
		btnAlterar.setContentAreaFilled(false);
		btnAlterar.setBackground(Color.BLACK);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int indice = Integer.parseInt(lblIndice.getText());
				
				if(a.adm(indice)) {
					JOptionPane.showMessageDialog(null, "Não é possivel excluir administrador!");
				}else
				a.excluir(indice);	
				
				txtNome.setText("");
				txtSenha.setText("");
				cbxTipo.setSelectedIndex(0);
				txtEmail.setText("");
				
				table.setModel(a.selecionar());
				
				JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
			}
		});
		btnExcluir.setBounds(138, 312, 112, 38);
		btnExcluir.setContentAreaFilled(false);
		btnExcluir.setBackground(Color.BLACK);
		contentPane.add(btnExcluir);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
	
		scrollPane.setBounds(260, 11, 614, 389);
		contentPane.add(scrollPane);
		
		table = new JTable(a.selecionar());
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {

				int indice=table.getSelectedRow();
				
				lblIndice.setText(""+indice);
				txtNome.setText(table.getValueAt(indice, 0).toString());
				txtSenha.setText(Array.vetorJogos.get(indice).getSenha());
				switch(Array.vetorJogos.get(indice).getTipo()) {
				case "Administrador":
					cbxTipo.setSelectedIndex(0);
					break;
				case "Simples":
					cbxTipo.setSelectedIndex(1);
					break;
				
				}
				txtEmail.setText(Array.vetorJogos.get(indice).getEmail());
				
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setBounds(10, 18, 48, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(68, 15, 182, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(68, 46, 182, 20);
		contentPane.add(txtSenha);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(68, 108, 182, 20);
		contentPane.add(txtEmail);
		
		JLabel lblSenha = new JLabel("SENHA:");
		lblSenha.setBounds(10, 49, 48, 14);
		contentPane.add(lblSenha);
		
		JLabel lblTipo = new JLabel("TIPO:");
		lblTipo.setBounds(10, 80, 48, 14);
		contentPane.add(lblTipo);
		
		JLabel lblEmail = new JLabel("E-MAIL:");
		lblEmail.setBounds(10, 111, 48, 14);
		contentPane.add(lblEmail);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBackground(Color.BLACK);
		btnVoltar.setBounds(10, 361, 240, 38);
		contentPane.add(btnVoltar);
		
		
		
		
		
		
		
	
	}
}
