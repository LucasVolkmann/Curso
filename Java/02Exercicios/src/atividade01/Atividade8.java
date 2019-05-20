package atividade01;

import javax.swing.JOptionPane;

public class Atividade8 {

	public static void main(String[] args) {
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro número"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo número"));
		String tipo = JOptionPane.showInputDialog("Tipo de conta a se fazer");
		
		if(tipo.equals("Soma")) {
			System.out.println("O resultado é "+(n1+n2));
		}else if(tipo.equals("Subtração")) {
			System.out.println("O resultado é "+(n1-n2));
		}else if(tipo.equals("Divisão")) {
			System.out.println("O resultado é "+(n1/n2));
		}else if(tipo.equals("Multiplicação")) {
			System.out.println("O resultado é "+(n1*n2));
		}
			
		
	}

}
