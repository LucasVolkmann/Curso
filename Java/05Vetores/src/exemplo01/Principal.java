package exemplo01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Vetor ou Array = variavel que engloba vários dados;
		String[] nomes = new String[3];
		
		//Obter os três nomes
		nomes[0] = JOptionPane.showInputDialog("1º nome.");

		nomes[1] = JOptionPane.showInputDialog("2º nome.");

		nomes[2] = JOptionPane.showInputDialog("3º nome.");
	
		//Exibir os três nomes
		JOptionPane.showMessageDialog(null, nomes[0]);
		JOptionPane.showMessageDialog(null, nomes[1]);
		JOptionPane.showMessageDialog(null, nomes[2]);
	}

}
