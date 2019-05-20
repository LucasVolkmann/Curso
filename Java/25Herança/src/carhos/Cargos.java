package carhos;

public class Cargos {
	
	//Atrisbutos
	protected String cargo;
	protected double salario;
	
	//Vale trasporte
	public void valeTransporte() {
		System.out.println("O cargo: "+cargo+", terá um desconto de vale trasnporte no valor de:"+salario*0.06);
		
	}

}
