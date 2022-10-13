package quiz;

import javax.swing.JOptionPane;

public class punto3 {

	public static void main(String[] args) {
		int i = 15;
		do {
			if(i%3 == 0) {
				JOptionPane.showMessageDialog(null,i);
			}
			i++;
		}while(i<=30);
	}
}