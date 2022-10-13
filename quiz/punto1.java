package quiz;

import javax.swing.JOptionPane;

public class punto1 {

	public static void main(String[] args) {
		int nNumeros = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros desea ingresar?"));
		int i = 0;
		float suma = 0;
		
		while(i < nNumeros) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
			suma = suma + numero;
			i++;
		}
		float promedio = suma/nNumeros;
		JOptionPane.showMessageDialog(null, "El promedio de los numeros que usted ingreso es: "+promedio);
	}
}
