package atividade01;

import javax.swing.JOptionPane;

public class Atividade28 {

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
		
		if(n1 %2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("�mpar");
		}
		
	}

}
