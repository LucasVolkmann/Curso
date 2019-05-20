package exercicio01;

import java.util.Random;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Object[] res = {"A","B","C","D"};
		String[][] perguntasfinais = new String[10][2];
		String[][] perguntas = 
			{{"A área de um quadrado de lado medindo x é:"
					+ "\n(A) -> 2x"
					+ "\n(B) -> x²"
					+ "\n(C) -> 4x"
					+ "\n(D) -> x","B"},
			{"Na sala de aula, a professora descobriu que 40% dos alunos"
					+ "\n são corintianos, 30% torcem pro São Paulo, 20% são palmeirenses,"
					+ "\n 10% torcem pro Santos e o resto não gosta de futebol. Sabendo que"
					+ "\n existem 40 alunos na sala, quantos torcem para o São Paulo?"
					+ "\n(A) -> 24"
					+ "\n(B) -> 20"
					+ "\n(C) -> 16"
					+ "\n(D) -> 12","D"},
			{"Ana tem 20 anos e morou durante 5 anos nos Estados Unidos,"
					+ "\n 4 anos na Austrália e o resto no Brasil. Em porcentagem,"
					+ "\n quantos anos ela morou no hemisfério sul?"
					+ "\n(A) -> 50%"
					+ "\n(B) -> 25%"
					+ "\n(C) -> 75%"
					+ "\n(D) -> 60%","C"},
			{"Se a razão de semelhança de dois polígonos é" 
					+ "\nk, então a razão entre suas  áreas  é:"
					+ "\n(A) -> k"
					+ "\n(B) -> 2k"
					+ "\n(C) -> k²"
					+ "\n(D) -> 4k","C"},
			{"Assumindo que a altura de um retângulo é a metade de sua base. Se"
					+ "\n sua área é de 450m², Qual é sua altua?"
					+ "\n(A) -> 45m"
					+ "\n(B) -> 30m"
					+ "\n(C) -> 15m"
					+ "\n(D) -> 25m","C"},
			{"Um ônibus parte às 15h de São Paulo com destino ao Rio de Janeiro"
					+ "\n e previsão de chegada às 21h. Se a distância entre os dois destinos"
					+ "\né de 450km qual será sua velocidade média (km/h) do ônibus no percurso?"
					+ "\n(A) -> 45km/h"
					+ "\n(B) -> 15km/h"
					+ "\n(C) -> 75km/h"
					+ "\n(D) -> 10km/h","C"},
			{"(Fuvest) Após chover na cidade de São Paulo, as águas da chuva "
					+ "\ndescerão o rio Tietê até o rio Paraná, percorrendo cerca de 1.000km."
					+ "\n Sendo de 4km/h a velocidade média das águas, o percurso mencionado"
					+ "\n será cumprido pelas águas da chuva em aproximadamente:"
					+ "\n(A) -> 30 dias"
					+ "\n(B) -> 10 dias"
					+ "\n(C) -> 25 dias"
					+ "\n(D) -> 2 dias","B"},
			{"Analise as afirmações a respeito da inércia e marque a alternativa falsa:"
					+ "\n(A) -> A massa é a medida quantitativa da inércia."
					+ "\n(B) -> Na falta de atrito, um corpo em movimento permanecerá em movimento perpetuamente."
					+ "\n(C) -> A situação de movimento retilíneo uniforme é denominada de equilíbrio dinâmico."
					+ "\n(D) -> A tendência de um corpo em movimento uniforme e com aceleração constante é manter-se"
					+ "\n em movimento perpetuamente.","D"},
			{"(UNESP) As estatísticas indicam que o uso de cinto de segurança deve ser"
					+ "\n obrigatório para prevenir lesões mais graves em motoristas e passageiros"
					+ "\n no caso de acidentes. Fisicamente, a função do cinto está relacionada com a:"
					+ "\n(A) -> Primeira Lei de Newton"
					+ "\n(B) -> Lei de Snell"
					+ "\n(C) -> Lei de Ampére"
					+ "\n(D) -> Primeira Lei de Kepler","A"},
			{"Um corpo é lançado verticalmente para cima com velociadade 10m/s. Sabendo que g=10m/s² e"
					+ "\ndesprezando a resistência do ar. Qual será a velocidade do corpo quando ele retornar ao ponto de lançamento? "
					+ "\n(A) -> 25m/s"
					+ "\n(B) -> 10m/s"
					+ "\n(C) -> 30m/s"
					+ "\n(D) -> 20m/s","B"},
			{"(Unisa-SP) Qual dos organismos abaixo não possui parede celular?"
					+ "\n(A) ->Bactérias"
					+ "\n(B) ->Algas "
					+ "\n(C) ->Células animais "
					+ "\n(D) ->Células vegetais","C"},
			{"(PUC-PR) As microvilosidades do epitélio do intestino apresentam"
					+ "\ncomo principal função:"
					+ "\n(A) -> Evitar perder água"
					+ "\n(B) -> Aumentar a superfície de absorção"
					+ "\n(C) -> Realizar os movimentos peristálticos"
					+ "\n(D) -> Facilitar a retenção dos alimentos","B"},
			{"(Uergs-RS) Quando o feijão é cozido em água com sal observa-se"
					+ "\nque ele murcha, pois:"
					+ "\n(A) -> O grão perde água por osmose"
					+ "\n(B) -> Os sais do grão passsam pela água por difusão"
					+ "\n(C) -> O calor estimula o transporte ativo das proteínas da água"
					+ "\npara o grão"
					+ "\n(D) -> o transporte passivo das proteínas ocorre do grão para"
					+ "\n a água","A"},
			{"(UEL-PR) Qual das organelas celulares mencionadas adiante possiu menor valor "
					+ "\nadaptativo para micro organismos que habitam os fundos dos oceanos? "
					+ "\n(A) -> Vacúolo"
					+ "\n(B) -> Mitocôndria"
					+ "\n(C) -> Ribossomo"
					+ "\n(D) -> Cloroplasto","D"},
			{"(UnB-DF) Todos os itens indicam alguma importância ligada à atividade "
					+ "\nde fungos exceto:"
					+ "\n(A) -> Podem causar doenças chamadas micoses"
					+ "\n(B) -> Desempenham papel fermentativo"
					+ "\n(C) -> Produção autotrófica de substâncias orgânicas para consumo de "
					+ "\noutros seres"
					+ "\n(D) -> Alguns produzem antibióticos","C"}};
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
				resposta = JOptionPane.showOptionDialog(null, "Jogador: "+nome[contadorNome]+"\n\n"+perguntasfinais[contadorResp][0], "Questão "+(contadorResp+1), JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, res, 0);
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
				JOptionPane.showMessageDialog(null, "Selecione uma resposta válida!");
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
				resultado+=(1+i)+"º Lugar: "+nome[i]+
								 "\nAcertos: "+certa[i]+
								 "\nErros: "+errada[i]+
								 "\n\n";
			}
			JOptionPane.showMessageDialog(null, resultado);
	}

}
