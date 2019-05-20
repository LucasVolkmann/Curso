package atividade01;

import javax.swing.JOptionPane;

public class Atividade25 {

	public static void main(String[] args) {
		
		double h = Double.parseDouble(JOptionPane.showInputDialog("Que horas são"));
		
		if((h < 0)||(h > 24)) {
			System.out.println("Hora Inválida");
		}else if(h >= 19) {
			System.out.println("Boa Noite");
		}else if(h >= 12) {
			System.out.println("Boa Tarde");
		}else if(h >= 7) {
			System.out.println("Bom Dia");
		}else if(h <= 6) {
			System.out.println("Boa Madrugada");
		}
		
	}

}
