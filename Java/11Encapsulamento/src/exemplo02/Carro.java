package exemplo02;

public class Carro {

	//Atributos
	private String modelo,fabricante;
	private int ano;
	
	//Construtor
	public Carro(String modelo, String fabricante, int ano) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.ano = ano;
	
		exibirDados();
	}
	private void exibirDados() {
		System.out.println(modelo);
		System.out.println(fabricante);
		System.out.println(ano);
	}
	
}
