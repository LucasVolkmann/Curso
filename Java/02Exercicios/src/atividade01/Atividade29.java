package atividade01;

import javax.swing.JOptionPane;

public class Atividade29 {

	public static void main(String[] args) {
		
		double h = Double.parseDouble(JOptionPane.showInputDialog("Que horas são"));
		double p = Double.parseDouble(JOptionPane.showInputDialog("Escolha um país:\n1 - Polônia\n2 - EUA\n3 - Japão"));
		
		if(p == 1) {
			System.out.println("Polônia: "+(h+5)+" Hrs");
		}else if(p == 2) {
			System.out.println("EUA: "+(h-3)+" Hrs");
		}else if(p == 3) {
			System.out.println("Japão "+(h+12)+" Hrs");
		}
				
		
	}

}
