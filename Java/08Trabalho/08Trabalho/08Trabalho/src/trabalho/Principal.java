package trabalho;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;







public class Principal {

	public static void main(String[] args) {
		Object[]gaba = {"A","B","C","D"};
		int largura=1000,altura=700;
		String[][] perguntasMAT = 
				{{"A �rea de um quadrado de lado medindo x �:"
						+ "\n(A) -> 2x"
						+ "\n(B) -> 2�"
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
						+ "\n(D) -> 25m","C"}};
		String[][] perguntasFIS = 
				{{"Um �nibus parte �s 15h de S�o Paulo com destino ao Rio de Janeiro"
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
						+ "\n(D) -> 20m/s","B"}};
		String[][] perguntasBIO = 
				{{"(Unisa-SP) Qual dos organismos abaixo n�o possui parede celular?"
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
		String[][] perguntasQUI = 
				{{"(UFRR) Um sistema onde os componentes s�o apenas �gua no estado l�quido e"
						+ "\n3 cubos de gelo � do tipo:"
						+ "\n(A) -> Heterog�neo com duas fases"
						+ "\n(B) -> Heterog�neo com uma fase"
						+ "\n(C) -> Homog�neo"
						+ "\n(D) -> Heterog�neo com tr�s fases","A"},
				{"(Uece) Os volumes dos gases que reagem ou que se formam, quando medidos"
						+ "\nnas mesmas condi��es de temperatura e press�o, guardam entre si uma rela��o"
						+ "\nde n�meros pequenos e inteiros. Este � o enunciado da lei de:"
						+ "\n(A) -> Dalton"
						+ "\n(B) -> Ralf o Grande"
						+ "\n(C) -> Clapeyron"
						+ "\n(D) -> Gay-Lussac","D"},
				{"(PUC-RS) A condutibilidade el�trica do cobre pode ser explicada pelo"
						+ "\nfato de:"
						+ "\n(A) -> Ser s�lido a temperatura ambiente(25�C)"
						+ "\n(B) -> Formar um aglomerado molecular"
						+ "\n(C) -> Existirem el�trons livres entre seus c�tions"
						+ "\n(D) -> Ocorrer ruptura das suas liga��es i�nicas","C"},
				{"Dadas as esp�cies qu�micas a seguir, qual delas pode ser classificada "
						+ "\ncomo um �cido de Arrhenius?"
						+ "\n(A) -> HCl"
						+ "\n(B) -> KOH"
						+ "\n(C) -> H2O"
						+ "\n(D) -> LiH","A"},
				{"(Fuvest) - Assinale a alternativa que apresenta dois produtos "
						+ "\ncaseiros com propriedades �cidas."
						+ "\n(A) -> Detergente e vinagre"
						+ "\n(B) -> Coca-cola e vinagre"
						+ "\n(C) -> Leite de Magn�sia e sab�o"
						+ "\n(D) -> Sal e coalhada","B"}};
		String[][] perguntasHIS = 
				{{"A primeira guerra durou de:"
						+ "\n(A) -> 1910-1919 "
						+ "\n(B) -> 1914-1918"
						+ "\n(C) -> 1914-1919"
						+ "\n(D) -> 1912-1918","B"},
				{"Dentre os desdobramentos pol�ticos-econ�micos imediatos na ordem internacional"
						+ "\nproduzidos pela Primeira Guerra Mundial, � correto apontar:"
						+ "\n(A) -> Fim dos privil�gios aduaneiros da Fran�a no com�rcio com a alemanha"
						+ "\n(B) -> O surgimento da Organiza��o das Na��es Unidas, por meio do Tratado de Sevres"
						+ "\n(C) -> A cria��o da Iugosl�via, como decorr�ncia das quest�es pol�ticas dos Balc�s "
						+ "\n(D) -> A ascen��o da URSS dominando o mercado internacional","C"},
				{"Roma foi influenciada em sua forma��o por uma variedade de povos que "
						+ "\nhabitavam a Pen�nsula It�lica. Dentre as alternativas que seguem, quais"
						+ "\n dos povos listados abaixo n�o influenciaram a forma��o de Roma."
						+ "\n(A) -> Etruscos"
						+ "\n(B) -> Gregos"
						+ "\n(C) -> Latinos"
						+ "\n(D) -> Mesopot�micos","D"},
				{"(UEL-PR) No Brasil col�nia, a pecu�ria teve um papel decisivo na:"
						+ "\n(A) -> Ocupa��o das �reas litor�neas"
						+ "\n(B) -> Expuls�o do assalariado do campo"
						+ "\n(C) -> Expans�o para o interior"
						+ "\n(D) -> Forma��o e explora��o dos minif�ndios","C"},
				{"A Primeira Rep�blica � um per�odo tamb�m conhecido como Rep�blica Velha"
						+ "\n e ficou marcada pelo poder pol�tico concentrado nas oligarquias. A grande"
						+ "\n desigualdade social e a repress�o governamental que caracterizaram esse"
						+ "\n per�odo motivaram uma s�rie de revoltas e rebeli�es populares. Selecione"
						+ "\n a alternativa abaixo que apresenta uma rebeli�o do per�odo da Primeira Rep�blica:"
						+ "\n(A) -> Revolta da Vacina"
						+ "\n(B) -> Revolu��o Constitucionalista"
						+ "\n(C) -> Intentona Comunista"
						+ "\n(D) -> Revolu��o Praieira","A"}};
		String[][] perguntasGEO = 
				{{"Um dos fen�menos clim�ticos conhecidos no planeta atualmente � o El Ni�o, que consiste:"
						+ "\n(A) -> Na mudan�a da din�mica da altitude e da temperatura"
						+ "\n(B) -> Nas temperaturas suavizadas pela proximidade com o mar"
						+ "\n(C) -> Na modifica��o da a��o da temperatura em rela��o � latitude"
						+ "\n(D) -> No aquecimento das �guas do oceano Pac�fico, que altera o clima","D"},
				{"O processo de industrializa��o no Brasil foi iniciado de maneira mais consolidada:"
						+ "\n(A) -> Pelos portugueses, que viam em sua col�nia a potencialidade de produzir"
						+ "\n mercadorias maquinofaturadas para a metr�pole"
						+ "\n(B) -> Pelo Governo Vargas, gra�as aos efeitos sentidos pelo pa�s frente � crise de 1929"
						+ "\n(C) -> pela Ditadura Militar, que se preocupou em mobilizar a m�o de obra excedente das"
						+ "\n grandes cidades em fun��o da ocorr�ncia do �xodo rural"
						+ "\n(D) -> pelo Governo FHC, que sentiu a necessidade de transformar o parque industrial"
						+ "\n brasileiro para atender ao mercado externo","B"},
				{"Segundo Aziz Nacib Ab Saber, ge�grafo, o relevo predominante no Brasil �:"
						+ "\n(A) -> Depress�o Central"
						+ "\n(B) -> Planalto Brasileiro"
						+ "\n(C) -> Plan�cies e Terras Baixas"
						+ "\n(D) -> Planalto das Guianas","B"},
				{"Segundo a Teoria da Deriva Continental, os continentes se separaram a partir de um bloco �nico"
						+ "\n denominado Pangeia. Quais s�o os dois continentes cujo perfil do litoral apresenta"
						+ "\n um encaixe perfeito, embasando essa teoria?"
						+ "\n(A) -> Ant�rtica e Europa"
						+ "\n(B) -> Europa e Oceania"
						+ "\n(C) -> Oceania e Am�rica do Norte"
						+ "\n(D) -> Am�rica do Sul e �frica","D"},
				{"� uma bacia essencialmente plan�ltica, situada na parte central do planalto meridional brasileiro."
						+ "\n Trata-se da:"
						+ "\n(A) -> Bacia do Paran�"
						+ "\n(B) -> Bacia do Nilo"
						+ "\n(C) -> Bacia Amaz�nica"
						+ "\n(D) -> Bacia do Tocantins-Araguaia","A"}};
		
//MENUS->
			
			JFrame inf = new JFrame();
			inf.setSize(largura, altura);
			inf.setLocationRelativeTo(null);
			inf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			inf.setLayout(null);
			inf.setResizable(false);
			inf.getContentPane().setBackground(Color.white);
		
			JFrame entrada = new JFrame();
			entrada.setSize(largura, altura);
			entrada.setLocationRelativeTo(null);
			entrada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			entrada.setLayout(null);
			entrada.setResizable(false);
			entrada.getContentPane().setBackground(Color.white);
			
			JFrame entradaJOGAR = new JFrame();
			entradaJOGAR.setSize(largura, altura);
			entradaJOGAR.setLocationRelativeTo(null);
			entradaJOGAR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			entradaJOGAR.setLayout(null);
			entradaJOGAR.setResizable(false);	
			entradaJOGAR.getContentPane().setBackground(Color.white);
			
			URL caminho2;
		try {
			caminho2 = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_tIaw-tI-WrS57i8nHLtaJtv0EgTu1h9uiFaGtAJK5zxLHPxa");
			Image iconeTitulo = java.awt.Toolkit.getDefaultToolkit().getImage(caminho2);
			entrada.setIconImage(iconeTitulo);
			entradaJOGAR.setIconImage(iconeTitulo);
			inf.setIconImage(iconeTitulo);
		}catch(Exception e) {}		
		
//---------------------MENU DE ENTRADA-------------------------//
			
			JLabel img = new JLabel();
			URL caminho;
			try {
				caminho = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_tIaw-tI-WrS57i8nHLtaJtv0EgTu1h9uiFaGtAJK5zxLHPxa");
				ImageIcon icone = new ImageIcon(caminho);
				img.setIcon(icone);
				img.setBounds(700, 10, 280, 250);
			}catch(Exception e) {}
			entrada.add(img);
			
			JLabel knowL = new JLabel();
			knowL.setText("Knowledge");
			knowL.setFont(new Font("Impact",Font.PLAIN,130));
			knowL.setBounds(20, 0, 680, 130);
			knowL.setForeground(Color.gray);
			

			JLabel knowR = new JLabel();
			knowR.setText("Race");
			knowR.setFont(new Font("Impact",Font.PLAIN,130));
			knowR.setBounds(20, 120, 680, 130);
			knowR.setForeground(Color.gray);
			
			
			JPanel estilizacao = new JPanel();
			estilizacao.setLayout(null);
			estilizacao.setBounds(10, 10, 665, 260);
			estilizacao.setBackground(Color.black);
			estilizacao.add(knowL);
			estilizacao.add(knowR);
			
			JPanel estilizacao2 = new JPanel();
			estilizacao2.setLayout(null);
			estilizacao2.setBounds(10, 280, 965, 170);
			estilizacao2.setBackground(Color.black);
			
			JPanel estilizacao3 = new JPanel();
			estilizacao3.setLayout(null);
			estilizacao3.setBounds(10, 460, 965, 80);
			estilizacao3.setBackground(Color.black);
			
			JPanel estilizacao4 = new JPanel();
			estilizacao4.setLayout(null);
			estilizacao4.setBounds(10, 550, 965, 80);
			estilizacao4.setBackground(Color.black);
//Bot�o1	
			JButton estilizacaoB = new JButton("JOGAR");
			estilizacaoB.setBorderPainted(false);
			estilizacaoB.setContentAreaFilled(false);
			estilizacaoB.setFocusPainted(false);
			estilizacaoB.setOpaque(false);
			estilizacaoB.setForeground(new Color(50, 160, 46));
			estilizacaoB.setBounds(0,0,965,170);
			estilizacaoB.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,140));
			estilizacao2.add(estilizacaoB);
			estilizacaoB.addActionListener(new ActionListener() {
					@Override
				public void actionPerformed(ActionEvent e) {
					entrada.setVisible(false);
					entradaJOGAR.setVisible(true);

				}
			});
			
//Bot�o2
			JButton estilizacao1B = new JButton("INFORMA��ES");
			estilizacao1B.setBorderPainted(false);
			estilizacao1B.setContentAreaFilled(false);
			estilizacao1B.setFocusPainted(false);
			estilizacao1B.setOpaque(false);
			estilizacao1B.setBounds(0,-1,965, 80);
			estilizacao1B.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,60));
			estilizacao1B.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					entrada.setVisible(false);
					inf.setVisible(true);
				}
			});
			estilizacao3.add(estilizacao1B);
					
