package atividade01;

import javax.swing.JOptionPane;

public class Atividade15 {

	public static void main(String[] args) {
		
		double s = Double.parseDouble(JOptionPane.showInputDialog("Escolha a opção: 1-Apto Simples, 2-Apto Duplo, 3-Suito Luxo"));
		double dias = Double.parseDouble(JOptionPane.showInputDialog("Quantos dias ficará hospedado?"));
		
		if(s == 1) {
			System.out.println("Valor total: R$"+(dias*45));
		}else if(s == 2) {
			System.out.println("Valor total: R$"+(dias*65));
		}else if(s == 3) {
			System.out.println("Valor total: R$"+(dias*110));
		}else {
			System.out.println("Opção Inválida");
		}
 		
	}

}
