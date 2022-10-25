package quiz;

import javax.swing.JOptionPane;

public class punto1 {

	public static void main(String[] args) {
	int i =0;
	while(i<1) {
		int e = Integer.parseInt(JOptionPane.showInputDialog("Que operacion realizara?:\n1.Averiguar numero mayor o menor\n2.Calcular raiz cuadrada\n3.Elevar una potencia\\n4.Averiguar numero menor\n5.Salir"));
		switch(e) {
		case 1:
			mayor();
			break;
		case 2:
			int num= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para hallar su raiz cuadrada"));
			JOptionPane.showMessageDialog(null, "La raiz cuadrada de "+num+" es: "+Math.sqrt(num));
			break;
		case 3:
			potencia();
			break;
		case 4:
			menor();
			break;
		case 5: i++;
			break;
		default: JOptionPane.showMessageDialog(null, "elija una de las 4 opciones");
			break;
		}
	}
	}
	public static void mayor() {
		int []n= new int[2];
		n[0]= Integer.parseInt(JOptionPane.showInputDialog("Digite numero 1"));
		n[1]= Integer.parseInt(JOptionPane.showInputDialog("Digite numero 2"));
		if(n[0]==n[1]) {JOptionPane.showMessageDialog(null, "los 2 numeros son iguales");}
		else if(n[0]>n[1]) {JOptionPane.showMessageDialog(null, n[0]+" es mayor que "+n[1]);}
		else {JOptionPane.showMessageDialog(null, n[1]+" es mayor que "+n[0]);}
	}
	public static void potencia() {
		int n= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para potenciar"));
		int p= Integer.parseInt(JOptionPane.showInputDialog("Digite el potenciador"));
		JOptionPane.showMessageDialog(null, n+" potenciado a la "+p+" es: "+Math.pow(n, p));
	}
	public static void menor() {
		int []n= new int[2];
		n[0]= Integer.parseInt(JOptionPane.showInputDialog("Digite numero 1"));
		n[1]= Integer.parseInt(JOptionPane.showInputDialog("Digite numero 2"));
		if(n[0]==n[1]) {JOptionPane.showMessageDialog(null, "los 2 numeros son iguales");}
		else if(n[0]>n[1]) {JOptionPane.showMessageDialog(null, n[1]+" es menor que "+n[0]);}
		else {JOptionPane.showMessageDialog(null, n[0]+" es menor que "+n[1]);}
	}
}