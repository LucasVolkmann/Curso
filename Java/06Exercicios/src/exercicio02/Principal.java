package exercicio02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int[]num = new int[10];
		
		for(int i=0;i<10;i++) {
		num[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+"º Número"));
		}
		String result="";
		for(int i=9;i>=0;i--) {
			result+=num[i]+", ";
		}
		System.out.println(result);
	
	}

}
