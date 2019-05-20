package atividade01;

import javax.swing.JOptionPane;

public class Atividade20 {

	public static void main(String[] args) {
		
		double est = Double.parseDouble(JOptionPane.showInputDialog("Escolha um Estado:\n1 - SC\n2 - RS\n3 - SP"));	
		
		if(est == 1) {
			double cid = Double.parseDouble(JOptionPane.showInputDialog("Escolha uma Cidade:\n1 - Blumenau\n2 - Chapecó\n3 - Rio do Sul"));
			if(cid == 1) {
				System.out.println("Principal festa: Oktoberfest");
			}else if(cid == 2) {
				System.out.println("IDH: 0,790");
			}else if(cid == 3) {
				System.out.println("População: 66.255");
			}else {
				System.out.println("Opção Inválida");
			}
			
		}else if(est == 2) {
			double cid2 = Double.parseDouble(JOptionPane.showInputDialog("Escolha uma Cidade:\n1 - Gramado\n2 - Canela\n3 - Porto Alegre"));
			if(cid2 == 1) {
				System.out.println("População: 35.047");
			}else if(cid2 == 2) {
				System.out.println("Área: 254,6 km²");
			}else if(cid2 == 3) {
				System.out.println("IDH: 0,805");
			}else {
				System.out.println("Opção Inválida");
			}
		}else if(est == 3) {
			double cid3 = Double.parseDouble(JOptionPane.showInputDialog("Escolha uma Cidade:\n1 - São Paulo\n2 - Bauru\n3 - Santos"));
			if(cid3 == 1) {
				System.out.println("População: 14,71 milhões");
			}else if(cid3 == 2) {
				System.out.println("Área: 673,5 km²");
			}else if(cid3 == 3) {
				System.out.println("IDH: 0,840");
			}
		}else {
			System.out.println("Opção Inválida");
		}
		
	}

}
