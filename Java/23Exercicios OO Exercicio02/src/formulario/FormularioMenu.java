package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import array.Array;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioMenu extends JFrame {

	private JPanel contentPane;
	
	public FormularioMenu() {
		
		Acao a = new Acao();
		
		int indicar=0;
		for(int i=0;i<Array.vetorJogos.size();i++) {
			if(Array.vetorJogos.get(i).getValid()==1) {
				indicar=i;
				break;
			}
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAlterarMeus = new JButton("Alterar meus dados");
		if(indicar==0) {
		btnAlterarMeus.setEnabled(false);	
		}
		btnAlterarMeus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FormularioEditar fe = new FormularioEditar();
				fe.setVisible(true);
			}
		});
		btnAlterarMeus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAlterarMeus.setBounds(82, 105, 160, 42);
		btnAlterarMeus.setBackground(Color.BLACK);
		btnAlterarMeus.setContentAreaFilled(false);
		contentPane.add(btnAlterarMeus);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCadastrar.setBackground(Color.BLACK);
		btnCadastrar.setContentAreaFilled(false);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormularioCadastrar c = new FormularioCadastrar();
				c.setVisible(true);
	
			}
		});
		btnCadastrar.setBounds(82, 52, 160, 42);
		btnCadastrar.setEnabled(a.adm(indicar));
		contentPane.add(btnCadastrar);
		
		JLabel lblBemvindo = new JLabel("Bem vindo "+Array.vetorJogos.get(indicar).getNome());
		lblBemvindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBemvindo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblBemvindo.setBounds(10, 11, 304, 30);
		contentPane.add(lblBemvindo);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 304, 30);
		contentPane.add(panel);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<Array.vetorJogos.size();i++) {
					if(Array.vetorJogos.get(i).getValid()==1) {
						Array.vetorJogos.get(i).setValid(0);
					break;
					}
				}
				Formulario m = new Formulario();
				m.setVisible(true);
				dispose();
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSair.setContentAreaFilled(false);
		btnSair.setBackground(Color.BLACK);
		btnSair.setBounds(92, 320, 140, 30);
		contentPane.add(btnSair);
		
		JButton btnListar = new JButton("Listar");
		if(a.adm(indicar)) {
			btnListar.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				
				FormularioListar l = new FormularioListar();
				l.setVisible(true);

			}
		});
		}else {
			btnListar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					
					FormularioListarSimples l = new FormularioListarSimples();
					l.setVisible(true);

				}
			});
		}
		btnListar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnListar.setContentAreaFilled(false);
		btnListar.setBackground(Color.BLACK);
		btnListar.setBounds(82, 158, 160, 42);
		contentPane.add(btnListar);

		
	}
}
