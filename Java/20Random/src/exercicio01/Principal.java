package exercicio01;

import java.util.Random;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Object[] res = {"A","B","C","D"};
		String[][] perguntasfinais = new String[10][2];
		String[][] perguntas = 
			{{"A �rea de um quadrado de lado medindo x �:"
					+ "\n(A) -> 2x"
					+ "\n(B) -> x�"
					+ "\n(C) -> 4x"
					+ "\n(D) -> x","B"},
			{"Na sala de aula, a professora descobriu que 40% dos alunos"
					+ "\n s�o corintianos, 30% torcem pro S�o Paulo, 20% s�o palmeirenses,"
					+ "\n 10% torcem pro Santos e o resto n�o gosta de futebol. Sabendo que"
					+ "\n existem 40 alunos na sala, quantos torcem para o S�o Paulo?"
					+ "\n(A) -> 24"
					+ "\n(B) -> 20"
					+ "\n(C) -> 16"
					+ "\n(D) -> 12","D"},
			{"Ana tem 20 anos e morou durante 5 anos nos Estados Unidos,"
					+ "\n 4 anos na Austr�lia e o resto no Brasil. Em porcentagem,"
					+ "\n quantos anos ela morou no hemisf�rio sul?"
					+ "\n(A) -> 50%"
					+ "\n(B) -> 25%"
					+ "\n(C) -> 75%"
					+ "\n(D) -> 60%","C"},
			{"Se a raz�o de semelhan�a de dois pol�gonos �" 
					+ "\nk, ent�o a raz�o entre suas  �reas  �:"
					+ "\n(A) -> k"
					+ "\n(B) -> 2k"
					+ "\n(C) -> k�"
					+ "\n(D) -> 4k","C"},
			{"Assumindo que a altura de um ret�ngulo � a metade de sua base. Se"
					+ "\n sua �rea � de 450m�, Qual � sua altua?"
					+ "\n(A) -> 45m"
					+ "\n(B) -> 30m"
					+ "\n(C) -> 15m"
					+ "\n(D) -> 25m","C"},
			{"Um �nibus parte �s 15h de S�o Paulo com destino ao Rio de Janeiro"
					+ "\n e previs�o de chegada �s 21h. Se a dist�ncia entre os dois destinos"
					+ "\n� de 450km qual ser� sua velocidade m�dia (km/h) do �nibus no percurso?"
					+ "\n(A) -> 45km/h"
					+ "\n(B) -> 15km/h"
					+ "\n(C) -> 75km/h"
					+ "\n(D) -> 10km/h","C"},
			{"(Fuvest) Ap�s chover na cidade de S�o Paulo, as �guas da chuva "
					+ "\ndescer�o o rio Tiet� at� o rio Paran�, percorrendo cerca de 1.000km."
					+ "\n Sendo de 4km/h a velocidade m�dia das �guas, o percurso mencionado"
					+ "\n ser� cumprido pelas �guas da chuva em aproximadamente:"
					+ "\n(A) -> 30 dias"
					+ "\n(B) -> 10 dias"
					+ "\n(C) -> 25 dias"
					+ "\n(D) -> 2 dias","B"},
			{"Analise as afirma��es a respeito da in�rcia e marque a alternativa falsa:"
					+ "\n(A) -> A massa � a medida quantitativa da in�rcia."
					+ "\n(B) -> Na falta de atrito, um corpo em movimento permanecer� em movimento perpetuamente."
					+ "\n(C) -> A situa��o de movimento retil�neo uniforme � denominada de equil�brio din�mico."
					+ "\n(D) -> A tend�ncia de um corpo em movimento uniforme e com acelera��o constante � manter-se"
					+ "\n em movimento perpetuamente.","D"},
			{"(UNESP) As estat�sticas indicam que o uso de cinto de seguran�a deve ser"
					+ "\n obrigat�rio para prevenir les�es mais graves em motoristas e passageiros"
					+ "\n no caso de acidentes. Fisicamente, a fun��o do cinto est� relacionada com a:"
					+ "\n(A) -> Primeira Lei de Newton"
					+ "\n(B) -> Lei de Snell"
					+ "\n(C) -> Lei de Amp�re"
					+ "\n(D) -> Primeira Lei de Kepler","A"},
			{"Um corpo � lan�ado verticalmente para cima com velociadade 10m/s. Sabendo que g=10m/s� e"
					+ "\ndesprezando a resist�ncia do ar. Qual ser� a velocidade do corpo quando ele retornar ao ponto de lan�amento? "
					+ "\n(A) -> 25m/s"
					+ "\n(B) -> 10m/s"
					+ "\n(C) -> 30m/s"
					+ "\n(D) -> 20m/s","B"},
			{"(Unisa-SP) Qual dos organismos abaixo n�o possui parede celular?"
					+ "\n(A) ->Bact�rias"
					+ "\n(B) ->Algas "
					+ "\n(C) ->C�lulas animais "
					+ "\n(D) ->C�lulas vegetais","C"},
			{"(PUC-PR) As microvilosidades do epit�lio do intestino apresentam"
					+ "\ncomo principal fun��o:"
					+ "\n(A) -> Evitar perder �gua"
					+ "\n(B) -> Aumentar a superf�cie de absor��o"
					+ "\n(C) -> Realizar os movimentos perist�lticos"
					+ "\n(D) -> Facilitar a reten��o dos alimentos","B"},
			{"(Uergs-RS) Quando o feij�o � cozido em �gua com sal observa-se"
					+ "\nque ele murcha, pois:"
					+ "\n(A) -> O gr�o perde �gua por osmose"
					+ "\n(B) -> Os sais do gr�o passsam pela �gua por difus�o"
					+ "\n(C) -> O calor estimula o transporte ativo das prote�nas da �gua"
					+ "\npara o gr�o"
					+ "\n(D) -> o transporte passivo das prote�nas ocorre do gr�o para"
					+ "\n a �gua","A"},
			{"(UEL-PR) Qual das organelas celulares mencionadas adiante possiu menor valor "
					+ "\nadaptativo para micro organismos que habitam os fundos dos oceanos? "
					+ "\n(A) -> Vac�olo"
					+ "\n(B) -> Mitoc�ndria"
					+ "\n(C) -> Ribossomo"
					+ "\n(D) -> Cloroplasto","D"},
			{"(UnB-DF) Todos os itens indicam alguma import�ncia ligada � atividade "
					+ "\nde fungos exceto:"
					+ "\n(A) -> Podem causar doen�as chamadas micoses"
					+ "\n(B) -> Desempenham papel fermentativo"
					+ "\n(C) -> Produ��o autotr�fica de subst�ncias org�nicas para consumo de "
					+ "\noutros seres"
					+ "\n(D) -> Alguns produzem antibi�ticos","C"}};
		Random gerar = new Random();
		String verificar="";
		String[] nome= new String[10];
		int[]certa = new int[10];
		int[]errada = new int[10];
		int cont,aleat,continuar,resposta,contadorResp=0,contadorNome=0;
		do {
			nome[contadorNome] = JOptionPane.showInputDialog("Nome:");
			for(cont=0;cont<10;cont++) {
			aleat=gerar.nextInt(15);
			perguntasfinais[cont][0] = perguntas[aleat][0];
			perguntasfinais[cont][1] = perguntas[aleat][1];
			for(int i=1;i<10;i++) {
				if(cont-i<0) {
					break;
				}
				if(perguntasfinais[cont][0].contentEquals(perguntasfinais[cont-i][0])) {
					cont--;
					break;
				}
			}
			}
			do {
				resposta = JOptionPane.showOptionDialog(null, "Jogador: "+nome[contadorNome]+"\n\n"+perguntasfinais[contadorResp][0], "Quest�o "+(contadorResp+1), JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, res, 0);
				if(resposta==0||resposta==1||resposta==2||resposta==3) {
			switch(resposta) {
				case 0:
					verificar="A";
					if(perguntasfinais[contadorResp][1].equals(verificar)) {
					certa[contadorNome]++;
					contadorResp++;
					}else{
					errada[contadorNome]++;
					contadorResp++;
					}
				break;
				case 1:
					verificar="B";
					if(perguntasfinais[contadorResp][1].equals(verificar)) {
					certa[contadorNome]++;
					contadorResp++;
					}else{
					errada[contadorNome]++;
					contadorResp++;
					}	
				break;
				case 2:
				verificar="C";
					if(perguntasfinais[contadorResp][1].equals(verificar)) {
					certa[contadorNome]++;
					contadorResp++;
					}else{
					errada[contadorNome]++;
					contadorResp++;
					}
				break;
				case 3:
					verificar="D";
					if(perguntasfinais[contadorResp][1].equals(verificar)) {
					certa[contadorNome]++;
					contadorResp++;
					}else{
					errada[contadorNome]++;
					contadorResp++;
					}
				break;
				}
				}else {
				JOptionPane.showMessageDialog(null, "Selecione uma resposta v�lida!");
				}
			}while(contadorResp<=9);
			contadorNome++;
			contadorResp=0;
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		}while(continuar==0);
			int segurar,segurar1;
			String segurarN;
		for(int i=0;i<contadorNome;i++) {
			for(int i2=i+1;i2<contadorNome;i2++) {
				if(certa[i]<certa[i2]) {
					segurar=certa[i];
					certa[i]=certa[i2];
					certa[i2]=segurar;
					segurar1=errada[i];
					errada[i]=errada[i2];
					errada[i2]=segurar1;
					segurarN=nome[i];
					nome[i]=nome[i2];
					nome[i2]=segurarN;
				}
			}
		}	
			String resultado="";
			for(int i=0;i<contadorNome;i++) {
				resultado+=(1+i)+"� Lugar: "+nome[i]+
								 "\nAcertos: "+certa[i]+
								 "\nErros: "+errada[i]+
								 "\n\n";
			}
			JOptionPane.showMessageDialog(null, resultado);
	}

}
