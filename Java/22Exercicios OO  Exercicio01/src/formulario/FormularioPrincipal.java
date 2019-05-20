package formulario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Jogo;
import principal.Principal;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtClasssificacao;
	private JTextField txtValor;
	private JTable table;


	/**
	 * Create the frame.
	 */
	public FormularioPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Instanciar um objeto da classe Acao
		Acao a = new Acao();
		
		JLabel lblNomeDoJogo = new JLabel("Nome do Jogo:");
		lblNomeDoJogo.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		lblNomeDoJogo.setBounds(10, 19, 165, 32);
		contentPane.add(lblNomeDoJogo);
		
		txtNome = new JTextField();
		txtNome.setBounds(159, 21, 275, 32);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblGnero = new JLabel("G\u00EAnero:");
		lblGnero.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		lblGnero.setBounds(10, 58, 134, 32);
		contentPane.add(lblGnero);
		
		JLabel lblPlataforma = new JLabel("Plataforma:");
		lblPlataforma.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		lblPlataforma.setBounds(10, 97, 134, 32);
		contentPane.add(lblPlataforma);
		
		JLabel lblClassificao = new JLabel("Classifica\u00E7\u00E3o:");
		lblClassificao.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		lblClassificao.setBounds(10, 137, 134, 32);
		contentPane.add(lblClassificao);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Swis721 WGL4 BT", Font.BOLD, 20));
		lblValor.setBounds(10, 178, 134, 32);
		contentPane.add(lblValor);
		
		JComboBox cbxGenero = new JComboBox();
		cbxGenero.addItem("Ação");
		cbxGenero.addItem("Aventura");
		cbxGenero.addItem("Suspense");
		cbxGenero.setBounds(159, 60, 275, 32);
		contentPane.add(cbxGenero);
		
		JComboBox cbxPlataforma = new JComboBox();
		cbxPlataforma.addItem("Xbox One");
		cbxPlataforma.addItem("Playstation 4");
		cbxPlataforma.addItem("PC");
		cbxPlataforma.setBounds(159, 99, 275, 32);
		contentPane.add(cbxPlataforma);
		
		txtClasssificacao = new JTextField();
		txtClasssificacao.setColumns(10);
		txtClasssificacao.setBounds(159, 139, 275, 32);
		contentPane.add(txtClasssificacao);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(159, 180, 275, 32);
		contentPane.add(txtValor);
		
		JLabel lblIndice = new JLabel("");
		lblIndice.setBounds(10, 11, 42, 14);
		lblIndice.setVisible(false);
		contentPane.add(lblIndice);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 269, 430, 251);
		contentPane.add(scrollPane);
		
		JButton btnestatis = new JButton("Estatisticas");
		
		btnestatis.setBounds(340, 226, 100, 32);
		btnestatis.setEnabled(false);
		contentPane.add(btnestatis);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//Criar um obj da classe jogo
				try {
				Jogo j = new Jogo();
				j.setNome(txtNome.getText());
				j.setGenero(cbxGenero.getSelectedItem().toString());
				j.setPlataforma(cbxPlataforma.getSelectedItem().toString());
				j.setClassificacao(Integer.parseInt(txtClasssificacao.getText()));
				j.setValor(Double.parseDouble(txtValor.getText()));
				//Realizar o cadastro e verificar
				if(a.verfificar(j)==true) {
				a.cadastrar(j);
					
				//Atualizar a tabela
				table.setModel(a.selecionar());
				btnestatis.setEnabled(true);
				
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
				}else {
					JOptionPane.showMessageDialog(null, "Esse jogo já foi cadastrado na plataforma! ");
				}
				}catch(Exception erro) {
					JOptionPane.showMessageDialog(null, "Falha ao cadastrar, tente novamente");
				}
				
				//Limpar os campos
				txtNome.setText("");
				txtClasssificacao.setText("");
				txtValor.setText("");
				cbxGenero.setSelectedIndex(0);
				cbxPlataforma.setSelectedIndex(0);
				
				//Cursor no campo do nome
				txtNome.requestFocus();	
				
				
				
			}
		});
		btnNewButton.setBounds(10, 226, 100, 32);
		contentPane.add(btnNewButton);
		
		JButton btnExlcuir = new JButton("Excluir");
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Obter o indice a ser alterado
				int indice = Integer.parseInt(lblIndice.getText());
				
				//Instanciar um objeto da classe jogo
				Jogo j = new Jogo();
				j.setNome(txtNome.getText());
				j.setGenero(cbxGenero.getSelectedItem().toString());
				j.setPlataforma(cbxPlataforma.getSelectedItem().toString());
				j.setClassificacao(Integer.parseInt(txtClasssificacao.getText()));
				j.setValor(Double.parseDouble(txtValor.getText()));
				
				if(a.verfificar(j)) {
				//Realizar a alteração
				a.alterar(indice, j);
				
				//Atualizar a tabela
				table.setModel(a.selecionar());
				
				//Limpar os campos
				txtNome.setText("");
				txtClasssificacao.setText("");
				txtValor.setText("");
				cbxGenero.setSelectedIndex(0);
				cbxPlataforma.setSelectedIndex(0);
				
				//Ativar os botoes
				btnNewButton.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExlcuir.setEnabled(false);
				}else {
					JOptionPane.showMessageDialog(null, "Este Jogo ja foi cadastrado nesta plataforma!");
				}
				
			}
		});
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(120, 226, 100, 32);
		contentPane.add(btnAlterar);
		
		
		btnExlcuir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//obter o indice
				int indice = Integer.parseInt(lblIndice.getText());
				
				//Chamar o metodo de exclusão
				a.excluir(indice);
				
				//Atualizar tabela
				table.setModel(a.selecionar());
				
				
				//Limpar campos
				txtNome.setText("");
				txtClasssificacao.setText("");
				txtValor.setText("");
				cbxPlataforma.setSelectedIndex(0);
				cbxGenero.setSelectedIndex(0);
				
				//Cursor no campo nome
				txtNome.requestFocus();
				
				//Mensagem
				JOptionPane.showMessageDialog(null, "Jogo excluido com êxito!");
				
				//Ativar os botoes
				btnNewButton.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnExlcuir.setEnabled(false);
				if(Principal.vetorJogos.size()==0) {
					btnestatis.setEnabled(false);
				}
			}
		});
		btnExlcuir.setEnabled(false);
		btnExlcuir.setBounds(230, 226, 100, 32);
		contentPane.add(btnExlcuir);
		
		
		
		table = new JTable(a.selecionar());
		scrollPane.setViewportView(table);
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				//Obter indice selecionado
				int indice = table.getSelectedRow();
				
				//Obtendo dados de cada coluna
				String nome = table.getValueAt(indice, 0).toString();
				String genero = table.getValueAt(indice, 1).toString();
				String plataforma = table.getValueAt(indice, 2).toString();
				int classificacao = Integer.parseInt(table.getValueAt(indice, 3).toString());
				double valor = Double.parseDouble(table.getValueAt(indice, 4).toString());
				
				//Enviando dados ao formulario
				lblIndice.setText(String.valueOf(indice));
				txtNome.setText(nome);
				txtClasssificacao.setText(String.valueOf(classificacao));
				txtValor.setText(String.valueOf(valor));
				
				switch(genero) {
				case "Ação":
					cbxGenero.setSelectedIndex(0);
					break;
				case "Aventura":
					cbxGenero.setSelectedIndex(1);
					break;
				case "Suspense":
					cbxGenero.setSelectedIndex(2);
					break;
				}
				switch(plataforma) {
				case "Xbox One":
					cbxPlataforma.setSelectedIndex(0);
					break;
				case "Playstation 4":
					cbxPlataforma.setSelectedIndex(1);
					break;
				case "PC":
					cbxPlataforma.setSelectedIndex(2);
					break;
				}
				
				//Ativar botões
				btnNewButton.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExlcuir.setEnabled(true);
				
			}
		});
		
		btnestatis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormularioEstatisticas f = new FormularioEstatisticas();
				
				TextArea textArea = new TextArea();
				textArea.setBounds(10, 98, 414, 253);
				contentPane.add(textArea);
				
				int acao=0,aventura=0,suspense=0,xbox=0,ps4=0,pc=0;
				for(int i=0;i<Principal.vetorJogos.size();i++) {
					if(Principal.vetorJogos.get(i).getPlataforma().contentEquals("Xbox One")) {
						xbox++;
					}else if(Principal.vetorJogos.get(i).getPlataforma().contentEquals("Playstation 4")) {
						ps4++;
					}else if(Principal.vetorJogos.get(i).getPlataforma().contentEquals("PC")) {
						pc++;
					}
					if(Principal.vetorJogos.get(i).getGenero().contentEquals("Ação")) {
						acao++;
					}else if(Principal.vetorJogos.get(i).getGenero().contentEquals("Aventura")) {
						aventura++;
					}else if(Principal.vetorJogos.get(i).getGenero().contentEquals("Suspense")) {
						suspense++;
					}
				}
				
				textArea.setText("Quantidade de Jogos por Genero:"
								+"\nAção: "+acao
								+"\nAventura: "+aventura
								+"\nSuspense: "+suspense
								+"\n\nQuantidade de Jogos por Plataforma:"
								+ "\nXbox One: "+xbox
								+ "\nPlaystation 4: "+ps4
								+ "\nPC: "+pc);
				f.add(textArea);
				f.setVisible(true);
				
			}});
		
		
	}
}
