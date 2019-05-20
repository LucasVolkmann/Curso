package atividades;

import javax.swing.JOptionPane;

public class Atividade4 {

	public static void main(String[] args) {
		
		
		Object[] op = {"Excelente","Ótimo","Bom","Regular","Ruim"};
		double exc = 0, ot = 0, bom = 0, reg = 0, ruim = 0, total = 0, continuar = 0, cri = 0, ado = 0, adu = 0;
		int msg = 0;
		do{
			
			total++;
			msg = JOptionPane.showOptionDialog(null,"Avaliação do Filme","",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,op,0);

				
			switch(msg) {
			case 0:
				exc++;
			break;	
			case 1:
				ot++;
			break;
			case 2:	
				bom++;
			break;	
			case 3:
				reg++;
			break;	
			case 4:
				ruim++;
			break;
			}
			
			
			boolean cont2 = true;
			do {
				double id = Double.parseDouble(JOptionPane.showInputDialog("Idade"));
				if((id <0)||(id > 101)){
					cont2 = true;
				}else if((id >=0 ) && (id <= 9)) {
					cri++;
					cont2 = false;
				}else if((id > 9)&&(id <= 17)) {
					ado++;
					cont2 = false;
				}else{
					adu++;
					cont2 = false;
				}
			}while(cont2 == true);
				
				continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
					
					
		}while(continuar == 0);
		
		String resultado = "Total de Votos"+total;
		   resultado+="\nExcelente: "+((100/total)*exc)+"%";
		   resultado+="\nÓtimo: "+((100/total)*ot)+"%";
		   resultado+="\nBom: "+((100/total)*bom)+"%";
		   resultado+="\nRegular: "+((100/total)*reg)+"%";
		   resultado+="\nRuim: "+((100/total)*ruim)+"%";
		   resultado+="\n ";
		   resultado+="\nCrianças: "+cri;
		   resultado+="\nAdolescentes: "+ado;
		   resultado+="\nAdultos: "+adu;
		   
		   
		   JOptionPane.showMessageDialog(null, resultado);
		
		
	}

}
