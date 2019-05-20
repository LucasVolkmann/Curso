
public class Principal {

	//Método Generico
	public static <E> void listar(E[] vetor) {
		for(E elemento : vetor) {
			System.out.print(elemento+" ");
		}
	}
			
	public static void main(String[] args) {
		
		//Vetores
		String[]nomes = {"SUellen","Cleiton","Paloma"};
		Integer[]idades = {22,30,17};
		Double[] alturas = {2.00 , 4.00 ,
				8.00};
		
		
	}

}
