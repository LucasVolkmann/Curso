package atividade01;

import javax.swing.JOptionPane;

public class Atividade32 {

	public static void main(String[] args) {
		
		double or = Double.parseDouble(JOptionPane.showInputDialog("Orçamento"));
		
		System.out.println("5% - 30 Dias: R$"+(or*1.05)+"\n10% - 60 Dias: R$"+(or*1.1)+"\n20% 90 Dias: R$"+(or*1.2)+"\n30% - 120 Dias: R$"+(or*1.3)+"\n40% - 180 Dias: R$"+(or*1.4)+"\n50% - 270 Dias: R$"+(or*1.5));
		
	}

}
