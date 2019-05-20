package exercicio02;

import java.text.DecimalFormat;
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Random gerar = new Random();
		String[][] painel = new String[5][30];
		int numero= gerar.nextInt(10);
		for(int i=0;i<5;i++) {
			for(int i2=0;i2<30;i2++) {
				if(i==0||i==4) {
					painel[i][i2]="*";
				}else if(i==2&&i2==15) {
				painel[i][i2]=""+numero;
				}else if(i2==0||i2==29) {
					painel[i][i2]="*";
				}else {
					painel[i][i2]=" ";
				}
			}
		
		}
		String resultado="";
		for(int i=0;i<5;i++) {
			for(int i2=0;i2<30;i2++) {
				resultado+=painel[i][i2];
			}
			resultado+="\n";
		}
		System.out.println(resultado);
		
	}

}
