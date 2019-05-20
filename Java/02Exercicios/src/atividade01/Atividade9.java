package atividade01;

import javax.swing.JOptionPane;

public class Atividade9 {

	public static void main(String[] args) {
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro número"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo número"));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Terceiro número"));
		
		if((n1 < n2) && (n1 < n3)) {
			System.out.println("O menor número é "+n1);
		}else if((n2 < n1) && (n2 < n3)) {
			System.out.println("O menor número é "+n2);
		}else {
			System.out.println("O menor número é "+n3);
		}

	}

}
