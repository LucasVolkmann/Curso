package Zteste;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Object[]teste = {"nome","Data de Nascimento","Estado","Cidade","Endereço","Telefone","Celular","E-mail"};
		JOptionPane.showOptionDialog(null, "", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, teste, 0);
	}

}
