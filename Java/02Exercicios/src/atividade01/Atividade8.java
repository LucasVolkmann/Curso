package atividade01;

import javax.swing.JOptionPane;

public class Atividade8 {

	public static void main(String[] args) {
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro n�mero"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo n�mero"));
		String tipo = JOptionPane.showInputDialog("Tipo de conta a se fazer");
		
		if(tipo.equals("Soma")) {
			System.out.println("O resultado � "+(n1+n2));
		}else if(tipo.equals("Subtra��o")) {
			System.out.println("O resultado � "+(n1-n2));
		}else if(tipo.equals("Divis�o")) {
			System.out.println("O resultado � "+(n1/n2));
		}else if(tipo.equals("Multiplica��o")) {
			System.out.println("O resultado � "+(n1*n2));
		}
			
		
	}

}
