package acao;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import beans.Beans;

public class Acao {

	ArrayList<Beans> Jogos = new ArrayList<Beans>();
	
	public boolean verificar(Beans b) {
		boolean verificar=true;
		
		for(int i=0;i<Jogos.size();i++) {
		if(Jogos.size()==0) {
			break;
		}else if(b.getNome().contentEquals(Jogos.get(i).getNome())&&b.getPlataforma().contentEquals(Jogos.get(i).getPlataforma())) {
			verificar=false;
			break;
		}
		}
		return verificar;
	}

	public void cadastrar(Beans b) {
		Jogos.add(b);
	}

	public DefaultTableModel selecionar() {
		
		DefaultTableModel dadosTabela = new DefaultTableModel();
		dadosTabela.addColumn("Nome");
		dadosTabela.addColumn("Gênero");
		dadosTabela.addColumn("Plataforma");
		dadosTabela.addColumn("Classificação");
		dadosTabela.addColumn("Valor");
		
		for(int i=0;i<Jogos.size();i++) {
			dadosTabela.addRow(new Object[] {
					Jogos.get(i).getNome(),
					Jogos.get(i).getGenero(),
					Jogos.get(i).getPlataforma(),
					Jogos.get(i).getClassificacao(),
					Jogos.get(i).getValor()
					
			});
		}
		return dadosTabela;
	}

}
