package exercicio07SETE;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		
	

		int[]sete= new int[10];
		Random gerar = new Random();
		int cont=5;
		do {
			sete[cont]=gerar.nextInt(10);
			if(sete[cont]!=sete[cont-1]&&sete[cont]!=sete[cont-2]&&sete[cont]!=sete[cont-3]&&sete[cont]!=sete[cont-4]) {
				cont++;
			}else;	
		}while(cont<=9);			
		for(int i =5;i<sete.length;i++) {
			System.out.println(sete[i]);
		}


		
//					EXERCICIO FEITO POELA PRIMEIRA VEZ		
//		/*Random gerar = new Random();
//		= gerar.nextInt(10);*/
//		int[]sete= new int[5];
//		Random gerar = new Random();
//			do {
//				sete[0]=gerar.nextInt(10);
//				sete[1]=gerar.nextInt(10);
//				sete[2]=gerar.nextInt(10);
//				sete[3]=gerar.nextInt(10);
//				sete[4]=gerar.nextInt(10);
//			}while(sete[0]==sete[1]||sete[0]==sete[2]||sete[0]==sete[3]||sete[0]==sete[4]||sete[1]==sete[2]||sete[1]==sete[3]||sete[1]==sete[4]||sete[2]==sete[3]||sete[2]==sete[4]||sete[3]==sete[4]);			
//		for(int i =0;i<sete.length;i++) {
//			System.out.println(sete[i]);
//		}
		
		
	}

}
