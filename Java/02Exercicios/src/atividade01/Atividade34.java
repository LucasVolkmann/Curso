package atividade01;

import javax.swing.JOptionPane;

public class Atividade34 {

	public static void main(String[] args) {
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor investido"));
		
		System.out.println("Lucro Poupança: R$ "+valor*0.044);
		System.out.println("Lucro CDB: R$ "+valor*0.0465);
		System.out.println("Lucro LCI: R$ "+valor*0.058);
	}

}
