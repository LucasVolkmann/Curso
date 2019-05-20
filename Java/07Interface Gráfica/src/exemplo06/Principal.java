package exemplo06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		JFrame formulario = new JFrame();
		formulario.setTitle("Meu sexto formulário");
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton teste = new JButton();
		teste.setBounds(10, 10, 110, 20);
		teste.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "tao");
				
			}
		});
		
		
		
		//JCheckbox
		JCheckBox ckb01 = new JCheckBox("Opção 01");
		ckb01.setBounds(10, 10, 100, 20);
		
		JCheckBox ckb02 = new JCheckBox("Opção 02");
		ckb02.setBounds(10, 40, 100, 20);
		
		JCheckBox ckb03 = new JCheckBox("Opção 03");
		ckb03.setBounds(10, 70, 100, 20);
		
		//botao
		JButton botao = new JButton("Verificar opções ativas");
		botao.setBounds(10, 110, 200, 30);
		
		//Ação do botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(ckb01.isSelected()) {
				JOptionPane.showMessageDialog(null, "Primeira opção selecionada");
				}
				if(ckb02.isSelected()) {
					JOptionPane.showMessageDialog(null, "Segunda opção selecionada");
				}
				if(ckb03.isSelected()) {
					JOptionPane.showMessageDialog(null, "Terceira opção selecionada");
				}
			}
		});
		
		
		
		//ADD
		formulario.add(ckb01);
		formulario.add(ckb02);
		formulario.add(ckb03);
		formulario.add(botao);
		formulario.add(teste);
		
		
		
		//Exibir componentes
		formulario.setVisible(true);
		
		
	}

}
