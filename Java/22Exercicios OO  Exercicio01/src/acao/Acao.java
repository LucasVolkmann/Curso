package acao;

import javax.swing.table.DefaultTableModel;

import beans.Jogo;
import formulario.FormularioPrincipal;
import principal.Principal;

public class Acao {

	//Cadastrar jogo
	public void cadastrar(Jogo j) {
		Principal.vetorJogos.add(j);
	}
	
	//Selecionar Jogos
	public DefaultTableModel selecionar() {
		
		DefaultTableModel dadosTabela = new DefaultTableModel();
		dadosTabela.addColumn("Nome");
		dadosTabela.addColumn("Gênero");
		dadosTabela.addColumn("Plataforma");
		dadosTabela.addColumn("Classificação");
		dadosTabela.addColumn("Valor");
		
		for(int i=0; i<Principal.vetorJogos.size(); i++) {
			dadosTabela.addRow(new Object[] {
				Principal.vetorJogos.get(i).getNome(),	
				Principal.vetorJogos.get(i).getGenero(),
				Principal.vetorJogos.get(i).getPlataforma(),
				Principal.vetorJogos.get(i).getClassificacao(),
				Principal.vetorJogos.get(i).getValor(),
					
					
			});
		}
	
		return dadosTabela;
	
	}
	
	//método excluir jogo
	public void excluir(int indice) {
		Principal.vetorJogos.remove(indice);
	}
	
	//Alterar jogo
	public void alterar(int indice, Jogo j) {
		Principal.vetorJogos.set(indice, j);
		
	}
	public boolean verfificar(Jogo j) {
		boolean confirm=true;
		String confirmNome=j.getNome(),confirmPlat=j.getPlataforma();
		for(int i=0;i<Principal.vetorJogos.size();i++) {
			if(confirmNome.contentEquals(Principal.vetorJogos.get(i).getNome())&&confirmPlat.contentEquals(Principal.vetorJogos.get(i).getPlataforma())) {
				confirm=false;	
			}	
			}	
		return confirm;
	}
	
	
}
