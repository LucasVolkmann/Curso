package acao;

import beans.Beans;
import dados.Array;

public class Acao {
	
	public void somar(int indice) {
		int cont=Array.Lista.get(indice).getQuantidade();
		System.out.println(Array.Lista.get(indice).getQuantidade());
		Array.Lista.get(indice).setQuantidade(cont+1);
	}
	
	public void suntrair(int indice) {
		int cont=Array.Lista.get(indice).getQuantidade();
		if(cont<=0) {
			
		}else {
		System.out.println(Array.Lista.get(indice).getQuantidade());
		Array.Lista.get(indice).setQuantidade(cont-1);
	
		}
	}
	
}
