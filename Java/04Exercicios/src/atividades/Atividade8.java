package atividades;

import javax.swing.JOptionPane;

public class Atividade8 {

	public static void main(String[] args) {
		
		int n1, n2, total;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro número"));
		
		for(int indice = n1; indice < 1; indice--) {
			n2 = n1*(n1-1);
			System.out.println();
		}
	}

}
