package carhos;

public class Estagiario extends Cargos {

	//Construtor
			public Estagiario(String cargo, double salario) {
				this.cargo = cargo;
				this.salario = salario;
			}
			
	
		//IR
		public void impostoRenda() {
			System.out.println("n�o � imposto de renda para estagi�rio\n");
		}
	
}
