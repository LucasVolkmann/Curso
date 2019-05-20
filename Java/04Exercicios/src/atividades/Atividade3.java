package atividades;

import javax.swing.JOptionPane;

public class Atividade3 {

	public static void main(String[] args) {
		
		Object[] ped = {"Ham. + Suco Laranja","San. Nat. + Suco de Uva","Prato do Dia","Pizza","Lasanha","Pão de Queijo","Bolo"};
		double ham = 5, san = 4.50, pra = 8, piz = 12, las = 16.50, pao = 1, bolo = 2.50, total = 0, paga = 0, troco = 0;
		int continuar = 0, ham2 = 0, san2 = 0, pra2 = 0, piz2 = 0, las2 = 0, pao2 = 0, bolo2 = 0, pedido = 0;
		do{
			
			pedido = JOptionPane.showOptionDialog(null,"Qual seu pedido","",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,ped,0);

				
			switch(pedido) {
			case 0:
				ham2++;
			break;	
			case 1:
				san2++;
			break;
			case 2:	
				pra2++;
			break;	
			case 3:
				piz2++;
			break;	
			case 4:
				las2++;
			break;
			case 5:
				pao2++;
			break;
			case 6:
				bolo2++;
			break;
			}
				
				continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
					
					
		}while(continuar == 0);
		
		do {
		total = ((ham2 * ham)+(san2*san)+(pra2*pra)+(piz2*piz)+(las2*las)+(pao2*pao)+(bolo2*bolo));
		paga = Double.parseDouble(JOptionPane.showInputDialog("Total: R$"+total+", Quanto irá pagar"));
		
		
		}while 	(paga < total);
		
	    JOptionPane.showMessageDialog(null,"Troco R$"+(paga-total));
		
	}

}
