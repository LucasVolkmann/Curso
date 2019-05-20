package exercicio02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String palavra = JOptionPane.showInputDialog("Digite sua palavra ou frase:");
		String teste="";
		int vogal=0;
		for(int i=0;i<palavra.length();i++) {
			teste+= palavra.charAt(i);
			if(teste.contentEquals("a")||teste.contentEquals("e")||teste.contentEquals("i")||teste.contentEquals("o")||teste.contentEquals("u")) {
				vogal++;
			}
			teste="";
		}
	JOptionPane.showMessageDialog(null, "Quantidade de vogais = "+vogal);
	}

}
