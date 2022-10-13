package tallerArraysBidimensionales;

import javax.swing.JOptionPane;

public class punto2 {

	public static void main(String[] args) {
		int [] [] valores = new int [5] [5];
		for(int i = 0;i<valores.length;i++) {
			for(int c = 0;c<valores.length;c++) {
				valores[i][c]=(int) Math.floor(Math.random()*9+1);
			}
		}
		int [] [] valores1 = new int [5] [5];
		for(int i = 0;i<valores1.length;i++) {
			for(int c = 0;c<valores1.length;c++) {
				valores1[i][c]=(int) Math.floor(Math.random()*9+1);
			}
		}
		int finalizar=0;
		do {
			String menu = JOptionPane.showInputDialog("que desea hacer?:\n 1.sumarlos.\n 2.restarlos.\n 3.multiplicarlos.\n 4.salir del menu");
			switch (menu) {
			case "1":
				System.out.print("LA SUMA: \n");
				for(int i = 0;i<valores.length;i++) {
					for(int c = 0;c<valores.length;c++) {
						System.out.println(+valores[i][c]+" + "+valores1[i][c]+" = "+(valores[i][c]+valores1[i][c]));
					}
				}
				System.out.print("-------------------------------\n");
				break;
			case "2":
				System.out.print("LA RESTA: \n");
				for(int i = 0;i<valores.length;i++) {
					for(int c = 0;c<valores.length;c++) {
						System.out.println(valores[i][c]+" - "+valores1[i][c]+" = "+(valores[i][c]-valores1[i][c]));
								
					}
				}
				System.out.print("\n O tambien \n \n");
				for(int i = 0;i<valores.length;i++) {
					for(int c = 0;c<valores.length;c++) {
						System.out.println(valores1[i][c]+" - "+valores[i][c]+" = "+(valores1[i][c]-valores[i][c]));
					}
				}
				System.out.print("-------------------------------\n");
				break;
			case "3":
				System.out.print("LA MULTIPLICACION: \n");
				for(int i = 0;i<valores.length;i++) {
					for(int c = 0;c<valores.length;c++) {
						System.out.println(+valores[i][c]+" x "+valores1[i][c]+" = "+(valores[i][c]*valores1[i][c]));
					}
				}
				System.out.print("-------------------------------\n");
				break;
			case"4":
				JOptionPane.showMessageDialog(null, "hasta luego");
				finalizar++;
				break;
			default:
				JOptionPane.showMessageDialog(null, "elija una de las 4 opciones >:v");
				break;
			}
		}while(finalizar<1);
	}
}