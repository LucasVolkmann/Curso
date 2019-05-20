package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioEstatisticas extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public FormularioEstatisticas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEstatsticas = new JLabel("Estat\u00EDsticas");
		lblEstatsticas.setFont(new Font("Times New Roman", Font.BOLD, 45));
		lblEstatsticas.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstatsticas.setBounds(10, 11, 319, 74);
		contentPane.add(lblEstatsticas);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(328, 37, 100, 30);
		contentPane.add(btnNewButton);
	}
}
