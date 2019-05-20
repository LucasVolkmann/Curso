package atividade01;

import javax.swing.JOptionPane;

public class Atividade5 {

	public static void main(String[] args) {
		
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia de hoje"));
		
		if ((dia < 0) || (dia > 28)) {
			System.out.println("Data Inválida");
		}else if((dia == 3) || (dia == 4) || (dia == 10) || (dia == 11) || (dia == 17) || (dia == 18) || (dia == 24) || (dia == 25)) {
			System.out.println("Final de semana");
		}else {
			System.out.println("Dia de semana");
		}
		
	}

}
