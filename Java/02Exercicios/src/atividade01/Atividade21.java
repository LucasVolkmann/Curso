package atividade01;

import javax.swing.JOptionPane;

public class Atividade21 {

	public static void main(String[] args) {
		
		double pro = Double.parseDouble(JOptionPane.showInputDialog("Produto:\n1 - Calça\n2 - Camisa\n3 - Casaco\n4 - Meias\n5 - Paletó"));
		
		if(pro == 1) {
			double forma = Double.parseDouble(JOptionPane.showInputDialog("Forma de Pagamento:\n1 - Á Vista\n2 - Prazo 30 dias\n3 - Prazo 60 dias"));
			if(forma == 1) {
				System.out.println("Calça: R$ 150,00");
			}else if(forma == 2) {
				System.out.println("Calça: R$ 165,00");
			}else if(forma == 3) {
				System.out.println("Calça: R$ 180,00");
			}else {
				System.out.println("Opção Inválida");
			}
		
		}else if(pro == 2) {
			double forma2 = Double.parseDouble(JOptionPane.showInputDialog("Forma de Pagamento:\n1 - Á Vista\n2 - Prazo 30 dias\n3 - Prazo 60 dias"));
			if (forma2 == 1) {
				System.out.println("Camisa: R$ 300,00");
			}else if(forma2 == 2) {
				System.out.println("Camisa: R$ 330,00");
			}else if(forma2 == 3) {
				System.out.println("Camisa: R$ 360,00");
			}else {
				System.out.println("Opção Inválida");
			}
			
		}else if(pro == 3) {
			double forma3 = Double.parseDouble(JOptionPane.showInputDialog("Forma de Pagamento:\n1 - Á Vista\n2 - Prazo 30 dias\n3 - Prazo 60 dias"));
			if (forma3 == 1) {
				System.out.println("Casaco: R$ 250,00");
			}else if(forma3 == 2) {
				System.out.println("Casaco: R$ 275,00");
			}else if(forma3 == 3) {
				System.out.println("Casaco: R$ 300,00");
			}else {
				System.out.println("Opção Inválida");
			}
			
		}else if(pro == 4) {
			double forma4 = Double.parseDouble(JOptionPane.showInputDialog("Forma de Pagamento:\n1 - Á Vista\n2 - Prazo 30 dias\n3 - Prazo 60 dias"));
			if (forma4 == 1) {
				System.out.println("Meias: R$ 30,00");
			}else if(forma4 == 2) {
				System.out.println("Meias: R$ 33,00");
			}else if(forma4 == 3) {
				System.out.println("Meias: R$ 36,00");
			}else {
				System.out.println("Opção Inválida");
			}
			
		}else if(pro == 5) {
			double forma5 = Double.parseDouble(JOptionPane.showInputDialog("Forma de Pagamento:\n1 - Á Vista\n2 - Prazo 30 dias\n3 - Prazo 60 dias"));
			if (forma5 == 1) {
				System.out.println("Paletó: R$ 450,00");
			}else if(forma5 == 2) {
				System.out.println("Paletó: R$ 495,00");
			}else if(forma5 == 3) {
				System.out.println("Paletó: R$ 540,00");
			}else {
				System.out.println("Opção Inválida");
			}
			
		}
		
	}

}
