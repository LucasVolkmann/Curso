package atividade01;

import javax.swing.JOptionPane;

public class Atividade27 {

	public static void main(String[] args) {
		
		double ano = Double.parseDouble(JOptionPane.showInputDialog("Ano:"));
		
		if(ano %4 == 0) {
			System.out.println(ano+" � um ano bissexto");
		}else {
			System.out.println(ano+" N�o � um ano bissexto");
		}
		
	}

}
