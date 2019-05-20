package formulario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import modelo.Pessoa;


	
public class Formulario {

	//ArrayList
	public static ArrayList<Pessoa> vetorPessoas = new ArrayList<Pessoa>();
	
	//DefaultTableModel
	DefaultTableModel dados = new DefaultTableModel();	
	
		//Contrutor	public Formulario() {
	public Formulario(){
		JFrame f= new JFrame("Projeto base");
		f.setSize(400,500);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(painelListarDados());
		f.add(painelCadastro());
		f.setVisible(true);
		
	}
	
	//Método de painel para cadastro
	private JPanel painelCadastro() {
		JPanel p = new JPanel();
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setBounds(10, 10, 363, 180);
		p.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 10, 100, 20);
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(10, 50, 100, 20);
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(10, 90, 100, 20);
		
		JTextField txtNome = new JTextField();
		txtNome.setBounds(70, 10, 280, 20);
		JTextField txtIdade = new JTextField();
		txtIdade.setBounds(70, 50, 280, 20);
		JTextField txtCidade = new JTextField();
		txtCidade.setBounds(70, 90, 280, 20);
		
		JButton btn = new JButton("Cadastrar");
		btn.setBounds(130, 130, 100, 20);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Obter os dados
				String nome = txtNome.getText();
				int idade = Integer.parseInt(txtIdade.getText());
				String cidade = txtCidade.getText();
				
				//Objeto
				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setIdade(idade);
				p.setCidade(cidade);
				
				//Add ao arraylist
				vetorPessoas.add(p);
				
				//Limpar do DefaultTableModel
				dados.setRowCount(0);
				
				//Add ao DefaultTableModel
				for(int i=0; i<vetorPessoas.size();i++) {
					dados.addRow(new Object[] {
							vetorPessoas.get(i).getNome(),
							vetorPessoas.get(i).getIdade(),
							vetorPessoas.get(i).getCidade()
					});
				}
			
			//Limpar os campos
				txtNome.setText("");
				txtCidade.setText("");
				txtIdade.setText("");
			}
		});
		
		p.add(txtNome);
		p.add(txtIdade);
		p.add(txtCidade);
		p.add(btn);
		p.add(lblNome);
		p.add(lblIdade);
		p.add(lblCidade);
		
		return p;
	}

	//Método de pauinel para listar dados
	private JPanel painelListarDados() {
		JPanel p = new JPanel();
		p.setBorder(BorderFactory.createLineBorder(Color.black));
		p.setBounds(10, 200, 363, 250);
		p.setLayout(null);
		JScrollPane barra = new JScrollPane(tabela());
		barra.setSize(362, 250);
		
		p.add(barra);
		return p;
	}

	//Método de tabela 
	private JTable tabela() {
			
		dados.addColumn("Nome");
		dados.addColumn("Idade");
		dados.addColumn("Cidade");

		
		//Tabela
		JTable tabela = new JTable(dados);
		return tabela;
		
		
	}
	
	
	
}

