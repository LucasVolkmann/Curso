package principal;

import pagamento.Credito;
import pagamento.Debito;

public class Principal {

	public static void main(String[] args) {
		
		//Poli    -> Várias/muitas
		//Morphus -> Formas
		
		//Objeto
		Debito d = new Credito();
		d.tributos(1000);
		d.msg();
		
		/*
		 Exemplo de Polimorfismo da classe Java.util
		 List<String> nome = new ArrayList<String>();
		 List<String> cidades = new LinkedList<String>();
		 */
		
	}

}
