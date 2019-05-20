package colaborador;

public class Pessoa {

	//Atributos
	private String nomePessoa, enderecoPessoa;
	private int idadePessoa;
	
	//Construtor
	public Pessoa(String nomePessoa, String enderecoPessoa, int idadePessoa) {
	this.nomePessoa = nomePessoa;
	this.enderecoPessoa = enderecoPessoa;
	this.idadePessoa = idadePessoa;
	
	exibirDadosPessoa();
	}
	
	//Método para exibir dados pessoais
	private void exibirDadosPessoa() {
		System.out.println("Nome: "+nomePessoa);
		System.out.println("Endereço: "+enderecoPessoa);
		System.out.println("Idade: "+idadePessoa);
	}
	
}
