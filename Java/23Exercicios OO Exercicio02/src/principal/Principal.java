package principal;

import java.awt.EventQueue;

import array.Array;
import beans.Beans;
import formulario.Formulario;

public class Principal {

	
	public static void main(String[] args) {
		
		Beans b = new Beans();
		b.setNome("admin");
		b.setSenha("admin");
		b.setTipo("Administrador");
		b.setData("12/05/2019 - 17:33");
		Array.vetorJogos.add(b);
		
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
