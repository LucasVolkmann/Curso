package carhos;

public class Analista extends Cargos {

	//Construtor
			public Analista(String cargo, double salario) {
				this.cargo = cargo;
				this.salario = salario;
			}
			
	
		//IR
		public void impostoRenda() {
			System.out.println(cargo+"ter� que pagar "+salario*0.2+" de ir\n");
		}
	
}
