package tallerArreglos;

import javax.swing.JOptionPane;

public class extra {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("digite un numero cualquiera: "));
		for(int i=1; i<=n;i++) {
			if(i%2 !=0) {
				System.out.println(i);
			}
		}
	}
}