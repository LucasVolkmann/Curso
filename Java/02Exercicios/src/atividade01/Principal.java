package atividade01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Informe o seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		String cidade = JOptionPane.showInputDialog("Informe a cidade que voc� mora");
		
		System.out.println("Ol� "+nome+", voc� tem "+idade+" anos de idade e mora em "+cidade+".");

	}

}
