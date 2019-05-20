package atividade01;

import javax.swing.JOptionPane;

public class Atividade4 {

	public static void main(String[] args) {
		
		String produto = JOptionPane.showInputDialog("Produto");
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
		String forma = JOptionPane.showInputDialog("Forma de pagamento");
		
		if((forma.equals("à vista")) && (valor >= 500)) {
			double desconto = valor*0.9;
			System.out.println("O produto "+produto+" custará R$ "+desconto);
		}else {
			System.out.println("Sem desconto - R$"+valor);
		}

	}

}
