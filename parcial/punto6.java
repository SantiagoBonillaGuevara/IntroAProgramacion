package parcial;

import javax.swing.JOptionPane;

public class punto6 {

	public static void main(String[] args) {
		int [] parcela = new int[20];
		Boolean[] sembrado = new Boolean[20];
		for(int i=1;i<=parcela.length;i++) {
			parcela[i-1] =(int) Math.floor(Math.random()*3+1);
			sembrado[i-1]=true;
		}
		//maiz es 1
		//papa es 2
		//yuca es 3
		String i;
		do {
			String eleccion = JOptionPane.showInputDialog("Selecciona la accion que deseas realizar\n"
					+"a)ver cuantas y cuales parcelas se sembraron con maiz.\n"
					+"b)ver cuantas y cuales parcelas se sembraron con papa.\n"
					+"c)ver cuantas y cuales parcelas se sembraron con yuca.\n"
					+"d)volver a sembrar una parcela\n"
					+"e)cosechar una parcela\n");
			switch (eleccion) {
			case "a":
				int contador=0;
				JOptionPane.showMessageDialog(null, "Las parcelas que estan sembrados con maiz son: ");
				for(int c = 1;c<=parcela.length;c++) {
					if(parcela[c-1]==1) {
						JOptionPane.showMessageDialog(null,"parcela numero: "+c);
						contador++;
					}
				}
				JOptionPane.showMessageDialog(null, "el numero de parcelas sembradas con maiz son: "+contador);
				break;
			case "b":
				int contador1=0;
				JOptionPane.showMessageDialog(null, "Las parcelas que estan sembrados con papa son: ");
				for(int c = 1;c<=parcela.length;c++) {
					if(parcela[c-1]==2) {
						JOptionPane.showMessageDialog(null,"parcela numero: "+c);
						contador1++;
					}
				}
				JOptionPane.showMessageDialog(null, "el numero de parcelas sembradas con papa son: "+contador1);
				break;
			case "c":
				int contador2=0;
				JOptionPane.showMessageDialog(null, "Las parcelas que estan sembrados con yuca son: ");
				for(int c = 1;c<=parcela.length;c++) {
					if(parcela[c-1]==3) {
						JOptionPane.showMessageDialog(null,"parcela numero: "+c);
						contador2++;
					}
				}
				JOptionPane.showMessageDialog(null, "el numero de parcelas sembradas con yuca son: "+contador2);
				break;
			case "d":
				int sembrar = Integer.parseInt(JOptionPane.showInputDialog("Que parcela desea sembrar de nuevo: "));
				if(sembrado[sembrar-1]!=true) {
					parcela[sembrar-1]=(int) Math.floor(Math.random()*3+1);
					sembrado[sembrar-1]=true;
					JOptionPane.showMessageDialog(null,"parcela numero:"+ sembrar+" ha sido sembrada de nuevo");
				}
				else {
					JOptionPane.showMessageDialog(null,"esa parcela esta sembrada ya, primero la debes cosechar");
				}
				
				break;
			case "e":
				int cosecha = Integer.parseInt(JOptionPane.showInputDialog("Que parcela desea cosechar: "));
				if(sembrado[cosecha-1]==true) {
					sembrado[cosecha-1]=false;
					JOptionPane.showMessageDialog(null,"parcela numero "+cosecha+" ha sido cosechada");
				}
				else {
					JOptionPane.showMessageDialog(null,"esa parcela esta cosechada ya o no la has sembrado");
				}
				break;
			}
			i = JOptionPane.showInputDialog("Desea volver a ver el menu Si/No");
		}while(i.equals("S")||i.equals("SI")||i.equals("si")||i.equals("Si")||i.equals("s"));
	}
}