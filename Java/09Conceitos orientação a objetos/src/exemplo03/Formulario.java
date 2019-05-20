package exemplo03;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Formulario {

	//Método para exibir um JFrame
	void formulario() {
		
		JFrame f = new JFrame("Meu formulario");
		f.setSize(500, 300);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(painel1());
		f.setVisible(true);
		
		
	}
	
	//Método para o JPanel
	JPanel painel1() {
		
		JPanel p =new JPanel();
		p.setBounds(10, 10, 464, 240);
		p.setBackground(Color.black);
		p.setLayout(null);
		
		JButton btn;
		for(int i=0; i<3; i++) {
			btn = new JButton();
			btn.setBounds(i, i*50, 100, 20);
			btn.setText("Botão "+(i+1));
			p.add(btn);
		}
		
		
		
		
		return p;
	
	}
	
}
