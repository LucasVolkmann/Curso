package exemplo07;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Operador ternário
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));

		System.out.println(idade >= 18 ? "Maior de idade" : "Menor de idade"); // '?' = então, ':' = senão
		
	}

}
