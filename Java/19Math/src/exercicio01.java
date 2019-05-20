import javax.swing.JOptionPane;


public class exercicio01 {

	public static void main(String[] args) {
		Object[] oper = {"Soma","Subtração","Multiplicação","Divisão","Seno","Cosseno","Tangente","Log","Raiz Quadrada","Raiz Cúbica"};
		double num1,num2,continuar=1;
		int operacao;
		
		do {
			operacao = JOptionPane.showOptionDialog(null, "Qual a operação que você deseja realizar?", "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, oper, 0);
			if(operacao==0||operacao==1||operacao==2||operacao==3) {
			num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Número 1:"));
			num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Número 2:"));
			switch(operacao) {
			case 0:
				JOptionPane.showMessageDialog(null, num1+num2);
				break;
			case 1:
				JOptionPane.showMessageDialog(null, num1>num2? num1-num2 : num2-num1);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, num1*num2);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, num1>num2? num1/num2 : num2/num1);
				break;
			
			}
			}else {
				num1 = Double.parseDouble(JOptionPane.showInputDialog("Número: "));
				switch(operacao) {
				case 4:
					JOptionPane.showMessageDialog(null, Math.sin(num1));
					break;
				case 5:
					JOptionPane.showMessageDialog(null, Math.cos(num1));
					break;
				case 6:
					JOptionPane.showMessageDialog(null, Math.tan(num1));
					break;
				case 7:
					JOptionPane.showMessageDialog(null, Math.log(num1));
					break;
				case 8:
				JOptionPane.showMessageDialog(null, Math.sqrt(num1));
				break;
				case 9:
					JOptionPane.showMessageDialog(null, Math.cbrt(num1));
					break;
				}
			}
			
			
			
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		}while(continuar==0);
	
	
	
	
	
	
	
	
	
	}

}
