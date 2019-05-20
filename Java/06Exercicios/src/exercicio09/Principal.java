package exercicio09;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int inversa[][]=new int[3][2];
		int matriz[][]=new int[2][3];
		String resultado="";
		for(int i=0;i<2;i++) {
			for(int i2=0;i2<3;i2++) {
				inversa[i2][i]=Integer.parseInt(JOptionPane.showInputDialog("Número"));	
			}
		}
		for(int i=0;i<2;i++) {
			for(int i2=0;i2<3;i2++) {
				matriz[i][i2]=inversa[i2][i];
			}
		}
		for(int i=0;i<2;i++) {
			for(int i2=0;i2<3;i2++) {
				resultado+=inversa[i2][i]+" ";
			}
		resultado+="\n";
		}
		for(int i2=0;i2<3;i2++) {
			for(int i=0;i<2;i++) {
			resultado+=matriz[i][i2]+" ";
			
			}
		resultado+="\n";
		}
		System.out.println(resultado);
	
	}

}
