package exercicio02;

import java.util.Random;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int cont=0,limitemin = 0,limitemax = 100,chute;
		double numeroA = Math.random();
		int numero = (int) Math.round(limitemin + numeroA * limitemax  );
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Chute um n�mero"));
			if(numero>chute) {
				if((numero-chute)<=10) {
					JOptionPane.showMessageDialog(null, "Est� perto!");cont++;
				}else if((numero-chute)<=20) {
					JOptionPane.showMessageDialog(null, "Est� longe!");cont++;
				}else if((numero-chute)>20) {
					JOptionPane.showMessageDialog(null, "Ihhhhhhh! Muito Longe!");cont++;
				}
			}else if(numero<chute) {
				if((chute-numero)<=10) {
					JOptionPane.showMessageDialog(null, "Est� perto!");cont++;
				}else if((chute-numero)<=20) {
					JOptionPane.showMessageDialog(null, "Est� longe!");cont++;
				}else if((chute-numero)>20) {
					JOptionPane.showMessageDialog(null, "Ihhhhhhh! Muito Longe!");cont++;
				}
			}
			
		}while(chute!=numero);
			if(cont==0) {
				JOptionPane.showMessageDialog(null, "Nossa acertou na mosca!");
			}else if(cont<=5) {
				JOptionPane.showMessageDialog(null, "Parab�ns! Voc� � bom de adivinha��o");
			}else if(cont<=10) {
				JOptionPane.showMessageDialog(null, "Muito bom. Continue assim!");
			}else if(cont<=20) {
				JOptionPane.showMessageDialog(null, "Hmm... Podia melhorar!");
			}else if(cont>20) {
				JOptionPane.showMessageDialog(null, "Meio lerdo voc�, hein?");
			}
	
	
	}

}
