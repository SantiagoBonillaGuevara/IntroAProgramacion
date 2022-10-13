package quiz;

import javax.swing.JOptionPane;

public class punto7 {

	public static void main(String[] args) {
	int i = 0;
	int contraseña = (int)(Math.random()*9999+1000);
	JOptionPane.showMessageDialog(null, "Recuerde esta contraseña: "+contraseña);
	do {
		int contraseñaDigitada = Integer.parseInt(JOptionPane.showInputDialog("Digite la contraseña"));
		if(contraseñaDigitada==contraseña) {i++;}
	}while(i<1);
	JOptionPane.showMessageDialog(null, "Bien hecho:)");
	}
}
