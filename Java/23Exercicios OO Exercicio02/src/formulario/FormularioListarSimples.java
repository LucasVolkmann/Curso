package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;

import javax.swing.JScrollPane;
import javax.swing.JTable;

public class FormularioListarSimples extends JFrame {

	private JPanel contentPane;
	private JTable table;


	/**
	 * Create the frame.
	 */
	public FormularioListarSimples() {
		
		Acao a = new Acao();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 614, 389);
		contentPane.add(scrollPane);
		
		table = new JTable(a.selecionar());
		scrollPane.setViewportView(table);
	}
}
