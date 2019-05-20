package atividade01;

import javax.swing.JOptionPane;

public class Atividade12 {

	public static void main(String[] args) {
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Velocidade máxima permitida"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Velocidade do veículo"));
		double dif = (n2-n1);
		
		if(dif <= 0) {
			System.out.println("Bom motorista");
		}else if(dif >= 30) {
			System.out.println("Multa: R$200" );
		}else if(dif >= 11) {
			System.out.println("Multa: R$100");
		}else if(dif >= 1) {
			System.out.println("Multa: R$50");
		}
	}

}
