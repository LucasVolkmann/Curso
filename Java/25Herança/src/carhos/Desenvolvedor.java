package carhos;

public class Desenvolvedor extends Cargos {

	//Construtor
		public Desenvolvedor(String cargo, double salario) {
			this.cargo = cargo;
			this.salario = salario;
		}
		
	
	//IR
	public void impostoRenda() {
		System.out.println(cargo+"ter� que pagar "+salario*0.1+" de ir\n");
	}
	
}
