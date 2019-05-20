package atividade01;

import javax.swing.JOptionPane;

public class Atividade11 {

	public static void main(String[] args) {
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quarta nota"));
		double faltas = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de faltas"));
		double media = (nota1 + nota2 + nota3 + nota4) / 4 ;
		
				
			if((media == 10) && (faltas <= 15)) {
				System.out.println("Parabéns");
			}else if((media >= 9) && (faltas <= 15)) {
				System.out.println("Ótimo");
			}else if((media >= 7) && (faltas <= 15)) {
				System.out.println("Bom");
			}else if((media >= 5.1) && (faltas <= 15)) {
				System.out.println("Em Exame");
			}else if((media <= 5) && (faltas <= 15)) {
				System.out.println("Reprovado");
			}
			if(faltas > 15) {
				System.out.println("Reprovado");
			}
	}

}
