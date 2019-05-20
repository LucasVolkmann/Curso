package atividade01;

import javax.swing.JOptionPane;

public class Atividade26 {

	public static void main(String[] args) {
		
		String nome1 = JOptionPane.showInputDialog("Nome");
		double id = Double.parseDouble(JOptionPane.showInputDialog("Idade"));
		
		if(id > 90) {
			System.out.println(nome1+": "+id+" Anos: Idoso 3");
		}else if(id >= 76) {
			System.out.println(nome1+": "+id+" Anos: Idoso 2");
		}else if(id >= 61) {
			System.out.println(nome1+": "+id+" Anos: Idoso");
		}else if(id >= 46) {
			System.out.println(nome1+": "+id+" Anos: Adulto");
		}else if(id >= 31) {
			System.out.println(nome1+": "+id+" Anos: Maduro");
		}else if(id >= 15) {
			System.out.println(nome1+": "+id+" Anos: Jovem");
		}else if(id >= 12) {
			System.out.println(nome1+": "+id+" Anos: Adolescente");
		}else if(id >= 5) {
			System.out.println(nome1+": "+id+" Anos: Criança");
		}else if(id <= 4) {
			System.out.println(nome1+": "+id+" Anos: Bebê");
		}
		
	}

}
