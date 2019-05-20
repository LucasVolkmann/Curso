package atividade01;

import javax.swing.JOptionPane;

public class Atividade3 {

	public static void main(String[] args) {
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quarta nota"));
		double media = (nota1 + nota2 + nota3 + nota4) / 4 ;
				
			if(media >= 7) {
				System.out.println("Aprovado com média "+media);
			}else if(media >= 5) {
				System.out.println("Em exame com média "+media);
			}else if(media <= 4.9) {
				System.out.println("Reprovado com média "+media);
			}
	}

}
