package atividade01;

import javax.swing.JOptionPane;

public class Atividade29 {

	public static void main(String[] args) {
		
		double h = Double.parseDouble(JOptionPane.showInputDialog("Que horas s�o"));
		double p = Double.parseDouble(JOptionPane.showInputDialog("Escolha um pa�s:\n1 - Pol�nia\n2 - EUA\n3 - Jap�o"));
		
		if(p == 1) {
			System.out.println("Pol�nia: "+(h+5)+" Hrs");
		}else if(p == 2) {
			System.out.println("EUA: "+(h-3)+" Hrs");
		}else if(p == 3) {
			System.out.println("Jap�o "+(h+12)+" Hrs");
		}
				
		
	}

}
