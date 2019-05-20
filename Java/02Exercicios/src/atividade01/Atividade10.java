package atividade01;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Atividade10 {

	public static void main(String[] args) {
		
		double m1 = 0.01, m2 = 0.05, m3 = 0.10, m4 = 0.25, m5 = 0.50, m6 = 1.00;
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Qtde de moedas de 1 centavo"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Qtde de moedas de 5 centavos"));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Qtde de moedas de 10 centavos"));
		int valor4 = Integer.parseInt(JOptionPane.showInputDialog("Qtde de moedas de 25 centavos"));
		int valor5 = Integer.parseInt(JOptionPane.showInputDialog("Qtde de moedas de 50 centavos"));
		int valor6 = Integer.parseInt(JOptionPane.showInputDialog("Qtde de moedas de 1 real"));
		
		double total = ((m1*valor1)+(m2*valor2)+(m3*valor3)+(m4*valor4)+(m5*valor5)+(m6*valor6));
		
		//Formatar casas decimais
		DecimalFormat df = new DecimalFormat("#.00");
		String totalFormatado = df.format(total);
		
		System.out.println("Total R$ "+totalFormatado);

	}

}
