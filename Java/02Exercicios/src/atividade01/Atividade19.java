package atividade01;

import javax.swing.JOptionPane;

public class Atividade19 {

	public static void main(String[] args) {
		
		double s = Double.parseDouble(JOptionPane.showInputDialog("Caminho percorrido em metros"));
		double t = Double.parseDouble(JOptionPane.showInputDialog("Tempo utilizado em segundos"));
		
		System.out.println("Vm = "+(s/t)+" m/s");

	}

}
