package exemplo02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Vetor 
		String[] nomes = new String[3];
		
		//obter os 3 nomes
		for(int i=0;i<3;i++) {
			nomes[i] = JOptionPane.showInputDialog((i+1)+"º nome");
		}
		
		//foreach - esecuta cada posição
		for(String elemento : nomes) {
			System.out.println(elemento);
		}
		
		
		
		
		
		
		
		
		
	}

}
