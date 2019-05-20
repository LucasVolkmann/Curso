package exemplo04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		JFrame formulario = new JFrame();
		formulario.setTitle("Meu quarto formul�rio");
		formulario.setSize(500, 100);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Criar uma caixa de combina��o
		JComboBox<String> opcoes = new JComboBox<String>();
		opcoes.setBounds(10, 10, 300, 30);
		opcoes.addItem("Op��o 1");
		opcoes.addItem("Op��o 2");
		opcoes.addItem("Op��o 3");
		opcoes.addItem("Op��o 4");
		opcoes.addItem("Op��o 5");
		
		//Bpt�o
		JButton botao = new JButton();
		botao.setText("Enviar");
		botao.setBounds(330, 10, 140, 30);
		
		//A��o do bot�o
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Obter a op��o selecionada
				String opcao = opcoes.getSelectedItem().toString();
				
				//EXIBIR A OP��O
				JOptionPane.showMessageDialog(null, opcao);
				
			}
		});
		
		//Add elemwnto ao formulario
		formulario.add(opcoes);
		formulario.add(botao);
		
		
		
		//Exibir componentes
		formulario.setVisible(true);
		
		
		
		
	}

}
