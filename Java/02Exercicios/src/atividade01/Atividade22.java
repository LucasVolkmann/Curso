package atividade01;

import javax.swing.JOptionPane;

public class Atividade22 {

	public static void main(String[] args) {
		
		double ld = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro lado"));
		double ld2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo lado"));
		double ld3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o terceiro lado"));
		double ld4 = Double.parseDouble(JOptionPane.showInputDialog("Informe o quarto lado"));
		
		if((ld == ld2) && (ld == ld3) && (ld == ld4)) {
			System.out.println("O objeto analisado � um quadrado");
		}else {
			System.out.println("O objeto n�o � um quadrado");
		}
		
	}

}
