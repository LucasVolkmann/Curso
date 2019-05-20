package atividades;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Atividade10 {

	public static void main(String[] args) {
		
		double inv = 0, mes, ganho = 0;
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		
		inv = Double.parseDouble(JOptionPane.showInputDialog("Quanto será investido"));
		boolean cont2 = true;
		do {
		mes = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de meses"));
		
		if(mes < 0 || mes > 24) {
		cont2 = true;
		}else {
			cont2 = false;
		}
		
		}while(cont2 == true);
		
		for(int indice = 1; indice <= mes; indice++) {
		

			ganho = inv*0.0037;
			inv = inv+(inv*0.0037);

			String invFormatado = df.format(inv);
			String ganhoFormatado = df.format(ganho);
			JOptionPane.showMessageDialog(null, "Mês "+indice+", Ganho: R$"+ganhoFormatado+", Total: R$"+invFormatado);
		}
		
	}

}
