package formulario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import array.Array;
import beans.Beans;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtSenha;
	private JTextField txtNome;

	/**
	 * Create the frame.
	 */
	public Formulario() {
		
		Acao a = new Acao();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(99, 108, 220, 27);
		contentPane.add(txtSenha);
		
		txtNome = new JTextField();
		txtNome.setBounds(99, 70, 220, 27);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 26));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(10, 11, 334, 48);
		contentPane.add(lblLogin);
		
		JLabel lblUsu = new JLabel("Usu\u00E1rio:");
		lblUsu.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsu.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 16));
		lblUsu.setBounds(10, 70, 92, 27);
		contentPane.add(lblUsu);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 16));
		lblSenha.setBounds(10, 108, 92, 27);
		contentPane.add(lblSenha);
		
		JLabel lblIndice = new JLabel("");
		lblIndice.setBounds(10, 336, 48, 14);
		lblIndice.setVisible(false);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Beans b = new Beans();
				b.setNome(txtNome.getText());
				b.setSenha(String.valueOf(txtSenha.getPassword()));
				if(a.login(b)) {
					Array.vetorJogos.get(a.indicar(b)).setValid(1);
					FormularioMenu m = new FormularioMenu();
					m.setVisible(true);
					dispose();	
				}else
					JOptionPane.showMessageDialog(null, "Credenciais Incorretas!");
			}
		});
		btnNewButton.setBounds(103, 158, 148, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblPin = new JLabel("");
		lblPin.setHorizontalAlignment(SwingConstants.CENTER);
		lblPin.setBounds(296, 146, 48, 14);
		contentPane.add(lblPin);
		
		JButton button_8 = new JButton("1");
		button_8.setHorizontalAlignment(SwingConstants.LEFT);
		button_8.setFont(new Font("Times New Roman", Font.PLAIN, 5));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_8.setBounds(289, 160, 16, 16);
		contentPane.add(button_8);
		
		JButton button_6 = new JButton("2");
		button_6.setHorizontalAlignment(SwingConstants.LEFT);
		button_6.setFont(new Font("Times New Roman", Font.PLAIN, 5));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_6.setBounds(314, 160, 16, 16);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("3");
		button_7.setHorizontalAlignment(SwingConstants.LEFT);
		button_7.setFont(new Font("Times New Roman", Font.PLAIN, 5));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_7.setBounds(339, 160, 16, 16);
		contentPane.add(button_7);
		
		JButton button_5 = new JButton("4");
		button_5.setHorizontalAlignment(SwingConstants.LEFT);
		button_5.setFont(new Font("Times New Roman", Font.PLAIN, 5));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_5.setBounds(289, 183, 16, 16);
		contentPane.add(button_5);
		
		JButton button_3 = new JButton("5");
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		button_3.setFont(new Font("Times New Roman", Font.PLAIN, 5));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(314, 183, 16, 16);
		contentPane.add(button_3);
		
		JButton button_2 = new JButton("7");
		button_2.setHorizontalAlignment(SwingConstants.LEFT);
		button_2.setFont(new Font("Times New Roman", Font.PLAIN, 5));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(289, 206, 16, 16);
		contentPane.add(button_2);
		
		JButton button_4 = new JButton("6");
		button_4.setHorizontalAlignment(SwingConstants.LEFT);
		button_4.setFont(new Font("Times New Roman", Font.PLAIN, 5));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setBounds(339, 183, 16, 16);
		contentPane.add(button_4);
		
		JButton button_1 = new JButton("9");
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		button_1.setFont(new Font("Times New Roman", Font.PLAIN, 5));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton button = new JButton("8");
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setFont(new Font("Times New Roman", Font.PLAIN, 5));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(314, 206, 16, 16);
		contentPane.add(button);
		button_1.setBounds(339, 206, 16, 16);
		contentPane.add(button_1);
		
		
		
	}
}
