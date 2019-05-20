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
		formulario.setTitle("Meu quarto formulário");
		formulario.setSize(500, 100);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Criar uma caixa de combinação
		JComboBox<String> opcoes = new JComboBox<String>();
		opcoes.setBounds(10, 10, 300, 30);
		opcoes.addItem("Opção 1");
		opcoes.addItem("Opção 2");
		opcoes.addItem("Opção 3");
		opcoes.addItem("Opção 4");
		opcoes.addItem("Opção 5");
		
		//Bptão
		JButton botao = new JButton();
		botao.setText("Enviar");
		botao.setBounds(330, 10, 140, 30);
		
		//Ação do botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Obter a opção selecionada
				String opcao = opcoes.getSelectedItem().toString();
				
				//EXIBIR A OPÇÃO
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
