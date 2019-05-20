package atividade01;

import javax.swing.JOptionPane;

public class Atividade14 {

	public static void main(String[] args) {
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do veículo"));
		
		if(valor <= 12000) {
			System.out.println("% do distribuidor: R$"+(valor*0.05));
			System.out.println("Valor do carro sem adicionais: R$"+((valor)-(valor*0.05)));
		}else if(valor <= 25000) {
			System.out.println("% do distribuidor: R$"+(valor*0.1));
			System.out.println("% dos impostos: R$"+(valor*0.15));
			System.out.println("Valor do carro sem adicionais: R$"+(valor-(valor*0.1)-((valor*0.15))));
		}else if(valor > 25000) {
			System.out.println("% do distribuidor: R$"+(valor*0.15));
			System.out.println("% dos impostos: R$"+(valor*0.2));
			System.out.println("Valor do carro sem adicionais: R$"+(valor-(valor*0.15)-((valor*0.2))));
		}
		
		
	}

}
