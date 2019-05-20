package exercicio02;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Object[]menuObj = {"Cadastrar","Exibir","Sair"};
		DecimalFormat df = new DecimalFormat("00");
		LocalDateTime momento = LocalDateTime.now();
		int menu,quantidade=0,dia=0,mes=0,ano=0,hora=0,minuto=0;
		double valor=0;
		String nome,add,exibir="";
		ArrayList<String> produtos = new ArrayList<String>();
		do {
			menu=JOptionPane.showOptionDialog(null, "O que você deseja realizar", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, menuObj, 0);
			switch (menu){
			case 0:
				nome=JOptionPane.showInputDialog("Qual o nome do produto?");
				valor=Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do produto?"));
				quantidade=Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade do produto no estoque?"));
				dia=momento.getDayOfMonth();
				mes=momento.getMonthValue();
				ano=momento.getYear();
				hora=momento.getHour();
				minuto=momento.getMinute();
				add="Nome: "+nome+
					"\nValor: R$"+valor+
					"\nQuantidade do produto no esoque: "+quantidade+
					"\nData e hora do cadastro: "+df.format(dia)+"/"+df.format(mes)+"/"+df.format(ano)+"  -  "+df.format(hora)+":"+df.format(minuto)+"\n\n";
				produtos.add(add);
				break;
			case 1:
				for(String elementos : produtos) {
					exibir+=elementos;
				}
				if(exibir.contentEquals("")) {
					exibir+="Nenhum produto encontrado!";
				}
				JOptionPane.showMessageDialog(null, exibir);
				exibir="";
				break;
			}
			System.out.println(menu);
		}while(menu==0||menu==1);
	}

}
