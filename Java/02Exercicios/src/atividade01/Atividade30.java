package atividade01;

import javax.swing.JOptionPane;

public class Atividade30 {

	public static void main(String[] args) {
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Valor ganho por hora"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Horas trabalhadas de maneira normal"));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Horas extras"));
		
		System.out.println("Salário bruto: R$"+(n1*(n2+(n3*2))));
		
	}

}
