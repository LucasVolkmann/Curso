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
				{{"A área de um quadrado de lado medindo x é:"
						+ "\n(A) -> 2x"
						+ "\n(B) -> 2²"
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
						+ "\n(D) -> 25m","C"}};
		String[][] perguntasFIS = 
				{{"Um ônibus parte às 15h de São Paulo com destino ao Rio de Janeiro"
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
						+ "\n(D) -> 20m/s","B"}};
		String[][] perguntasBIO = 
				{{"(Unisa-SP) Qual dos organismos abaixo não possui parede celular?"
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
		String[][] perguntasQUI = 
				{{"(UFRR) Um sistema onde os componentes são apenas água no estado líquido e"
						+ "\n3 cubos de gelo é do tipo:"
						+ "\n(A) -> Heterogêneo com duas fases"
						+ "\n(B) -> Heterogêneo com uma fase"
						+ "\n(C) -> Homogêneo"
						+ "\n(D) -> Heterogêneo com três fases","A"},
				{"(Uece) Os volumes dos gases que reagem ou que se formam, quando medidos"
						+ "\nnas mesmas condições de temperatura e pressão, guardam entre si uma relação"
						+ "\nde números pequenos e inteiros. Este é o enunciado da lei de:"
						+ "\n(A) -> Dalton"
						+ "\n(B) -> Ralf o Grande"
						+ "\n(C) -> Clapeyron"
						+ "\n(D) -> Gay-Lussac","D"},
				{"(PUC-RS) A condutibilidade elétrica do cobre pode ser explicada pelo"
						+ "\nfato de:"
						+ "\n(A) -> Ser sólido a temperatura ambiente(25°C)"
						+ "\n(B) -> Formar um aglomerado molecular"
						+ "\n(C) -> Existirem elétrons livres entre seus cátions"
						+ "\n(D) -> Ocorrer ruptura das suas ligações iônicas","C"},
				{"Dadas as espécies químicas a seguir, qual delas pode ser classificada "
						+ "\ncomo um ácido de Arrhenius?"
						+ "\n(A) -> HCl"
						+ "\n(B) -> KOH"
						+ "\n(C) -> H2O"
						+ "\n(D) -> LiH","A"},
				{"(Fuvest) - Assinale a alternativa que apresenta dois produtos "
						+ "\ncaseiros com propriedades ácidas."
						+ "\n(A) -> Detergente e vinagre"
						+ "\n(B) -> Coca-cola e vinagre"
						+ "\n(C) -> Leite de Magnésia e sabão"
						+ "\n(D) -> Sal e coalhada","B"}};
		String[][] perguntasHIS = 
				{{"A primeira guerra durou de:"
						+ "\n(A) -> 1910-1919 "
						+ "\n(B) -> 1914-1918"
						+ "\n(C) -> 1914-1919"
						+ "\n(D) -> 1912-1918","B"},
				{"Dentre os desdobramentos políticos-econômicos imediatos na ordem internacional"
						+ "\nproduzidos pela Primeira Guerra Mundial, é correto apontar:"
						+ "\n(A) -> Fim dos privilégios aduaneiros da França no comércio com a alemanha"
						+ "\n(B) -> O surgimento da Organização das Nações Unidas, por meio do Tratado de Sevres"
						+ "\n(C) -> A criação da Iugoslávia, como decorrência das questões políticas dos Balcãs "
						+ "\n(D) -> A ascenção da URSS dominando o mercado internacional","C"},
				{"Roma foi influenciada em sua formação por uma variedade de povos que "
						+ "\nhabitavam a Península Itálica. Dentre as alternativas que seguem, quais"
						+ "\n dos povos listados abaixo não influenciaram a formação de Roma."
						+ "\n(A) -> Etruscos"
						+ "\n(B) -> Gregos"
						+ "\n(C) -> Latinos"
						+ "\n(D) -> Mesopotâmicos","D"},
				{"(UEL-PR) No Brasil colônia, a pecuária teve um papel decisivo na:"
						+ "\n(A) -> Ocupação das áreas litorâneas"
						+ "\n(B) -> Expulsão do assalariado do campo"
						+ "\n(C) -> Expansão para o interior"
						+ "\n(D) -> Formação e exploração dos minifúndios","C"},
				{"A Primeira República é um período também conhecido como República Velha"
						+ "\n e ficou marcada pelo poder político concentrado nas oligarquias. A grande"
						+ "\n desigualdade social e a repressão governamental que caracterizaram esse"
						+ "\n período motivaram uma série de revoltas e rebeliões populares. Selecione"
						+ "\n a alternativa abaixo que apresenta uma rebelião do período da Primeira República:"
						+ "\n(A) -> Revolta da Vacina"
						+ "\n(B) -> Revolução Constitucionalista"
						+ "\n(C) -> Intentona Comunista"
						+ "\n(D) -> Revolução Praieira","A"}};
		String[][] perguntasGEO = 
				{{"Um dos fenômenos climáticos conhecidos no planeta atualmente é o El Niño, que consiste:"
						+ "\n(A) -> Na mudança da dinâmica da altitude e da temperatura"
						+ "\n(B) -> Nas temperaturas suavizadas pela proximidade com o mar"
						+ "\n(C) -> Na modificação da ação da temperatura em relação à latitude"
						+ "\n(D) -> No aquecimento das águas do oceano Pacífico, que altera o clima","D"},
				{"O processo de industrialização no Brasil foi iniciado de maneira mais consolidada:"
						+ "\n(A) -> Pelos portugueses, que viam em sua colônia a potencialidade de produzir"
						+ "\n mercadorias maquinofaturadas para a metrópole"
						+ "\n(B) -> Pelo Governo Vargas, graças aos efeitos sentidos pelo país frente à crise de 1929"
						+ "\n(C) -> pela Ditadura Militar, que se preocupou em mobilizar a mão de obra excedente das"
						+ "\n grandes cidades em função da ocorrência do êxodo rural"
						+ "\n(D) -> pelo Governo FHC, que sentiu a necessidade de transformar o parque industrial"
						+ "\n brasileiro para atender ao mercado externo","B"},
				{"Segundo Aziz Nacib Ab Saber, geógrafo, o relevo predominante no Brasil é:"
						+ "\n(A) -> Depressão Central"
						+ "\n(B) -> Planalto Brasileiro"
						+ "\n(C) -> Planícies e Terras Baixas"
						+ "\n(D) -> Planalto das Guianas","B"},
				{"Segundo a Teoria da Deriva Continental, os continentes se separaram a partir de um bloco único"
						+ "\n denominado Pangeia. Quais são os dois continentes cujo perfil do litoral apresenta"
						+ "\n um encaixe perfeito, embasando essa teoria?"
						+ "\n(A) -> Antártica e Europa"
						+ "\n(B) -> Europa e Oceania"
						+ "\n(C) -> Oceania e América do Norte"
						+ "\n(D) -> América do Sul e África","D"},
				{"É uma bacia essencialmente planáltica, situada na parte central do planalto meridional brasileiro."
						+ "\n Trata-se da:"
						+ "\n(A) -> Bacia do Paraná"
						+ "\n(B) -> Bacia do Nilo"
						+ "\n(C) -> Bacia Amazônica"
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
//Botão1	
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
			
//Botão2
			JButton estilizacao1B = new JButton("INFORMAÇÕES");
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
					
//Botão3
			
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
			
			JCheckBox mat = new JCheckBox("Matemática");
			mat.setBounds(10, 100, 965, 80);
			mat.setBackground(Color.black);
			mat.setBorderPaintedFlat(false);
			mat.setFocusPainted(false);
			mat.setFont(new Font("Arial",Font.PLAIN,90));
			
			JCheckBox fis = new JCheckBox("Física");
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
			
			JCheckBox qui = new JCheckBox("Química");
			qui.setBounds(10, 370, 965, 80);
			qui.setBackground(Color.black);
			qui.setBorderPaintedFlat(false);
			qui.setFocusPainted(false);
			qui.setFont(new Font("Arial",Font.PLAIN,90));
			
			JCheckBox his = new JCheckBox("História");
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
								resposta = JOptionPane.showOptionDialog(null, "Jogador: "+nome[contadorNOME]+"\n\n"+perguntasfinais[contador][0], "Questão "+(questao), JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, gaba, 0);
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
							
						String podio="¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨\n";
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
							podio+=(i+1)+"º Lugar: "+nome[i]
									+ "\nAcertos: "+correcaoCERTA[i]
									+ "\nErros: "+correcaoERRADA[i]
									+ "\nTempo: "+tempo[i]+" segundos"+"\n\n";
						}
							podio+="¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨";

							JOptionPane.showMessageDialog(null, podio,"PARABÉNS "+nome[0]+" VOCÊ FICOU EM PRIMEIRO LUGAR!!",JOptionPane.PLAIN_MESSAGE);
							for(int i=0;i<(deter*soma);i++) {
								nome[i]="";
								perguntasfinais[i][0]="";
								perguntasfinais[i][1]="";
								correcaoCERTA[i]=0;
								correcaoERRADA[i]=0;
								}	
						entrada.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, "Você deve selecionar ao menos três disciplinas       ", "ERRO",  JOptionPane.WARNING_MESSAGE);		
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

//------------------------MENU INFORMAÇÕES----------------------------//		
			
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
			inftext.setText("- KnowLedge Race é um jogo de perguntas e ");
			inftext.setFont(new Font("Arial",Font.PLAIN,40));
			
			JLabel inftext2 = new JLabel();
			inftext2.setBounds(10, 60, 965, 60);
			inftext2.setText("respotas, seu tempo de resposta será cronometrado;");
			inftext2.setFont(new Font("Arial",Font.PLAIN,40));
			
			JLabel inftext3 = new JLabel();
			inftext3.setBounds(10, 130, 965, 60);
			inftext3.setText("- O jogador que responder mais perguntas certas");
			inftext3.setFont(new Font("Arial",Font.PLAIN,40));
			
			JLabel inftext4 = new JLabel();
			inftext4.setBounds(10, 180, 965, 60);
			inftext4.setText("vence, se tiver dois jogadores com o mesmo número ");
			inftext4.setFont(new Font("Arial",Font.PLAIN,40));
			
			JLabel inftext5 = new JLabel();
			inftext5.setBounds(10, 230, 965, 60);
			inftext5.setText("de acertos o fator de desempate será o tempo; ");
			inftext5.setFont(new Font("Arial",Font.PLAIN,40));
			
			JLabel inftext6 = new JLabel();
			inftext6.setBounds(10, 300, 965, 60);
			inftext6.setText("- O conteúdo das peruntas pode ser um pouco ");
			inftext6.setFont(new Font("Arial",Font.PLAIN,40));
			
			JLabel inftext7 = new JLabel();
			inftext7.setBounds(10, 350, 965, 60);
			inftext7.setText("aprofundado, então escolha bem as disciplinas");
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
