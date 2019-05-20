package atividade01;

import javax.swing.JOptionPane;

public class Atividade23 {

	public static void main(String[] args) {
			
		double p = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso"));
		double a = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura"));
		double imc = p / (a*a);
		
		if(imc >= 40) {
			System.out.println("IMC: "+imc+" - Obesidade 3 (Mórbida)");
		}else if(imc >= 35) {
			System.out.println("IMC: "+imc+" - Obesidade 2 (Severa)");
		}else if(imc >= 30) {
			System.out.println("IMC: "+imc+" - Obesidade");
		}else if(imc >= 25) {
			System.out.println("IMC: "+imc+" - Acima do peso");
		}else if(imc >= 18.5) {
			System.out.println("IMC: "+imc+" - Peso normal");
		}else if(imc >= 17) {
			System.out.println("IMC: "+imc+" - Abaixo do peso");
		}else if(imc < 17) {
			System.out.println("IMC: "+imc+" - Muito abaixo do peso");
		}
		
	}

}
