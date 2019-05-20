package atividade01;

import javax.swing.JOptionPane;

public class Atividade18 {

	public static void main(String[] args) {
		
		double le = Double.parseDouble(JOptionPane.showInputDialog("Esquerdo"));
		double ld = Double.parseDouble(JOptionPane.showInputDialog("Direito"));
		double li = Double.parseDouble(JOptionPane.showInputDialog("Interno"));
		
		if((le+ld < li) || (le+li < ld) || (ld+li < le)) {
			System.out.println("Não é um triângulo");
		}else if((le == ld) && (le == li)) {
			System.out.println("Eqüilátero");
		}else if((le == ld) || (le == li)) {
			System.out.println("Isósceles");
		}else {
			System.out.println("Escaleno");
		}
		

	}

}
