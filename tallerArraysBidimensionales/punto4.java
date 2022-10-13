package tallerArraysBidimensionales;

import javax.swing.JOptionPane;

public class punto4 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("cuantas edades desea generar?"));
		int [] edad = new int[n];
		Boolean [] mayor = new Boolean[n];
		int c = 0;
		for(int i = 0;i<edad.length;i++) {
			edad[i]=(int)(Math.random()*30+1);
			if(edad[i]>=18) {
				mayor[i]=true;
			}
			else {
				mayor[i]=false;
			}
			System.out.println("edad "+edad[i]+" es mayor de edad? : "+mayor[i]);
			c = c+edad[i];
		}
		int p = c/n;
		System.out.println("\n \nEl promedio de las edades es: "+p);
	}
}