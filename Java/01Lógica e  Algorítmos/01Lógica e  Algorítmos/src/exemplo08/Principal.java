package exemplo08;

public class Principal {

	public static void main(String[] args) {
		
		/*
			Regras de cálculos
			1) Divisão
			2) Multiplicação
			3) Subtração
		  	4) Soma  
		*/
		
		//Condicional Composta
		double nota1 = 8.5;
		double nota2 = 7.5;
		double media = (nota1 + nota2) / 2;
		
		System.out.println(media);
		
		if(media==10) {
			System.out.println("Parabéns! Nota máxima");
		}else if(media >=9) {
			System.out.println("Otimo, sua média é: "+media);
		}else if (media>=8) {
			System.out.println("Bom, sua média é: "+media);
		}else if(media>=7) {
			System.out.println("Na média com: "+media);
		}else if(media>=5) {
			System.out.println("Em exame com: "+media);
		}else {
			System.out.println("Reprovado com média: "+media);
		}
		
	}

}
