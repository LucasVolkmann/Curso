package exercicio09;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Principal {

	public static void main(String[] args) {
		
		JFrame formulario = new JFrame();
		formulario.setTitle("Meu nono formulário");
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//DefaultTableModel ENGLOBAR
		DefaultTableModel dados = new DefaultTableModel();
		dados.addColumn("Nome");
		dados.addColumn("Idade");
		dados.addRow(new Object[] {"Yara", "26" });
		dados.addRow(new Object[] {"Yara", "26" });
		dados.addRow(new Object[] {"Yara", "26" });
		dados.addRow(new Object[] {"Yara", "26" });
		
		//JTable (exibir os dados)
		JTable tabela = new JTable(dados);
		
		//JScrollPane (barra de rolagem)
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(10, 10, 465, 230);
		
		//ADD
		formulario.add(barraRolagem);
		
		
		
		
		
		
		
		
		
		
		//Exibir componentes
		formulario.setVisible(true);
		

	}

}
