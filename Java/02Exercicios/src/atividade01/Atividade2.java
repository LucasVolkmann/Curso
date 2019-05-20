package atividade01;

import javax.swing.JOptionPane;

public class Atividade2 {

	public static void main(String[] args) {
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser pago"));
		
		System.out.println("Desconto de 10%, total R$ "+valor*0.9);

	}

}
