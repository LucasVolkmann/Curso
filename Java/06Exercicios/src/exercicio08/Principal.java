package exercicio08;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int[][]matriz=new int[5][6];
		int DE=0,media=0,somamedia=0,par=0,impar=0;
		for(int i=0;i<5;i++) {
			for(int i2=0;i2<6;i2++) {
				matriz[i][i2]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+"ª Coluna "+(i2+1)+"ª Linha"));
				somamedia+=matriz[i][i2];
				if(matriz[i][i2]%2==0) {
					par++;
				}else {
					impar++;
				}
				
			}
		}
		media=somamedia/30;		
		for(int i=0;i<5;i++) {
			for(int i2=0;i2<6;i2++) {
			
				if(matriz[i][i2]>=media) {
					DE++;
				}				
			}
		}
		String resultado="";
		for(int i=0;i<5;i++) {
			for(int i2=0;i2<6;i2++) {
		
				resultado+=matriz[i][i2]+" ";
			
			}
		resultado+="\n";
		}
		System.out.println("Pares: "+par);
		System.out.println("Ímpares: "+impar);
		System.out.println("Maiores ou iguais a média: "+DE);
		System.out.println("Média: "+media);
		System.out.println(resultado);
	
	
	
	
	}

}
