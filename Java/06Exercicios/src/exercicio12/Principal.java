package exercicio12;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		double[][]CONS = new double[3][3];
		String[][]jogo= {
				{"_","_","_"},{"_","_","_"},{"_","_","_"}
				};
		String resultado="",resultadoF="";
		int contador=0,jogadaLinha=0,jogadaColuna=0,continuar=0;
		JOptionPane.showMessageDialog(null, "O jogo começou!");
		for(int i=0;i<3;i++) {
			for(int i2=0;i2<3;i2++) {	
				resultado+=jogo[i][i2]+"   ";
	
			}
			resultado+="\n";
		}
	
		
		
		do {

			//JOGADOR 1 ->
			do {
			jogadaLinha = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1(X): Em qual linha deseja jogar?"));
			jogadaColuna = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1(X): Em qual coluna deseja jogar?"));
			}while(CONS[jogadaLinha-1][jogadaColuna-1]==1||CONS[jogadaLinha-1][jogadaColuna-1]==1.1);
			CONS[jogadaLinha-1][jogadaColuna-1]=1.1;
			jogo[jogadaLinha-1][jogadaColuna-1]="X ";
			if((CONS[0][0]+CONS[0][1]+CONS[0][2])==(3.3)||
			   (CONS[1][0]+CONS[1][1]+CONS[1][2])==(3.3)||
			   (CONS[2][0]+CONS[2][1]+CONS[2][2])==(3.3)||
			   (CONS[0][0]+CONS[1][0]+CONS[2][0])==(3.3)||
			   (CONS[0][1]+CONS[1][1]+CONS[2][1])==(3.3)||							
			   (CONS[0][2]+CONS[1][2]+CONS[2][2])==(3.3)||
			   (CONS[0][0]+CONS[1][1]+CONS[2][2])==(3.3)||
			   (CONS[0][2]+CONS[1][1]+CONS[2][0])==(3.3)) {
				JOptionPane.showMessageDialog(null, "Jogador 1 GANHOU!");
				break;
			}else;
			if(contador>=9) {
				break;
			}else {
				contador++;
			}	
//mostrando resultado do jogador 1 			
			resultado="";
			for(int i=0;i<3;i++) {
				for(int i2=0;i2<3;i2++) {	
					resultado+=jogo[i][i2]+"   ";
		
				}
				resultado+="\n";
			}
			JOptionPane.showMessageDialog(null, resultado);
			//JOGADOR 2 ->
			do {
			jogadaLinha = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2(O): Em qual linha deseja jogar?"));
			jogadaColuna = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2(O): Em qual coluna deseja jogar?"));
			}while(CONS[jogadaLinha-1][jogadaColuna-1]==1||CONS[jogadaLinha-1][jogadaColuna-1]==1.1);
			CONS[jogadaLinha-1][jogadaColuna-1]=1;
			jogo[jogadaLinha-1][jogadaColuna-1]="O ";
			if((CONS[0][0]+CONS[0][1]+CONS[0][2]==3)||
			   (CONS[1][0]+CONS[1][1]+CONS[1][2]==3)||
			   (CONS[2][0]+CONS[2][1]+CONS[2][2]==3)||
			   (CONS[0][0]+CONS[1][0]+CONS[2][0]==3)||
		   	   (CONS[0][1]+CONS[1][1]+CONS[2][1]==3)||
			   (CONS[0][2]+CONS[1][2]+CONS[2][2]==3)||
			   (CONS[0][0]+CONS[1][1]+CONS[2][2]==3)||
			   (CONS[0][2]+CONS[1][1]+CONS[2][0]==3)) {
						JOptionPane.showMessageDialog(null, "Jogador 2 GANHOU!");
						break;
			}else;
			if(contador>=9) {
				break;
			}else {
				contador++;
			}	
//mostrando resultado do jogador 2
			resultado="";
			for(int i=0;i<3;i++) {
				for(int i2=0;i2<3;i2++) {	
					resultado+=jogo[i][i2]+"   ";
		
				}
				resultado+="\n";
			}
			JOptionPane.showMessageDialog(null, resultado);
			
		}while(contador!=9);
		
		}

}
