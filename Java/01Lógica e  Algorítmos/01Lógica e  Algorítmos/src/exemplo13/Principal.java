package exemplo13;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Tratamento de erros
		try {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(null, "Falha ao obter a idade: " +erro.getMessage());
		}finally{
			JOptionPane.showMessageDialog(null, "Sistema finalizado");
		}
	}

}
