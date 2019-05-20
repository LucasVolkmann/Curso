package atividades;

import javax.swing.JOptionPane;

public class Atividade1 {

	public static void main(String[] args) {
		
		Object[] trab = {"Gerente","Atendente","Açougueiro","Secretária","Almoxarife","Padeiro","Estagiário"};
		Object[] se = {"M","F"};
		
		int gerente = 0, atendente = 0, açou = 0, secre = 0, almo = 0, pade = 0, esta = 0, m = 0, f = 0, id1 = 0, id2 = 0;
		int cargo, se2, continuar=0;
				
		do {
			
			String nome = JOptionPane.showInputDialog("Nome:");
			
			int id = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
			
			if((id < 18) && (id >= 0)) {
				id1++;
			}else {
				id2++;
			}
			
			se2 = JOptionPane.showOptionDialog(null,"Qual seu sexo","",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,se,0);
			
			switch(se2) {
			case 0:
				m++;
			break;
			case 1:
				f++;
			break;
			}
					
			cargo = JOptionPane.showOptionDialog(null,"Qual o seu emprego","",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,trab,0);
					
			switch(cargo) {
			case 0:
				gerente++;
			break;	
			case 1:
				atendente++;
			break;
			case 2:	
				açou++;
			break;	
			case 3:
				secre++;
			break;	
			case 4:
				almo++;
			break;
			case 5:
				pade++;
			break;
			case 6:
				esta++;
			break;
			}
		
						
				
				
				
				
				continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
					
					
		}while(continuar == 0);
		
		String resultado = "Empregos";
		   resultado+="\nGerente: "+gerente;
		   resultado+="\nAtendente: "+atendente;
		   resultado+="\nAçougueiro: "+açou;
		   resultado+="\nSecretária: "+secre;
		   resultado+="\nAlmoxarife: "+almo;
		   resultado+="\nPadeiro: "+pade;
		   resultado+="\nEstagiário: "+esta;
		   resultado+="\n";
		   resultado+="\nSexo Masculino:"+m;
		   resultado+="\nSexo Feminino"+f;
		   resultado+="\n";
		   resultado+="\nMenores de idade:"+id1;
		   resultado+="\nMaiores de Idade"+id2;
		   
	JOptionPane.showMessageDialog(null, resultado);
		
		
	}

}
