package exemplo07;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
			//Array 
			String[][] produtos = {
					
									{"Caderno","5"},
									{"Lápis","1.5"},
									{"Mochila","89.90"},
									{"Caneta","2.45"},
									{"Apontador","0.50"}
					
									};		
	//Menu
			String menu = "Escolha uma opção:\n";
			int i=0;
			for(i=0; i<produtos.length; i++) {
				menu+="\n"+(i+1)+") "+produtos[i][0];
			}
			menu+="\n"+(i+1)+") Sair";
			
			//variavel
			int opcao = 0;
			int quantidade = 0;
			double total=0;
			//Laço
			
			do {				
				opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));			
				if(opcao >=1&&opcao<6) {
					quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade do prosuto"));	
				}				
				switch(opcao) {
				case 1:
					total+=quantidade*Double.parseDouble(produtos[0][1]);
					break;
				case 2:
					total+=quantidade*Double.parseDouble(produtos[1][1]);
					break;
				case 3:
					total+=quantidade*Double.parseDouble(produtos[2][1]);
					break;
				case 4:
					total+=quantidade*Double.parseDouble(produtos[3][1]);
					break;
				case 5:
					total+=quantidade*Double.parseDouble(produtos[4][1]);
				}
			
			
			}while(opcao!=6);
	//EXIBIR TOTAL
			JOptionPane.showMessageDialog(null, "Total a pagar R$"+total);
	}

}
