package exercicio03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int[]num = new int[5];
		int posicao=6;
		JOptionPane.showMessageDialog(null, "Informe 5 números:");
		for(int i=0;i<5;i++) {
			num[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+"º Número"));
		}
		for(int i=0;i<5;i++) {
			if(num[i]==10) {
				posicao = i+1;
			}
		}
		if(posicao>=0&&posicao<=5) {
			JOptionPane.showMessageDialog(null, "O número 10 está na posição "+posicao+" do vetor");
		}else {
			JOptionPane.showMessageDialog(null, "Não foi encontrado o número 10");
		}
	
	
	}

}
