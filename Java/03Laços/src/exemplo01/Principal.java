package exemplo01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int numero =  Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero"));
		
		String tabuada = "A tabuada de "+numero+" �:";
		
		//La�o
		int indice = 0;
				
		while(indice <= 10) {
			tabuada+= "\n"+numero*indice;
			indice++;
					
		}
				
		JOptionPane.showMessageDialog(null, tabuada);
		
	}

}
