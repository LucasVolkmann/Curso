package atividade01;

import javax.swing.JOptionPane;

public class Atividade24 {

	public static void main(String[] args) {
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número"));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro número"));
		
		if((n1 > n2) && (n1 > n3) && (n2 > n3)) {
			System.out.println(n3+" "+n2+" "+n1);
		}else if((n1 > n2) && (n1 > n3) && (n2 < n3)) {
			System.out.println(n2+" "+n3+" "+n1);
		}else if((n2 > n1) && (n2 > n3) && (n1 < n3)) {
			System.out.println(n1+" "+n3+" "+n2);
		}else if((n2 > n1) && (n2 > n3) && (n3 < n1)) {
			System.out.println(n3+" "+n1+" "+n2);
		}else if((n3 > n1) && (n3 > n2) && (n1 < n2)) {
			System.out.println(n1+" "+n2+" "+n3);
		}else if((n3 > n1) && (n3 > n2) && (n2 < n1)) {
			System.out.println(n2+" "+n1+" "+n3);
		}else {
			System.out.println("Inválido");
		}
		
	}

}
