package atividades;

import javax.swing.JOptionPane;

public class Atividade9 {

	public static void main(String[] args) {
		
		int n1, n2, par = 0, impar = 0, pos = 0, neg = 0;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro número"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo número"));
	
		if(n1 > n2) {
			for(int indice = n2; indice <= n1; indice++) {
				System.out.println(indice);
				if (n2 < 0) {
					neg++;
				}else {
					pos++;
				}
			}
		}else {
			for(int indice = n1; indice <= n2; indice++) {
				System.out.println(indice);
				if (n1 < 0) {
					neg++;
				}else {
					pos++;
				}
			}
		}
		
		
		
	}
}
