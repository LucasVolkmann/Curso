package atividade01;

import javax.swing.JOptionPane;

public class Atividade13 {

	public static void main(String[] args) {
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe um número"));
		double res = (n1 + 1);
		double res2 = (n1 -1);
		
		System.out.println("Sucessor: "+res);
		System.out.println("Antecessor "+res2);
	}

}
