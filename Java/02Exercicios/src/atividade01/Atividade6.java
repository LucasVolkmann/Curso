package atividade01;

import javax.swing.JOptionPane;

public class Atividade6 {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro n�mero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero"));
		
		if(n1 == n2) {
			System.out.println("A soma dos dois �  "+(n1 + n2));
				
		}else {
			System.out.println(n1+" x "+n2+" = "+(n1 * n2));
		}
		
	}

}
