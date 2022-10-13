package parcial;

import javax.swing.JOptionPane;

public class punto3 {

public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero:"));
		for(int i=1;i<=n;i++) {
			if(i%2 !=0) {
				System.out.println(i);
			}
		}
	}
}