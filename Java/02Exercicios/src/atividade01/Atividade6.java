package atividade01;

import javax.swing.JOptionPane;

public class Atividade6 {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número"));
		
		if(n1 == n2) {
			System.out.println("A soma dos dois é  "+(n1 + n2));
				
		}else {
			System.out.println(n1+" x "+n2+" = "+(n1 * n2));
		}
		
	}

}
