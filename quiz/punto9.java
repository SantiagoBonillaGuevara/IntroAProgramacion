package quiz;

import javax.swing.JOptionPane;

public class punto9 {

	public static void main(String[] args) {
		//La temperatura inicial de la barra es 20 grados centigrados
		int t = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la temperatura que desea alcanzar: "));
		if (t<=20) {
			JOptionPane.showMessageDialog(null, "Digite una temperatura mayor a la inicial");
		}
		else {
			float segundos= 0;
			int i = 20;
			while(i<t) {
				segundos = (float) (segundos + 0.5);
				i++;
			}
			float minutos = segundos/60;
			JOptionPane.showMessageDialog(null, "La barra tardara "+minutos+" minutos en alcanzar "+t+" grados celsius.");
		}
	}
}
