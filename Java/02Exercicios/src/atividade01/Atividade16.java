package atividade01;

import javax.swing.JOptionPane;

public class Atividade16 {

	public static void main(String[] args) {
		
		double ped = Double.parseDouble(JOptionPane.showInputDialog("Pedido:\n1 - Hambúrgue + Suco Laranja R$ 5,00\n2 - Sanduíche natural + Suco de Uva R$ 4,50\n3 - Prato do dia R$ 8,00\n4 - Pizza R$ 12,00\n5 - Lasanha R$ 16,50\n6 - Pão de Queijo R$ 1,00\n7 - Bolo R$ 2,50"));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Pagamento"));
		
		if(ped == 1) {
			System.out.println("Troco: R$"+(valor-5));
		}else if(ped == 2) {
			System.out.println("Troco: R$"+(valor-4.50));
		}else if(ped == 3) {
			System.out.println("Troco: R$"+(valor-8));
		}else if(ped == 4) {
			System.out.println("Troco: R$"+(valor-12));
		}else if(ped == 5) {
			System.out.println("Troco: R$"+(valor-16.50));
		}else if(ped == 6) {
			System.out.println("Troco: R$"+(valor-1));
		}else if(ped == 7) {
			System.out.println("Troco: R$"+(valor-2.50));
		}else {
			System.out.println("Pedido Inválido");
		}
	}

}
