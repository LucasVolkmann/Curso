package exercicio11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String[][]usu=new String[6][20];
		Object[]sexo={"Masculino","Feminino"};
		double pessoas,masc=0,fem=0,altura,IMC=0;
		int sexo1=0,peso,MAP=0,ABP=0,PN=0,ACP=0,O1=0,O2=0,O3=0;
		pessoas=Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas deseja cadastrar?"));
		for(int i=0;i<pessoas;i++) {
			usu[0][i]=JOptionPane.showInputDialog("Qual seu nome?");
			sexo1=JOptionPane.showOptionDialog(null, "Qual seu sexo?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, sexo, 0);
			switch(sexo1) {
			case 0:
				masc++;
				usu[1][i]="Homen";
				break;
			case 1:
				fem++;
				usu[1][i]="Mulher";
				break;
			}
			altura=Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura?"));
			usu[2][i]=""+altura;
			peso=Integer.parseInt(JOptionPane.showInputDialog("Qual seu peso?"));
			usu[3][i]=""+peso;
			IMC=(peso/(altura*altura));
			usu[4][i]=""+IMC;
			if(IMC<17) {
			MAP++;	
			usu[5][i]="Muito abaixo do peso";	
				}else if(IMC<=18.49) {
				ABP++;	
				usu[5][i]="Abaixo do peso";	
					}else if(IMC<=24.99) {
					PN++;	
					usu[5][i]="Peso normal";	
						}else if(IMC<=29.99) {
						ACP++;	
						usu[5][i]="Acima do peso";	
								}else if(IMC<34.99) {
								O1++;	
								usu[5][i]="Obesidade I";	
										}else if(IMC<39.99) {
										O2++;
										usu[5][i]="Obesidade II";		
												}else if(IMC>40) {		
												O3++;
												usu[5][i]="Obesidade III";
			}
		
		}
		String resultado2="",resultado="";
		for(int i=0;i<pessoas;i++) {
			resultado+="Nome: "+usu[0][i]+"\nIMC: "+usu[4][i]+"\nSituação: "+usu[5][i];
			resultado+="\n\n";
		}
		resultado+="\nPercentual de:\n"
				+ "Homens - "+(masc*100/pessoas)+"%"
				+ "\nMulheres - "+(fem*100/pessoas)+"%"
				+ "\n\nQuantidade de pessoas: "
				+ "\nMuito abaixo do peso: "+MAP
				+ "\nAbaixo do peso: "+ABP
				+ "\nPeso normal: "+PN
				+ "\nAcima do peso: "+ACP
				+ "\nObesidade I: "+O1
				+ "\nObesidade II: "+O2
				+ "\nObesidade III: "+O3;
		JOptionPane.showMessageDialog(null, resultado);
	
	}

}
