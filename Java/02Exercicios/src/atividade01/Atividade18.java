package atividade01;

import javax.swing.JOptionPane;

public class Atividade18 {

	public static void main(String[] args) {
		
		double le = Double.parseDouble(JOptionPane.showInputDialog("Esquerdo"));
		double ld = Double.parseDouble(JOptionPane.showInputDialog("Direito"));
		double li = Double.parseDouble(JOptionPane.showInputDialog("Interno"));
		
		if((le+ld < li) || (le+li < ld) || (ld+li < le)) {
			System.out.println("N�o � um tri�ngulo");
		}else if((le == ld) && (le == li)) {
			System.out.println("Eq�il�tero");
		}else if((le == ld) || (le == li)) {
			System.out.println("Is�sceles");
		}else {
			System.out.println("Escaleno");
		}
		

	}

}
