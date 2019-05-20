package atividade01;

import javax.swing.JOptionPane;

public class Atividade33 {

	public static void main(String[] args) {
		
		double dia = Double.parseDouble(JOptionPane.showInputDialog("Dia"));
		double mes = Double.parseDouble(JOptionPane.showInputDialog("Mês"));
		
		if(((mes == 1) && (dia >= 20) && (dia <= 31))||((mes == 2) && (dia >= 1) && (dia <= 18))) {
			System.out.println("Aquário");
		}else if(((mes == 2) && (dia >= 19) && (dia <= 28))||((mes == 3) && (dia >= 1) && (dia <= 20))) {
			System.out.println("Peixes");
		}else if(((mes == 3) && (dia >= 21) && (dia <= 31))||((mes == 4) && (dia >= 1) && (dia <= 19))) {
			System.out.println("Áries");
		}else if(((mes == 4) && (dia >= 20) && (dia <= 30))||((mes == 5) && (dia >= 1) && (dia <= 20))) {
			System.out.println("Touro");
		}else if(((mes == 5) && (dia >= 21) && (dia <= 31))||((mes == 6) && (dia >= 1) && (dia <= 20))) {
			System.out.println("Gemêos");
		}else if(((mes == 6) && (dia >= 21) && (dia <= 30))||((mes == 7) && (dia >= 1) && (dia <= 22))) {
			System.out.println("Câncer");
		}else if(((mes == 7) && (dia >= 23) && (dia <= 31))||((mes == 8) && (dia >= 1) && (dia <= 22))) {
			System.out.println("Leão");
		}else if(((mes == 8) && (dia >= 23) && (dia <= 31))||((mes == 9) && (dia >= 1) && (dia <= 18))) {
			System.out.println("Virgem");
		}else if(((mes == 9) && (dia >= 23) && (dia <= 30))||((mes == 10) && (dia >= 1) && (dia <= 22))) {
			System.out.println("Libras");
		}else if(((mes == 10) && (dia >= 23) && (dia <= 31))||((mes == 11) && (dia >= 1) && (dia <= 21))) {
			System.out.println("Escorpião");
		}else if(((mes == 11) && (dia >= 22) && (dia <= 30))||((mes == 12) && (dia >= 1) && (dia <= 21))) {
			System.out.println("Sagitário");
		}else if(((mes == 12) && (dia >= 22) && (dia <= 31))||((mes == 1) && (dia >= 1) && (dia <= 19))) {
			System.out.println("Capricórnio");
		}else {
			System.out.println("Data Inválida");
		}
		
	}

}
