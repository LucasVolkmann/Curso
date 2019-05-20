package atividades;

import javax.swing.JOptionPane;

public class Atividade11 {

	public static void main(String[] args) {
		
		Object[] se = {"M","F"};
		Object[] fid2 = {"Sim","Não"};
		Object[] val = {"Sim","Não"};
		double sall= 0, inss = 0, fid3, val3 = 0, ms = 0, id, id1 = 0, id2 = 0, id3 = 0, id4 = 0, total = 0, m = 0, f = 0, fil, falt, hrs, hrse, hrse2, sal = 0;
		String nome, nomeM = "";
		int val2, fid, se2, cargo, cdjj = 0, cdjp = 0, cdjs = 0, cabd = 0, caj = 0, cap = 0, cas = 0, cads = 0, cgp = 0, continuar = 0;
		
		do {
			
			total++;
			nome = JOptionPane.showInputDialog("Nome");
			hrs = Double.parseDouble(JOptionPane.showInputDialog("Horas trabalhadas"));
			
			boolean cont3 = true;
			do {
			cargo = Integer.parseInt(JOptionPane.showInputDialog("Selecione seu cargo:\n1 - Desenvolverdor Java Júnior\n2 - Desenvolvedor Java Pleno\n3 - Desenvolvedor Java Sênior\n4 - Administrador de Banco de Dados\n5 - Analista Júnior\n6 - Analista Pleno\n7 - Analista Sênior\n8 - Arquiteto de Software\n9 - Gerente de Projetos"));
			if(cargo < 0 || cargo >9) {
				System.out.println("Inválido");
				cont3 = true;
			}else if(cargo == 1) {
				sal = hrs*5;
				cdjj++;
				cont3 = false;
			}else if(cargo == 2) {
				sal = hrs*7;
				cdjp++;
				cont3 = false;
			}else if(cargo == 3) {
				sal = hrs*10;
				cdjs++;
				cont3 = false;
			}else if(cargo == 4) {
				sal = hrs*12;
				cabd++;
				cont3 = false;
			}else if(cargo == 5) {
				sal = hrs*15;
				caj++;
				cont3 = false;
			}else if(cargo == 6) {
				sal = hrs*17;
				cap++;
				cont3 = false;
			}else if(cargo == 7) {
				sal = hrs*20;
				cas++;
				cont3 = false;
			}else if(cargo == 8) {
				sal = hrs*22;
				cads++;
				cont3 = false;
			}else{
				sal = hrs*25;
				cgp++;
				cont3 = false;
			}
			}while(cont3 == true);
			
			hrse = Double.parseDouble(JOptionPane.showInputDialog("Horas trabalhadas com adicional de 50%"));
			
			if(cargo == 1) {
				sal += (hrs*5)*1.5;
			}else if(cargo == 2) {
				sal += (hrs*7)*1.5;
			}else if(cargo == 3) {
				sal += (hrs*10)*1.5;
			}else if(cargo == 4) {
				sal += (hrs*12)*1.5;
			}else if(cargo == 5) {
				sal += (hrs*15)*1.5;
			}else if(cargo == 6) {
				sal += (hrs*17)*1.5;
			}else if(cargo == 7) {
				sal += (hrs*20)*1.5;
			}else if(cargo == 8) {
				sal += (hrs*22)*1.5;
			}else{
				sal += (hrs*25)*1.5;
			}
			
			hrse2 = Double.parseDouble(JOptionPane.showInputDialog("Horas trabalhadas com adicional de 100%"));
			
			if(cargo == 1) {
				sal += (hrs*5)*2;
			}else if(cargo == 2) {
				sal += (hrs*7)*2;
			}else if(cargo == 3) {
				sal += (hrs*10)*2;
			}else if(cargo == 4) {
				sal += (hrs*12)*2;
			}else if(cargo == 5) {
				sal += (hrs*15)*2;
			}else if(cargo == 6) {
				sal += (hrs*17)*2;
			}else if(cargo == 7) {
				sal += (hrs*20)*2;
			}else if(cargo == 8) {
				sal += (hrs*22)*2;
			}else{
				sal += (hrs*25)*2;
			}
			
			if(sal <= 2000) {
				inss += sal*0.05;
			}else if(sal <= 3500) {
				inss += sal*0.07;
			}else if(sal <= 5600) {
				inss += sal*0.08;
			}else {
				inss += sal*0.1;
			}
			
			
			val2 = JOptionPane.showOptionDialog(null,"Usa vale transporte?","",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,val,0);
			if(val2 == 1) {
				val3 = sal*0.06;
			}
			
			
			se2 = JOptionPane.showOptionDialog(null,"Qual seu sexo","",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,se,0);
			
			switch(se2) {
			case 0:
				m++;
			break;
			case 1:
				f++;
			break;
			}
			
			boolean cont2 = true;
			do {
				id = Double.parseDouble(JOptionPane.showInputDialog("Idade"));
				if((id <18)||(id > 101)){
					cont2 = true;
				}else if((id >=18 ) && (id <= 26)) {
					id1++;
					cont2 = false;
				}else if((id > 27)&&(id <= 40)) {
					id2++;
					cont2 = false;
				}else if((id > 41)&&(id <= 50)) {
					id3++;
					cont2 = false;
				}else {
					id4++;
					cont2 = false;
				}
			}while(cont2 == true);
			
			falt = Double.parseDouble(JOptionPane.showInputDialog("Qtdade faltas"));
			if(falt == 0) {
				sal += 200;
			}
			
			fil = Double.parseDouble(JOptionPane.showInputDialog("Qtdade de filhos"));
			sal += 50*fil;
			
			fid = JOptionPane.showOptionDialog(null,"Associado ao clube fidelidade? (Descontos em bares, restaurantes, farmácias, etc...)","",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,fid2,0);
			switch(fid) {
			case 0:
				sall += sal - (val3 + inss + 110);
			break;
			case 1:
				sall += sal - (val3 + inss);
			break;
			}
			
			if(sall > ms ) {
				nomeM = nome;
				ms = sall;
			}
			
			JOptionPane.showMessageDialog(null, "Salário líquido: R$"+sall);
			
				continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
					
					
		}while(continuar == 0);
		
		String resultado = "Total registrados"+total;
		   resultado+="\nQuantidade de homens"+m+", "+((100/total)*m)+"% do total.";
		   resultado+="\nQuantidade de mulheres"+m+", "+((100/total)*m)+"% do total.";
		   resultado+="\nFuncionários entre 18 e 26 anos: "+id1;
		   resultado+="\nFuncionários entre 27 e 40 anos: "+id2;
		   resultado+="\nFuncionários entre 41 e 50 anos: "+id3;
		   resultado+="\nFuncionários com idade superior a 50 anos: "+id4;
		   resultado+="\nDesenvolvedores Java Júnior "+cdjj+", "+((100/total)*cdjj)+"% do total.";
		   resultado+="\nDesenvolvedores Java Pleno "+cdjp+", "+((100/total)*cdjp)+"% do total.";
		   resultado+="\nDesenvolvedores Java Sênior "+cdjs+", "+((100/total)*cdjs)+"% do total.";
		   resultado+="\nAdministradores de Banco de Dados "+cabd+", "+((100/total)*cabd)+"% do total.";
		   resultado+="\nAnalista Júnior "+caj+", "+((100/total)*caj)+"% do total.";
		   resultado+="\nAnalista Pleno "+cap+", "+((100/total)*cap)+"% do total.";
		   resultado+="\nAnalista Sênior "+cas+", "+((100/total)*cas)+"% do total.";
		   resultado+="\nArquiteto de Software "+cads+", "+((100/total)*cads)+"% do total.";
		   resultado+="\nGerente de Projetos "+cgp+", "+((100/total)*cgp)+"% do total.";
		   resultado+="\nMaior salário: "+nomeM+": R$"+ms; 
		   
		JOptionPane.showMessageDialog(null, resultado);
		
	}

}