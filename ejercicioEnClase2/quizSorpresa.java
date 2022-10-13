package ejercicioEnClase2;

import javax.swing.JOptionPane;

public class quizSorpresa {

	public static void main(String[] args) {
		int c = 0;
		int [] numeros = new int[20];
		for(int i=0;i<numeros.length;i++) {
			numeros [i] = (int) Math.floor(Math.random()*(1 + 40));
			System.out.print(numeros[i]+", ");
		}
		do {
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero, si esta en el array se termina el programa"));
			for(int b = 0;b<numeros.length;b++) {
				if(numeros[b]==n) {
					c++;
				}
			}
		}while(c<1);		
	}
}