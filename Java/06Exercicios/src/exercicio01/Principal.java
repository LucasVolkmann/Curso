package exercicio01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Object[]op= {"Adição","Subtração","Divisão","Multiplicação"};
		int[]num1 = new int[10];
		int[]num2 = new int[10];
		int opcao;
		JOptionPane.showMessageDialog(null, "Informe 10 números:");
		for(int i=0;i<10;i++) {
		num1[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+"º número"));
	}
		JOptionPane.showMessageDialog(null, "Informe outros 10 números:");
		for(int ii=0;ii<10;ii++) {
			num2[ii]=Integer.parseInt(JOptionPane.showInputDialog((ii+1)+"º número"));
		}
		String result="";
		opcao=JOptionPane.showOptionDialog(null, "Que operação voce deseja fazer?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, op, 0);
		switch(opcao) {
		case 0:
			for(int i=0;i<10;i++) {
			result+=num1[i]+" + "+num2[i]+" = "+(num1[i]+num2[i])+"\n";	
			}
			break;
		case 1:
			for(int i=0;i<10;i++) {
				result+=num1[i]+" - "+num2[i]+" = "+(num1[i]-num2[i])+"\n";	
			}
			break;
		case 2:
			for(int i=0;i<10;i++) {
				result+=num1[i]+" / "+num2[i]+" = "+(num1[i]/num2[i])+"\n";
			}
			break;
		case 31:
			for(int i=0;i<10;i++) {
				result+=num1[i]+" x "+num2[i]+" = "+(num1[i]*num2[i])+"\n";
			}
			break;
		}
	System.out.println(result);
	
	
	
	
	
	}

}
