package arquivo;

public class Texto {

	//Atributo
	private String palavra;
	
	//Construtor
	public Texto(String palavra) {
		this.palavra = palavra;
	}
	
	//M�todo para contar letras
	public void contarLetras() {
		System.out.println(palavra.length());
	}
	
}
