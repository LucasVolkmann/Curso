package exemplo07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Principal {

	public static void main(String[] args) {
		
		JFrame formulario = new JFrame();
		formulario.setTitle("Meu sétimo formulário");
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JRadio Button
		JRadioButton rtb01 = new JRadioButton("Opção 01");
		rtb01.setBounds(10, 10, 100, 20);
		rtb01.setActionCommand("Opção 1 ativa");
		JRadioButton rtb02 = new JRadioButton("Opção 02");
		rtb02.setBounds(10, 40, 100, 20);
		rtb02.setActionCommand("Opção 2 ativa");
		JRadioButton rtb03 = new JRadioButton("Opção 03");
		rtb03.setBounds(10, 70, 100, 20);
		rtb03.setActionCommand("Opção 3 ativa");
		
		//Agrupar JRadio Button
		ButtonGroup bg = new ButtonGroup();
		bg.add(rtb01);
		bg.add(rtb02);
		bg.add(rtb03);
		
		//Botão
		JButton botao = new JButton("Verificar");
		botao.setBounds(10, 110, 150, 20);
		
		//Ação do botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Obter o comando 
				String valor = bg.getSelection().getActionCommand();
				
				//Exibir o valor
				JOptionPane.showMessageDialog(null, valor);
				
			}
		});
		
		//ADD
		formulario.add(rtb01);
		formulario.add(rtb02);
		formulario.add(rtb03);
		formulario.add(botao);
		
		
		
		
		
		
		
		
		
		//Exibir componentes
		formulario.setVisible(true);
		
	}

}
