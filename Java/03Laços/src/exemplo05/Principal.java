package exemplo05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Op��es de cores
		Object[] cores = {"Vermelho","Azul","Rosa","Amarelo","Verde"};
		
		//Vari�veis
		
		int vermelho = 0, azul = 0, rosa = 0, amarelo = 0, verde = 0;
		int cor, continuar=0;
		
		//La�o
		do {
			
			cor = JOptionPane.showOptionDialog(null,"Qual a cor do seu power ranger favorito?","",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,cores,0);
			
			switch(cor) {
			case 0:
				vermelho++;
			break;
			
			case 1:
				azul++;
			break;
			
			case 2:	
				rosa++;
			break;
			
			case 3:
				amarelo++;
			break;
			
			case 4:
				verde++;
			break;
			}
			
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			
			
		}while(continuar == 0);
		
		String resultado = "Vota��o de cores:";
			   resultado+="\nVermelho obteve: "+vermelho;
			   resultado+="\nAzul obteve: "+azul;
			   resultado+="\nRosa obteve: "+rosa;
			   resultado+="\nAmarelo obteve: "+amarelo;
			   resultado+="\nVerde obteve: "+verde;
			   
		JOptionPane.showMessageDialog(null, resultado);
		
	}

}
