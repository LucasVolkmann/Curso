package exemplo03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		//Criar
				JFrame formulario = new JFrame();
				formulario.setTitle("Meu terceiro formul�rio");
				formulario.setSize(500, 180);
				formulario.setLocationRelativeTo(null);
				formulario.setLayout(null);
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				
				//Criar um rotulo
				JLabel rotulo = new JLabel();
				rotulo.setBounds(30, 30, 150, 20);
				rotulo.setText("Informe seu nome:");
				
				//Criar um campo de texto
				JTextField campo =new JTextField();
				campo.setBounds(150, 30, 290, 20);
				
				//Criar um bot�o
				JButton botao = new JButton();
				botao.setText("Enviar");
				botao.setBounds(190, 70, 100, 30);
				
				//Ac�o do bot�o
				botao.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
							//Obter nome inf
							String nome = campo.getText();
						
							//Exibir uma mensagem
							JOptionPane.showMessageDialog(null, "Ol� "+nome);
							
							//Limpar o campo de texto
							campo.setText("");
							
							//Deixar o cursor selecionado no campo
							campo.requestFocus();
							
							formulario.setVisible(false);
					}
				});
				
				
				//Adicionar elementos ao formul�rio
				formulario.add(rotulo);
				formulario.add(campo);
				formulario.add(botao);
				
				//EXIBIR
				formulario.setVisible(true);

	}

}
