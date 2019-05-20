package exercicio06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Object[]ag = {"Cadastrar contato","Alterar","Excluir","Pesquisar","Sair"};
		Object[]teste = {"Nome","Data de Nascimento","Estado","Cidade","Endereço","Telefone","Celular","E-mail"};
		String[][]agenda = new String[10][8];
		int contador=-1,marcador,alterar,opcoes=0,valid=0,excluir=0;
		String busca,busca1,busca3;
		do {
			if(excluir==0) {
			opcoes=JOptionPane.showOptionDialog(null, "O que deseja fazer?", "AGENDA", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, ag, 0);
			}else {
				JOptionPane.showMessageDialog(null, "Você acabou de excluir um contato que tal adicionar outro?");
				opcoes=0;
				excluir=0;
			}
		switch(opcoes) {
			case 0:
				if(agenda[9][0]==null) {				
					for(int i=0;i<10;i++) {
						if(agenda[i][0]==null) {
						contador=i;
						break;
						}
					}
			agenda[contador][0]=JOptionPane.showInputDialog("Nome:");
			agenda[contador][1]=JOptionPane.showInputDialog("Data de Nascimento:");
			agenda[contador][2]=JOptionPane.showInputDialog("Estado:");
			agenda[contador][3]=JOptionPane.showInputDialog("Cidade:");
			agenda[contador][4]=JOptionPane.showInputDialog("Endereço:");
			agenda[contador][5]=JOptionPane.showInputDialog("Telefone:");
			agenda[contador][6]=JOptionPane.showInputDialog("Celular:");
			agenda[contador][7]=JOptionPane.showInputDialog("E-mail:");
				JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
				}else
				JOptionPane.showMessageDialog(null, "Agenda cheia!\nPara adicionar um novo contato exclua um ja existente.");
			break;
			case 1:
				busca=JOptionPane.showInputDialog("Qual o nome do contato que deseja alterar?");
				for(int i=0;i<10;i++) {
					if(agenda[i][0]==null) {
					JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
					valid=1;
					break;
					}
					if(agenda[i][0].equalsIgnoreCase(busca)) {
					contador=i;
					valid=0;
					break;
					}
				}
				if(valid==0) {
				alterar=JOptionPane.showOptionDialog(null, "QUAL DADO DESEJA ALTERAR?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, teste, 0);
				agenda[contador][alterar]=JOptionPane.showInputDialog("O dado antigo é: "+agenda[contador][alterar]+"\nDigite a alteração:");
				}
				break;
			case 2:
				busca1=JOptionPane.showInputDialog("Qual o nome do contato que deseja excluir?");
				for(int i=0;i<10;i++) {
					if(agenda[i][0]==null) {
					JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
					valid=1;
					break;
					}
					if(agenda[i][0].contentEquals(busca1)) {
					contador=i;
					valid=0;
					break;
					}
				}
				if(valid==0) {
					for(int i=0;i<=7;i++) {
					agenda[contador][i]=null;
					}
					JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
					excluir=1;
				}
				break;
			case 3:
				busca3=JOptionPane.showInputDialog("Qual o nome do contato que deseja pesquisar?");
				for(int i=0;i<10;i++) {
					if(agenda[i][0]==null) {
					JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
					valid=1;
					break;
					}
					if((agenda[i][0]).contentEquals(busca3)) {
					contador=i;
					valid=0;
					break;
					}
				}
				if(valid==0) {
				JOptionPane.showMessageDialog(null, "Nome: "+agenda[contador][0]+
												  "\nData de Nascimento: "+agenda[contador][1]+
												  "\nEstado: "+agenda[contador][2]+
												  "\nCidade: "+agenda[contador][3]+
												  "\nEndereço: "+agenda[contador][4]+
												  "\nTelefone: "+agenda[contador][5]+
												  "\nCelular: "+agenda[contador][6]+
												  "\nE-mail: "+agenda[contador][7]);
				}
			break;
			case 4:
			break;
		}			
		}while(opcoes!=4);
		
		
		}

}
