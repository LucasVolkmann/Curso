package exemplo03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		/*Exibindo mensagens
		JOptionPane.showMessageDialog(null, "Hoje é terça-feira");
		JOptionPane.showMessageDialog(null, "Erro", "Título",  JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "Perigo", "Título",  JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Tudo bem?", "Título",  JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Isso é Java!", "Título",  JOptionPane.INFORMATION_MESSAGE);
		*/
		
		/*Obter dados
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		
		String mensagem = "Nome: " +nome;
			   mensagem += "\nIdade: " +idade;
			   mensagem += "\nAltura: " +altura;
		JOptionPane.showMessageDialog(null, mensagem);
		*/
		
		/*Caixa de confirmação
		int resposta = JOptionPane.showConfirmDialog(null, "Gostando de Java?");
		
		switch(resposta) {
			case 0:
			JOptionPane.showMessageDialog(null, "Que legal!");
			break;
			
			case 1:
			JOptionPane.showMessageDialog(null, "Que pena");
			break;
			
			case 2:
			JOptionPane.showMessageDialog(null, "Você cancelou");
			break;
			
			default:
			JOptionPane.showMessageDialog(null, "Você finalizou");
			}*/
		}
}
