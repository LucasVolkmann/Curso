package exemplo05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Variaveis
		String nome1 = JOptionPane.showInputDialog("Informe o nome 1");
		String nome2 = JOptionPane.showInputDialog("Informe o nome 2");
		
		//Comparar variaveis do tipo String
		System.out.println(nome1.equals(nome2));

	}

}
