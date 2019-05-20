package atividade01;

import javax.swing.JOptionPane;

public class Atividade7 {

	public static void main(String[] args) {
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(valor+" x "+i+" = "+(valor*i));
		}

	}

}
