package exercicio04;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int[]quantC = new int[20];
		int[]quantE = new int[20];
		String[]nome = new String[20];
		String[]gabfixo = new String[10];
		String[]gabaluno = new String[10];
		String nome1;
		JOptionPane.showMessageDialog(null, "Digite o gabarito:");
		for(int i=0;i<10;i++) {
			gabfixo[i]=JOptionPane.showInputDialog((i+1)+"ª Questão:");
			if((!gabfixo[i].equalsIgnoreCase("A"))&&(!gabfixo[i].equalsIgnoreCase("B"))&&(!gabfixo[i].equalsIgnoreCase("C"))&&(!gabfixo[i].equalsIgnoreCase("D"))) {
				JOptionPane.showMessageDialog(null, "Digite uma questão válida");
				i--;
			}
		}
		for(int i=0;i<10;i++) {
			nome1=JOptionPane.showInputDialog("Nome:");
			if(nome1.contentEquals("sair")) {break;}
			nome[i]=nome1;
			JOptionPane.showMessageDialog(null, "Digite o gabarito:");
			for(int i2=0;i2<10;i2++) {
				gabaluno[i]=JOptionPane.showInputDialog((i2+1)+"ª Questão");
				if(gabaluno[i].equalsIgnoreCase("a")||gabaluno[i].equalsIgnoreCase("b")||gabaluno[i].equalsIgnoreCase("c")||gabaluno[i].equalsIgnoreCase("d")) {
					if(gabaluno[i].equals(gabfixo[i])) {
						quantC[i]++;
					}else if(!gabaluno[i].equals(gabfixo[i])){
						quantE[i]++;
					}
				}else {
					JOptionPane.showMessageDialog(null, "Digite uma questão válida");i2--;
			}
			}
			JOptionPane.showMessageDialog(null, nome[i]+" você acertou "+quantC[i]+" questões e errou "+quantE[i]+" questôes.");
		}
		String resultado="";
			int segurar=0;
			String segurarN="";
			for(int i=0;i<10;i++) {
			for(int i2=i+1;i2<11;i2++) {
				if(quantC[i]<quantC[i2]) {
					segurar=quantC[i];
					quantC[i]=quantC[i2];
					quantC[i2]=segurar;
					segurarN=nome[i];
					nome[i]=nome[i2];
					nome[i2]=segurarN;
				}
			}
			}
			for(int i=0;i<nome.length;i++) {
					if(nome[i]!=null) {
						resultado+="\n"+nome[i]+":\nAcertou:"+quantC[i]+"\n";
					}
			}
			JOptionPane.showMessageDialog(null, resultado);
	}

}
