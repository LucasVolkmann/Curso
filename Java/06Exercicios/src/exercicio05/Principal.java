package exercicio05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
			int[]numeros = new int[15];
			String resposta;
			JOptionPane.showMessageDialog(null, "Digite os 15 Números");
			for(int i=0;i<15;i++) {
				numeros[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+"º Número"));
			}
			//SOMA e MEDIA:
			int soma=0;
			for(int i=0;i<15;i++) {
				soma+=numeros[i];
			}
			int media=soma/15;
//---------------------------------------------------------------//			
			int par=0,impar=0,negativos=0,positivos=0,neutros=0,C=0,menornumero=numeros[0],maiorNUMERO=numeros[0];
			for(int i=0;i<15;i++) {
				//C
				if(numeros[i]>=media) {
					C++;
				}
				//D
				if(numeros[i]<0) {
					negativos++;
				}else if(numeros[i]==0) {
					neutros++;
				}else if(numeros[i]>0) {
					positivos++;
				}
				//E
				if(numeros[i]>maiorNUMERO) {
					maiorNUMERO=numeros[i];
				}
				//F
				if(numeros[i]<menornumero) {
					menornumero=numeros[i];
				}
				//G
				if(numeros[i]%2==0) {
				par++;
				}else {
				impar++;
				}
			}	
			System.out.println("A -> "+soma
					+"\nB -> "+media
					+"\nC -> "+C
					+"\nD -> Neg: "+negativos+" Neu: "+neutros+" Pos: "+positivos
					+"\nE -> "+maiorNUMERO
					+"\nF -> "+menornumero
					+"\nG -> "+par
					+"\nH -> "+impar);
	}

}
