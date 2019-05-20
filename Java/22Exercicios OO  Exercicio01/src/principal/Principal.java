package principal;

import java.awt.EventQueue;
import java.util.ArrayList;

import beans.Jogo;
import formulario.FormularioPrincipal;

public class Principal {

	//ArrayList
	public static ArrayList<Jogo> vetorJogos = new ArrayList<Jogo>();
	
	//Iniciar o sistema
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioPrincipal frame = new FormularioPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
