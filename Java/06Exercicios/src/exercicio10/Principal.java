package exercicio10;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int[][]dez = new int[5][5];
				
		String letraF="";							
		int letraA=0,letraB=0,letraC=0,letraD=0,letraE=0;
		for(int i=0;i<5;i++) {
			for(int i2=0;i2<5;i2++) {
				dez[i][i2]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+"ª Coluna "+(i2+1)+"ª Linha"));
			}
		}
		for(int i=0;i<5;i++) {
			letraA+=dez[i][3];
		}
		for(int i=0;i<5;i++) {
			letraB+=dez[2][i];
		}
		for(int i=0;i<5;i++) {
			letraC+=dez[i][i];
		}
		for(int i=4;i>=0;i--) {
			letraD+=dez[i][i];
		}
		for(int i=0;i<5;i++) {
			for(int i2=0;i2<5;i2++) {
			letraE+=dez[i][i2];
			}
		}
		for(int i=0;i<5;i++) {
			for(int i2=0;i2<5;i2++) {
			letraF+=dez[i2][i]+" | ";
			}
		letraF+="\n";
		}
		System.out.println("A)"+letraA+"\nB)"+letraB+"\nC)"+letraC+"\nD)"+letraD+"\nE)"+letraE+"\nF)\n"+letraF);

	}

}
