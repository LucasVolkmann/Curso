package atividade01;

import javax.swing.JOptionPane;

public class Atividade35 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome");
		double sal = Double.parseDouble(JOptionPane.showInputDialog("Salário Bruto"));
		double fal = Double.parseDouble(JOptionPane.showInputDialog("Faltas"));
		double vale = sal*0.06;
		double inss=0, bon=0;
		
		if(sal >= 6000) {
			inss = sal*0.14;
		}else if(sal >= 3500) {
			inss = sal*0.11;
		}else if(sal >= 2000) {
			inss = sal*0.08;
		}else if(sal >= 937.01) {
			inss = sal*0.05;
		}else if(sal <= 937) {
			inss = 0;
		}
		
		if (fal == 0) {
			bon = 100;
		}else if (fal >= 1) {
			bon = -50;
		}else if(fal > 5) {
			bon = -150;
		}
			
		System.out.println(nome+" Salário líquido R$:"+(sal-inss-vale+bon));
		
	}

}