//Bot�o3
			
			JButton estilizacao3B = new JButton("SAIR");
			estilizacao3B.setBorderPainted(false);
			estilizacao3B.setContentAreaFilled(false);
			estilizacao3B.setFocusPainted(false);
			estilizacao3B.setForeground(new Color(220, 40, 46));
			estilizacao3B.setOpaque(false);
			estilizacao3B.setBounds(0,-1,965, 80);
			estilizacao3B.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,60));
			estilizacao3B.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			estilizacao4.add(estilizacao3B);
//Adicionar->

			entrada.add(estilizacao);
			entrada.add(estilizacao2);
			entrada.add(estilizacao3);
			entrada.add(estilizacao4);		
			
//-----------------MENU JOGAR--------------------//

			JLabel escolhatxt = new JLabel("Selecione as disciplinas:");
			escolhatxt.setFont(new Font("Impact",Font.PLAIN,70));
			escolhatxt.setBounds(5, 5, 720, 70);
			escolhatxt.setForeground(Color.gray);
			
			JPanel escolha = new JPanel();
			escolha.add(escolhatxt);
			escolha.setBounds(10, 10, 730 , 80);
			escolha.setLayout(null);
			escolha.setBackground(Color.black);
			
			JCheckBox mat = new JCheckBox("Matem�tica");
			mat.setBounds(10, 100, 965, 80);
			mat.setBackground(Color.black);
			mat.setBorderPaintedFlat(false);
			mat.setFocusPainted(false);
			mat.setFont(new Font("Arial",Font.PLAIN,90));
			
			JCheckBox fis = new JCheckBox("F�sica");
			fis.setBounds(10, 190, 965, 80);
			fis.setBackground(Color.black);
			fis.setBorderPaintedFlat(false);
			fis.setFocusPainted(false);
			fis.setFont(new Font("Arial",Font.PLAIN,90));
			
			JCheckBox bio = new JCheckBox("Biologia");
			bio.setBounds(10, 280, 965, 80);
			bio.setBackground(Color.black);
			bio.setBorderPaintedFlat(false);
			bio.setFocusPainted(false);
			bio.setFont(new Font("Arial",Font.PLAIN,90));
			
			JCheckBox qui = new JCheckBox("Qu�mica");
			qui.setBounds(10, 370, 965, 80);
			qui.setBackground(Color.black);
			qui.setBorderPaintedFlat(false);
			qui.setFocusPainted(false);
			qui.setFont(new Font("Arial",Font.PLAIN,90));
			
			JCheckBox his = new JCheckBox("Hist�ria");
			his.setBounds(10, 460, 965, 80);
			his.setBackground(Color.black);
			his.setBorderPaintedFlat(false);
			his.setFocusPainted(false);
			his.setFont(new Font("Arial",Font.PLAIN,90));
			
			JCheckBox geo = new JCheckBox("Geografia");
			geo.setBounds(10, 550, 730, 80);
			geo.setBackground(Color.black);
			geo.setBorderPaintedFlat(false);
			geo.setFocusPainted(false);
			geo.setFont(new Font("Arial",Font.PLAIN,90));
			
			JButton jogar = new JButton("JOGAR");
			jogar.setBounds(750, 10, 225, 80);
			jogar.setBackground(Color.black);
			jogar.setFocusPainted(false);
			jogar.setFont(new Font("Franklin Gothic Medium",Font.BOLD,50));
			jogar.setForeground(new Color(50, 160, 46));
			jogar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {			
					int soma=0;
					if(mat.isSelected()) {
						soma+=1;
					}
					if(fis.isSelected()) {
						soma+=1;
					}
					if(bio.isSelected()) {
						soma+=1;
					}
					if(qui.isSelected()) {
						soma+=1;
					}
					if(his.isSelected()) {
						soma+=1;
					}
					if(geo.isSelected()) {
						soma+=1;
					}						
					if(soma>=3) {
					int cont1=0,deter=(15/soma),aleat;	
					String[][]perguntasfinais = new String[deter*soma][2];	
					String[]nome = new String[deter*soma];		
					Random gerar = new Random();	
					if(mat.isSelected()) {
							for(int i=0;i<deter;i++) {
								aleat=gerar.nextInt(5);
							perguntasfinais[cont1][0]=perguntasMAT[aleat][0];
							perguntasfinais[cont1][1]=perguntasMAT[aleat][1];
							for(int i2=1;i2<=4;i2++) {
								if(cont1-i2<0) {
									break;
								}
							if(perguntasfinais[cont1][0].equals(perguntasfinais[cont1-i2][0])) {
								i--;
								cont1--;
								break;
							} 
							}
							cont1++;
							}
						}
					if(fis.isSelected()) {
						for(int i=0;i<deter;i++) {
								aleat=gerar.nextInt(5);
								perguntasfinais[cont1][0]=perguntasFIS[aleat][0];
								perguntasfinais[cont1][1]=perguntasFIS[aleat][1];
								for(int i2=1;i2<=4;i2++) {
									if(cont1-i2<0) {
										break;
									}
								if(perguntasfinais[cont1][0].equals(perguntasfinais[cont1-i2][0])) {
									i--;
									cont1--;
									break;
								} 
								}
								cont1++;
								}
						}
					if(bio.isSelected()) {
						for(int i=0;i<deter;i++) {
								aleat=gerar.nextInt(5);
								perguntasfinais[cont1][0]=perguntasBIO[aleat][0];
								perguntasfinais[cont1][1]=perguntasBIO[aleat][1];
								for(int i2=1;i2<=4;i2++) {
									if(cont1-i2<0) {
										break;
									}
								if(perguntasfinais[cont1][0].equals(perguntasfinais[cont1-i2][0])) {
									i--;
									cont1--;
									break;
								} 
								}
								cont1++;
								}
						}
					if(qui.isSelected()) {
						for(int i=0;i<deter;i++) {
								aleat=gerar.nextInt(5);
								perguntasfinais[cont1][0]=perguntasQUI[aleat][0];
								perguntasfinais[cont1][1]=perguntasQUI[aleat][1];
								for(int i2=1;i2<=4;i2++) {
									if(cont1-i2<0) {
										break;
									}
								if(perguntasfinais[cont1][0].equals(perguntasfinais[cont1-i2][0])) {
									i--;
									cont1--;
									break;
								} 
								}
								cont1++;
								}
						}
					if(his.isSelected()) {
						for(int i=0;i<deter;i++) {
								aleat=gerar.nextInt(5);
								perguntasfinais[cont1][0]=perguntasHIS[aleat][0];
								perguntasfinais[cont1][1]=perguntasHIS[aleat][1];
								for(int i2=1;i2<=4;i2++) {
									if(cont1-i2<0) {
										break;
									}
								if(perguntasfinais[cont1][0].equals(perguntasfinais[cont1-i2][0])) {
									i--;
									cont1--;
									break;
								} 
								}
								cont1++;
								}
						}
					if(geo.isSelected()) {
						for(int i=0;i<deter;i++) {
								aleat=gerar.nextInt(5);
								perguntasfinais[cont1][0]=perguntasGEO[aleat][0];
								perguntasfinais[cont1][1]=perguntasGEO[aleat][1];
								for(int i2=1;i2<=4;i2++) {
									if(cont1-i2<0) {
										break;
									}
								if(perguntasfinais[cont1][0].equals(perguntasfinais[cont1-i2][0])) {
									i--;
									cont1--;
									break;
								} 
								}
								cont1++;
								}
						}	
						entradaJOGAR.setVisible(false);
						int correcaoCERTA[] = new int[deter*soma];
						int correcaoERRADA[] = new int[deter*soma]; 
						int contadorDePlayer=0,questao=1,continuar,resposta,contadorNOME=0,contador=0;
						String respostaLETRA;
						long[]tempo = new long[10];
						long tempoInicial;
						do {
							nome[contadorNOME]=JOptionPane.showInputDialog(null,"Informe seu nome:","Knowledge Race",JOptionPane.PLAIN_MESSAGE);
							tempoInicial = System.currentTimeMillis();
							do {
								resposta = JOptionPane.showOptionDialog(null, "Jogador: "+nome[contadorNOME]+"\n\n"+perguntasfinais[contador][0], "Quest�o "+(questao), JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, gaba, 0);
								switch(resposta) {
								case 0:
									respostaLETRA="A";
									if(respostaLETRA.contentEquals(perguntasfinais[contador][1])) {
										correcaoCERTA[contadorNOME]++;
									}else
										correcaoERRADA[contadorNOME]++;
									break;
								case 1:
									respostaLETRA="B";
									if(respostaLETRA.contentEquals(perguntasfinais[contador][1])) {
										correcaoCERTA[contadorNOME]++;
									}else
										correcaoERRADA[contadorNOME]++;
									break;
								case 2:
									respostaLETRA="C";
									if(respostaLETRA.contentEquals(perguntasfinais[contador][1])) {
										correcaoCERTA[contadorNOME]++;
									}else
										correcaoERRADA[contadorNOME]++;
									break;
								case 3:
									respostaLETRA="D";
									if(respostaLETRA.contentEquals(perguntasfinais[contador][1])) {
										correcaoCERTA[contadorNOME]++;
									}else
										correcaoERRADA[contadorNOME]++;
									break;
								case -1:
									
									break;
								}
								questao++;
								contador++;
							}while(contador!=(15/soma)*soma);
							tempo[contadorNOME]=((System.currentTimeMillis()-tempoInicial)/1000);
							questao=1;
							contador=0;
							contadorNOME++;
							contadorDePlayer++;
							
							continuar=JOptionPane.showConfirmDialog(null, "Deseja continuar?");
						}while(continuar==0);
							
						String podio="���������������������������������������������������������������������������������������������������������������\n";
						int segurar,segurar1;
						long segurar2;
						String segurarN;
						for(int i=0;i<contadorDePlayer;i++) {
							for(int i2=i+1;i2<contadorDePlayer;i2++) {
								if(correcaoCERTA[i]<correcaoCERTA[i2]) {
									segurar=correcaoCERTA[i];
									correcaoCERTA[i]=correcaoCERTA[i2];
									correcaoCERTA[i2]=segurar;
									segurar1=correcaoERRADA[i];
									correcaoERRADA[i]=correcaoERRADA[i2];
									correcaoERRADA[i2]=segurar1;
									segurarN=nome[i];
									nome[i]=nome[i2];
									nome[i2]=segurarN;
									segurar2=tempo[i];
									tempo[i]=tempo[i2];
									tempo[i2]=segurar2;
								}
								if(correcaoCERTA[i]==correcaoCERTA[i2]&&tempo[i]>tempo[i2]) {
									segurar=correcaoCERTA[i];
									correcaoCERTA[i]=correcaoCERTA[i2];
									correcaoCERTA[i2]=segurar;
									segurar1=correcaoERRADA[i];
									correcaoERRADA[i]=correcaoERRADA[i2];
									correcaoERRADA[i2]=segurar1;
									segurarN=nome[i];
									nome[i]=nome[i2];
									nome[i2]=segurarN;
									segurar2=tempo[i];
									tempo[i]=tempo[i2];
									tempo[i2]=segurar2;
								}
							}
						}
						for(int i=0;i<contadorDePlayer;i++) {
							podio+=(i+1)+"� Lugar: "+nome[i]
									+ "\nAcertos: "+correcaoCERTA[i]
									+ "\nErros: "+correcaoERRADA[i]
									+ "\nTempo: "+tempo[i]+" segundos"+"\n\n";
						}
							podio+="���������������������������������������������������������������������������������������������������������������";

							JOptionPane.showMessageDialog(null, podio,"PARAB�NS "+nome[0]+" VOC� FICOU EM PRIMEIRO LUGAR!!",JOptionPane.PLAIN_MESSAGE);
							for(int i=0;i<(deter*soma);i++) {
								nome[i]="";
								perguntasfinais[i][0]="";
								perguntasfinais[i][1]="";
								correcaoCERTA[i]=0;
								correcaoERRADA[i]=0;
								}	
						entrada.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, "Voc� deve selecionar ao menos tr�s disciplinas       ", "ERRO",  JOptionPane.WARNING_MESSAGE);		
					}	
				}
			});
			
			JButton voltar = new JButton("VOLTAR");
			voltar.setBounds(750, 550, 225, 80);
			voltar.setBackground(Color.black);
			voltar.setFocusPainted(false);
			voltar.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,47));
			voltar.setForeground(new Color(220, 40, 46));
			voltar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					entradaJOGAR.setVisible(false);
					entrada.setVisible(true);
				}
			});		
