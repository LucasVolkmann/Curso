package atividades;

import javax.swing.JOptionPane;

public class Atividade6 {

	public static void main(String[] args) {
		
		Object[] se = {"M","F"};
		String nome;
		int f = 0, m = 0, se2 = 0,par= 0, ot = 0, bom = 0, sat = 0, rec = 0, rep = 0, total = 0;
		
		do {
			
			nome = JOptionPane.showInputDialog("Nome do Aluno\nDigite Sair para terminar");
			
			if(!nome.equals("Sair")) {

			total++;
			se2 = JOptionPane.showOptionDialog(null,"Qual seu sexo","",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,se,0);
			
			switch(se2) {
				case 0:
					m++;
				break;
				case 1:
					f++;
				break;
			}
			
			double n1 = Double.parseDouble(JOptionPane.showInputDialog("Primeira nota"));
			double n2 = Double.parseDouble(JOptionPane.showInputDialog("Segunda nota"));
			double n3 = Double.parseDouble(JOptionPane.showInputDialog("Terceira nota"));
			double n4 = Double.parseDouble(JOptionPane.showInputDialog("Quarta nota"));
			double med = (n1+n2+n3+n4)/4;
			
			if(med == 10) {
				par++;
				JOptionPane.showMessageDialog(null, "Média "+med+" Parabéns");
			}else if(med >= 9) {
				ot++;
				JOptionPane.showMessageDialog(null, "Média "+med+" Ótimo");
			}else if(med >= 8) {
				bom++;
				JOptionPane.showMessageDialog(null, "Média "+med+" Bom");
			}else if(med >= 7) {
				sat++;
				JOptionPane.showMessageDialog(null, "Média "+med+" Satisfatório");
			}else if(med >= 5) {
				rec++;
				JOptionPane.showMessageDialog(null, "Média "+med+" Recuperação");
			}else {
				rep++;
				JOptionPane.showMessageDialog(null, "Média "+med+" Reprovado");
			}
			}
			
			
				
		}while(!nome.equals("Sair"));
		
		String resultado = "Homens: "+((100/total)*m)+"%";
		   resultado+="\nMulheres: "+((100/total)*f)+"%";
		   resultado+="\nQuantidade de alunos que tiraram 10: "+par;
		   resultado+="\nQuantidade de alunos que tiraram entre 9 e 9.9: "+ot;
		   resultado+="\nQuantidade de alunos que tiraram 8 e 8.9: "+bom;
		   resultado+="\nQuantidade de alunos que tiraram 7 e 7.9: "+sat;
		   resultado+="\nQuantidade de alunos que tiraram 5 e 6.9: "+rec;
		   resultado+="\nQuantidade de alunos que tiraram abaixo de 5 : "+rep;
		   
		   
		   
		   JOptionPane.showMessageDialog(null, resultado);
		
	}

}
