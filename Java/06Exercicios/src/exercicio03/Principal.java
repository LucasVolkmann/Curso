package exercicio03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int[]num = new int[5];
		int posicao=6;
		JOptionPane.showMessageDialog(null, "Informe 5 n�meros:");
		for(int i=0;i<5;i++) {
			num[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+"� N�mero"));
		}
		for(int i=0;i<5;i++) {
			if(num[i]==10) {
				posicao = i+1;
			}
		}
		if(posicao>=0&&posicao<=5) {
			JOptionPane.showMessageDialog(null, "O n�mero 10 est� na posi��o "+posicao+" do vetor");
		}else {
			JOptionPane.showMessageDialog(null, "N�o foi encontrado o n�mero 10");
		}
	
	
	}

}
