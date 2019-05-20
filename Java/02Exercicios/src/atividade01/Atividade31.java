package atividade01;

import javax.swing.JOptionPane;

public class Atividade31 {

	public static void main(String[] args) {
		
		String n1 = JOptionPane.showInputDialog("Nome 1:");
		String n2 = JOptionPane.showInputDialog("Nome 2:");
		String n3 = JOptionPane.showInputDialog("Nome 3:");
		double id1 = Double.parseDouble(JOptionPane.showInputDialog("Idade 1"));
		double id2 = Double.parseDouble(JOptionPane.showInputDialog("Idade 2"));
		double id3 = Double.parseDouble(JOptionPane.showInputDialog("Idade 3"));
		
		if((id1 > id2) && (id1 > id3)) {
			System.out.println(n1+" "+id1);
		}else if((id2 > id3) && (id2 > id1)) {
			System.out.println(n2+" "+id2);
		}else {
			System.out.println(n3+" "+id3);
		}
		
	}

}
