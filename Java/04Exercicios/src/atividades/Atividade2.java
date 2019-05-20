package atividades;

import javax.swing.JOptionPane;

public class Atividade2 {

	public static void main(String[] args) {
		
		
		
		String nome, nomeMaiorPeso="", nomeMA="", nomeMI="";
		double maiorPeso = 0, mA = 0, mI = 0, somaAlt=0;
		int jogador = 0;
		
		do {
			
			jogador++;
			
			nome = JOptionPane.showInputDialog("Nome do Jogador\nDigite Sair para terminar");
		
			if(!nome.equals("Sair")) {
				double alt = Double.parseDouble(JOptionPane.showInputDialog("Altura"));
				somaAlt += alt;
				
				if(alt > mA) {
					nomeMA = nome;
					mA = alt;
				}
				
				double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
				
				if(peso > maiorPeso) {
					nomeMaiorPeso = nome;
					maiorPeso = peso;
				}
				
				double id = Double.parseDouble(JOptionPane.showInputDialog("Idade"));
				
				if(id > mI) {
					nomeMI = nome;
					mI = id;
				}
			}
			
			
				
				
		}while(!nome.equals("Sair"));
		
		String resultado = "Total de jogadores registrados"+jogador;
		   resultado+="\nMaior jogador: "+nomeMA+" "+mA+" M";
		   resultado+="\nJogador mais velho: "+nomeMI+" "+mI+" Anos";
		   resultado+="\nJogador mais pesado: "+nomeMaiorPeso+" "+maiorPeso+" Kg";
		   resultado+="\nMédia de altura: "+(somaAlt/jogador)+" M";
		   
		   JOptionPane.showMessageDialog(null, resultado);
		
	}

}