//Adicionar->
			
			entradaJOGAR.add(jogar);
			entradaJOGAR.add(mat);
			entradaJOGAR.add(fis);
			entradaJOGAR.add(bio);
			entradaJOGAR.add(qui);
			entradaJOGAR.add(his);
			entradaJOGAR.add(geo);
			entradaJOGAR.add(escolha);
			entradaJOGAR.add(voltar);

//------------------------MENU INFORMA��ES----------------------------//		
			
			JButton voltarinf = new JButton("VOLTAR");
			voltarinf.setBounds(750, 550, 225, 80);
			voltarinf.setBackground(Color.black);
			voltarinf.setFocusPainted(false);
			voltarinf.setFont(new Font("Franklin Gothic Medium",Font.PLAIN,47));
			voltarinf.setForeground(new Color(220, 40, 46));
			voltarinf.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					inf.setVisible(false);
					entrada.setVisible(true);
					
				}
			});
			
			JPanel inf1 = new JPanel();
			inf1.setBounds(10, 10, 965, 535);
			inf1.setBackground(Color.black);
			inf1.setLayout(null);
			
			JPanel inf2 = new JPanel();
			inf2.setBounds(10, 540, 735, 90);
			inf2.setBackground(Color.black);
			inf2.setLayout(null);
			
			JLabel inftext = new JLabel();
			inftext.setBounds(10, 10, 965, 60);
			inftext.setText("- KnowLedge Race � um jogo de perguntas e ");
			inftext.setFont(new Font("Arial",Font.PLAIN,40));
			
			JLabel inftext2 = new JLabel();
			inftext2.setBounds(10, 60, 965, 60);
			inftext2.setText("respotas, seu tempo de resposta ser� cronometrado;");
			inftext2.setFont(new Font("Arial",Font.PLAIN,40));
			
			JLabel inftext3 = new JLabel();
			inftext3.setBounds(10, 130, 965, 60);
			inftext3.setText("- O jogador que responder mais perguntas certas");
			inftext3.setFont(new Font("Arial",Font.PLAIN,40));
			
			JLabel inftext4 = new JLabel();
			inftext4.setBounds(10, 180, 965, 60);
			inftext4.setText("vence, se tiver dois jogadores com o mesmo n�mero ");
			inftext4.setFont(new Font("Arial",Font.PLAIN,40));
			
			JLabel inftext5 = new JLabel();
			inftext5.setBounds(10, 230, 965, 60);
			inftext5.setText("de acertos o fator de desempate ser� o tempo; ");
			inftext5.setFont(new Font("Arial",Font.PLAIN,40));
			
			JLabel inftext6 = new JLabel();
			inftext6.setBounds(10, 300, 965, 60);
			inftext6.setText("- O conte�do das peruntas pode ser um pouco ");
			inftext6.setFont(new Font("Arial",Font.PLAIN,40));
			
			JLabel inftext7 = new JLabel();
			inftext7.setBounds(10, 350, 965, 60);
			inftext7.setText("aprofundado, ent�o escolha bem as disciplinas");
			inftext7.setFont(new Font("Arial",Font.PLAIN,40));
			
			JLabel inftext8 = new JLabel();
			inftext8.setBounds(10, 400, 965, 60);
			inftext8.setText("que deseja jogar;");
			inftext8.setFont(new Font("Arial",Font.PLAIN,40));
			
			JLabel inftext9 = new JLabel();
			inftext9.setBounds(0, 30, 965, 55);
			inftext9.setText("- Enfim, tenha um bom jogo.");
			inftext9.setFont(new Font("MV Boli",Font.PLAIN,50));
			
			inf1.add(inftext);
			inf1.add(inftext2);
			inf1.add(inftext3);
			inf1.add(inftext4);
			inf1.add(inftext5);
			inf1.add(inftext6);
			inf1.add(inftext7);
			inf1.add(inftext8);
			inf2.add(inftext9);
			inf.add(voltarinf);
			inf.add(inf1);
			inf.add(inf2);

			entrada.setVisible(true);
	}

}
