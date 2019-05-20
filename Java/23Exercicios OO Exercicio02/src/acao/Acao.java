package acao;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import array.Array;
import beans.Beans;


public class Acao {
	
	
	public void cadastrar(Beans b) {
		Array.vetorJogos.add(b);
	}
	
	public void alterar(Beans b,int indice) {
		Array.vetorJogos.set(indice, b);
	}
	
	public void excluir(int indice) {
		Array.vetorJogos.remove(indice);
	}
	
	public boolean login(Beans b) {
		boolean login=false;
		for(int i=0;i<Array.vetorJogos.size();i++) {
			if(b.getNome().contentEquals(Array.vetorJogos.get(i).getNome())&&b.getSenha().contentEquals(Array.vetorJogos.get(i).getSenha())) {
			login=true;	
			break;
		}
		}
		return login;
	}
	public int indicar(Beans b) {
		int indice=0;
		for(int i=0;i<Array.vetorJogos.size();i++) {
			if(b.getNome().contentEquals(Array.vetorJogos.get(i).getNome())&&b.getSenha().contentEquals(Array.vetorJogos.get(i).getSenha())) {
		indice=i;
		break;
		}
		}
		return indice;
	}
	
	public boolean adm(int i) {
		boolean adm=false;
		if(Array.vetorJogos.get(i).getTipo().contentEquals("Administrador")) {
			adm=true;
		}
		return adm;
	}
	
	public boolean valide(Beans b) {
		boolean verificar=true;
		for(int i=0;i<Array.vetorJogos.size();i++) {
			if(b.getNome().contentEquals(Array.vetorJogos.get(i).getNome())) {
			JOptionPane.showMessageDialog(null, "Este nome de usuário ja existe!");
			verificar=false;
			break;
			}
			}
		
		return verificar;
	}
	
	public DefaultTableModel selecionar() {
		
		DefaultTableModel dadosTabela = new DefaultTableModel();
		dadosTabela.addColumn("Nome");
		dadosTabela.addColumn("Tipo");
		dadosTabela.addColumn("E-mail");
		dadosTabela.addColumn("Data do cadastro");
		
		for(int i=0; i<Array.vetorJogos.size(); i++) {
			dadosTabela.addRow(new Object[] {
					Array.vetorJogos.get(i).getNome(),	
					Array.vetorJogos.get(i).getTipo(),
					Array.vetorJogos.get(i).getEmail(),
					Array.vetorJogos.get(i).getData()
					
			});
		}
	return dadosTabela;
	}
		
}
