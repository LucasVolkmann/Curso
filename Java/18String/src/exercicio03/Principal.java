package exercicio03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String palavra,verbo="";
		int confirma=0;
		do {
		palavra = JOptionPane.showInputDialog("Informe um verbo terminado em AR");
		if(palavra.endsWith("ar")) {
		confirma=1;
		}else
		JOptionPane.showMessageDialog(null, "Digite um verbo v�lido");
		}while(confirma==0);
		for(int i=0;i<(palavra.length()-2);i++) {
			verbo+=palavra.charAt(i);
		}
		
				
		JOptionPane.showMessageDialog(null, "A conjuga��o do verbo "+palavra+" �:"
										   +"\nEu "+verbo+"o"
										   +"\nTu "+verbo+"as"
										   +"\nEle "+verbo+"a"
										   +"\nN�s "+verbo+"amos"
										   +"\nV�s "+verbo+"�is"
										   +"\nEles "+verbo+"am");
	
	
	
	}

}
