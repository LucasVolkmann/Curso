package atividade01;

import javax.swing.JOptionPane;

public class Atividade9 {

	public static void main(String[] args) {
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro n�mero"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo n�mero"));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Terceiro n�mero"));
		
		if((n1 < n2) && (n1 < n3)) {
			System.out.println("O menor n�mero � "+n1);
		}else if((n2 < n1) && (n2 < n3)) {
			System.out.println("O menor n�mero � "+n2);
		}else {
			System.out.println("O menor n�mero � "+n3);
		}

	}

}
