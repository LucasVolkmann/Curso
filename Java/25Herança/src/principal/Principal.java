package principal;

import carhos.Analista;
import carhos.Desenvolvedor;
import carhos.Estagiario;

public class Principal {

	public static void main(String[] args) {
		
		
		//INstanciar objetos
		Desenvolvedor d = new Desenvolvedor("Desenvolvedor Jr", 2000);
		Analista a = new Analista("Analista Pleno", 4000);
		Estagiario e = new Estagiario("Estagiario", 1000);
		
		//Vale Trasporte 
		d.valeTransporte();
		a.valeTransporte();
		e.valeTransporte();
		
		//IR
		d.impostoRenda();
		a.impostoRenda();
		e.impostoRenda();
		
	}

}
