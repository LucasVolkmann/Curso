package principal;

import java.awt.EventQueue;


import beans.Beans;
import dados.Array;
import formulario.Formulario;

public class Principal {

	public static void main(String[] args) {
		
		Beans b = new Beans();
		b.setNome("Feijão");
		Array.Lista.add(b);
		Beans b1 = new Beans();
		b1.setNome("Tomate");
		Array.Lista.add(b1);
		Beans b2 = new Beans();
		b2.setNome("Suco de Uva");
		Array.Lista.add(b2);
		Beans b3 = new Beans();
		b3.setNome("Queijo");
		Array.Lista.add(b3);
		Beans b4 = new Beans();
		b4.setNome("Arroz");
		Array.Lista.add(b4);
		Beans b5 = new Beans();
		b5.setNome("Suco de Laranja");
		Array.Lista.add(b5);
		Beans b6 = new Beans();
		b6.setNome("Cerveja");
		Array.Lista.add(b6);
		Beans b7 = new Beans();
		b7.setNome("Banana");
		Array.Lista.add(b7);
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
