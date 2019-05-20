package exemplo03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
				
		//Vetores
		String[] nomes = new String[20];
		int[]idades = new int[20];
		
		//COntinuar
		int continuar = 0;
		int indice = 0;
		//Laço
		do {
			
			//Perguntar nome e idade
			nomes[indice] = JOptionPane.showInputDialog("Informe seu nome");
			idades[indice] = Integer.parseInt(JOptionPane.showInputDialog("idade:"));
			
			//indice
			indice++;
			
			//verifica se continua
			continuar=JOptionPane.showConfirmDialog(null, "cont?");
		}while(continuar==0);

		//Estrutura de exibição
		String exibir = "Usuarios cad:";
		for(int i =0;i<nomes.length;i++) {
			if(nomes[i]!= null) {
				exibir+="\nNome: "+nomes[i];
				exibir+="\nIdade: "+idades[i];
				exibir+="\n";
			}
		}
		JOptionPane.showMessageDialog(null, exibir);
		
	}

}
