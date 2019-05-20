package acao;

import javax.swing.table.DefaultTableModel;

import beans.Beans;
import dados.Array;

public class Acao {

	public DefaultTableModel selecionar() {
		
		DefaultTableModel Tabela = new DefaultTableModel();
		Tabela.addColumn("Colaborador");
		Tabela.addColumn("Sal�rio Liquido");
		
		for(int i=0;i<Array.Colaborador.size();i++) {
			Tabela.addRow(new Object[] {
					Array.Colaborador.get(i).getNome(),
					Array.Colaborador.get(i).getSalarioLiquido()					
			});
		}
		return Tabela;
	}
	
	public int OBTERsalarioBruto(int indice) {
		
		int salarioBruto=0;
		switch(indice) {
		case 1:
			salarioBruto=900;
			break;
		case 2:
			salarioBruto=1300;
			break;
		case 3:
			salarioBruto=1800;
			break;
		case 4:
			salarioBruto=2400;
			break;
		case 5:
			salarioBruto=2700;
			break;
		case 6:
			salarioBruto=3200;
			break;
		case 7:
			salarioBruto=3600;
			break;
		case 8:
			salarioBruto=4400;
			break;
		}
		
		return salarioBruto;
	}
	
	public double imposto(int i) {
		double imposto=0;
		switch(i) {
			case 1:
			imposto=0;
			break;
			case 2:
			imposto=0.04;
			break;
			case 3:
			imposto=0.055;
			break;
			case 4:
			imposto=0.06;
			break;
			case 5:
			imposto=0.065;
			break;
			case 6:
			imposto=0.07;
			break;
			case 7:
			imposto=0.075;
			break;
			case 8:
			imposto=0.08;
			break;
		}
		return imposto;
	}
	
	public double vale(boolean i) {
		double vale=0;
		if(i) {
			vale=0.06;
		}
		return vale;
	}
	
	public int faltas(int i) {
		int faltas=0;
		if(i==0) {
			faltas+=50;
		}
		return faltas;
	}
	
	public double calculoLIQUIDO(int bruto,boolean vale,double imposto,int falta,boolean fidelidade,boolean plano) {
		double resp=bruto*(1-imposto);
		if(vale) {
			resp=resp-(bruto*vale(vale));
		}
		if(fidelidade) {
			resp-=100;
		}
		if(falta==0) {
			resp+=50;
		}
		if(plano) {
			resp=resp*0.97;
		}
		if(bruto==0) {
			resp=0;
		}
		return resp;
	}
	
	public boolean validacao(Beans b) {
		boolean valida=true;
		for(int i=0;i<Array.Colaborador.size();i++) {
			if(b.getNome().contentEquals(Array.Colaborador.get(i).getNome())) {
				valida=false;
			}
		}
		if(b.getNome().contentEquals("")) {
			valida=false;
		}
		return valida;
	}
	
	public void adic(Beans b) {
		Array.Colaborador.add(b);
	}
	
	public void edit(Beans b,int indice) {
		Array.Colaborador.set(indice,b);
	}
	
	public void exc(int indice) {
		Array.Colaborador.remove(indice);
	}
	
	public String contadorDeCargo() {
		String resultado="";
		
		int est=0,pjr=0,ppl=0,psr=0,ajr=0,apl=0,asr=0,arq=0;
		for(int i=0;i<Array.Colaborador.size();i++) {
			
			switch(Array.Colaborador.get(i).getCargo()) {
			case "Estagi�rio":
				est++;
				break;
			case "Desenvolvedor Jr":
				pjr++;
				break;
			case "Desenvolvedor Pleno":
				ppl++;
				break;
			case "Desenvolvedor S�nior":
				psr++;
				break;
			case "Analista de Sistemas Jr":
				ajr++;
				break;
			case "Analista de Sistemas Pleno":
				apl++;
				break;
			case "Analista de Sistemas S�nior":
				asr++;
				break;
			case "Arquiteto de Software":
				arq++;
				break;
			}
		
		}
		resultado = "Estagi�rio: "+est+
					"\nProramador Jr: "+pjr+
					"\nProgramador Pleno: "+ppl+
					"\nProgramador S�nior: "+psr+
					"\nAnalista de Sistemas Jr: "+ajr+
					"\nAnalista de Sistemas Pleno: "+apl+
					"\nAnalista de Sistemas S�nior: "+asr+
					"\nArquiteto de Software: "+arq;
		
		return resultado;
	}
	
	public int contadorVale() {
		int cont=0;
		
		for(int i=0;i<Array.Colaborador.size();i++) {
			if(Array.Colaborador.get(i).isValeTransporte()){
				cont++;
			}
		}
		
		return cont;
	}
	
	public int contadorClube() {
		int cont=0;
		
		for(int i=0;i<Array.Colaborador.size();i++) {
			if(Array.Colaborador.get(i).isClubeFidelidade()){
				cont++;
			}
		}
		
		return cont;
	}
	
	public int contadorPlano() {
		int cont=0;
		
		for(int i=0;i<Array.Colaborador.size();i++) {
			if(Array.Colaborador.get(i).isPlanoSaude()){
				cont++;
			}
		}
		
		return cont;
	}
	
	public String contadorFaltas() {
		String falt="";
		int fixo=0,nen=0,at3=0,at5=0,ac5=0;
		
		for(int i=0;i<Array.Colaborador.size();i++) {
			fixo=Array.Colaborador.get(i).getFaltas();
			if(fixo==0) {
				nen++;
			}else if(fixo<=3) {
				at3++;
			}else if(fixo<=5) {
				at5++;
			}else if(fixo>5) {
				ac5++;
			} 
		}
		
		falt="\n\nNenhuma falta: "+nen+
				"\nAt� 3 faltas: "+at3+
				"\nAt� 5 faltas: "+at5+
				"\nAcima de 5 faltas: "+ac5;
		
		return falt;
	}
}
