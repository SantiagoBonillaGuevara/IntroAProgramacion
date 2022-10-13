package quiz;

import javax.swing.JOptionPane;

public class punto5 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para sacar su factorial: "));
		int i = 0;
		int factorial = 1;
		while(i <numero) {
			i++;
			factorial = factorial*i;
		}
		JOptionPane.showMessageDialog(null, "El factorial de "+numero+" es "+factorial);
	}
}