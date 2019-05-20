package exercicio01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String palavra = JOptionPane.showInputDialog("Infrome uma palavra:");
		String resultado="";
		for(int i=0;i<palavra.length();i++) {
			resultado+=palavra.toUpperCase().charAt(i);
		i++;
			if(i+1>palavra.length()) {
				break;
			}
			resultado+=palavra.toLowerCase().charAt(i);
		}
	JOptionPane.showMessageDialog(null, resultado);
	}

}
