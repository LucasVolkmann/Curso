package atividades;

import javax.swing.JOptionPane;

public class Atividade5 {

	public static void main(String[] args) {
		
		int continuar = 0;
		double val2 = 0;
		do{
				
			String prod = JOptionPane.showInputDialog("Produto");
			double val = Double.parseDouble(JOptionPane.showInputDialog("Valor R$"));
			
			String resultado = "Produto "+prod;
			   resultado+="\nValor: R$"+val;
			   resultado+="\n1 x "+val*0.95+" : R$"+(val*0.95);
			   resultado+="\n2 x "+val*0.90+" : R$"+(val*2*0.90);
			   resultado+="\n3 x "+val*0.85+" : R$"+(val*3*0.85);
			   resultado+="\n4 x "+val*0.80+" : R$"+(val*4*0.80);
			   resultado+="\n5 x "+val*0.75+" : R$"+(val*5*0.75);
			   resultado+="\n6 x "+val*0.70+" : R$"+(val*6*0.70);
			   resultado+="\n7 x "+val*0.65+" : R$"+(val*7*0.65);
			   resultado+="\n8 x "+val*0.60+" : R$"+(val*8*0.60);
			   resultado+="\n9 x "+val*0.55+" : R$"+(val*9*0.55);
			   resultado+="\n10 x "+val*0.5+" : R$"+(val*10*0.5);
			   
			   JOptionPane.showMessageDialog(null, resultado);
			   
			
			
				continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
					
					
		}while(continuar == 0);
		
	}

}
