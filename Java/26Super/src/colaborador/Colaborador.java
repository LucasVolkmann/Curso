package colaborador;

public class Colaborador extends Pessoa {

	//Atributos
	private String cargoColaborador;
	private double salarioColaborador;
	
	//Construtor
	public Colaborador(String nomePessoa, String enderecoPessoa, int idadePessoa, String cargoColaborador,double salarioColaborador) {
		super(nomePessoa, enderecoPessoa, idadePessoa);
		
		this.cargoColaborador = cargoColaborador;
		this.salarioColaborador = salarioColaborador;
	
		exibirDadosColaborador();
	}
	
	//Método para exibir dados do colaborador
	public void exibirDadosColaborador() {
		System.out.println("Cargo: "+cargoColaborador);
		System.out.println("Salário: "+salarioColaborador);
	}
	
	
}
