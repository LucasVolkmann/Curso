package atividade01;

import javax.swing.JOptionPane;

public class Atividade20 {

	public static void main(String[] args) {
		
		double est = Double.parseDouble(JOptionPane.showInputDialog("Escolha um Estado:\n1 - SC\n2 - RS\n3 - SP"));	
		
		if(est == 1) {
			double cid = Double.parseDouble(JOptionPane.showInputDialog("Escolha uma Cidade:\n1 - Blumenau\n2 - Chapec�\n3 - Rio do Sul"));
			if(cid == 1) {
				System.out.println("Principal festa: Oktoberfest");
			}else if(cid == 2) {
				System.out.println("IDH: 0,790");
			}else if(cid == 3) {
				System.out.println("Popula��o: 66.255");
			}else {
				System.out.println("Op��o Inv�lida");
			}
			
		}else if(est == 2) {
			double cid2 = Double.parseDouble(JOptionPane.showInputDialog("Escolha uma Cidade:\n1 - Gramado\n2 - Canela\n3 - Porto Alegre"));
			if(cid2 == 1) {
				System.out.println("Popula��o: 35.047");
			}else if(cid2 == 2) {
				System.out.println("�rea: 254,6 km�");
			}else if(cid2 == 3) {
				System.out.println("IDH: 0,805");
			}else {
				System.out.println("Op��o Inv�lida");
			}
		}else if(est == 3) {
			double cid3 = Double.parseDouble(JOptionPane.showInputDialog("Escolha uma Cidade:\n1 - S�o Paulo\n2 - Bauru\n3 - Santos"));
			if(cid3 == 1) {
				System.out.println("Popula��o: 14,71 milh�es");
			}else if(cid3 == 2) {
				System.out.println("�rea: 673,5 km�");
			}else if(cid3 == 3) {
				System.out.println("IDH: 0,840");
			}
		}else {
			System.out.println("Op��o Inv�lida");
		}
		
	}

}
