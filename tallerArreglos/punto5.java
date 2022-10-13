package tallerArreglos;

import javax.swing.JOptionPane;
public class punto5 {
	public static void main(String[] args) {
		int ingresos = 0;
		String i;
		String producto[]; int precio[];
		producto=new String[10]; precio=new int[10];
		producto[0]=("Barquillos"); precio[0]=1390;
		producto[1]=("Almendras de Chocolate"); precio[1]=5400;
		producto[2]=("Barquillos Surtidos");precio[2]=3990;
		producto[3]=("Barra de Chocolate");precio[3]=1950;
		producto[4]=("Trident Yerbabuena");precio[4]=3150;
		producto[5]=("Trident Morazul");precio[5]=1150;
		producto[6]=("Tableta Chocolate");precio[6]=3490;
		producto[7]=("Cocada Tradicional");precio[7]=6490;
		producto[8]=("Tirudito Supercoco");precio[8]=3190;
		producto[9]=("Cocosette");precio[9]=1390;
		do {
			String seleccion = JOptionPane.showInputDialog("Bienvenido a CANDYSHOP<3 tu tienda de dulces favorita\nSelecciona la accion que deseas realizar\na)Mostrar los productos y sus precios.\nb)Vender un producto.\nc)Mostrar el total de ingresos.​\nd)Cambiar Precio.​");
		switch (seleccion) {
		case"a":
			for(int n=0; n<precio.length; n++) {
				JOptionPane.showMessageDialog(null,producto[n]+":  $"+precio[n]);
			}
			break;
		case"b":
			int pv = Integer.parseInt(JOptionPane.showInputDialog("¿Que producto desea vender?:\n1.Barquillos\n2.Almendras de Chocolate\n3.Barquilos surtidos"
					+ "\\n4.Barra de chocolate\n5.Trident yerbabuena\n6.Trident morazul\n7.Tableta chocolate\n8.Cocada tradicional\n9.Tirudito supercoco\n10.Cocossette"));
			int c = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos "+producto[pv-1]+" desea vender?"));
			int venta = c*precio[pv-1];
			ingresos = ingresos+venta;
			break;
		case"c":
			JOptionPane.showMessageDialog(null,"los ingresos actuales son: "+ingresos);
			break;
		case"d":
			int cp = Integer.parseInt(JOptionPane.showInputDialog(null,"¿A que producto desea cambiarle el precio?:\n1.Barquillos\n2.Almendras de Chocolate\n3.Barquilos surtidos"
					+ "\\n4.Barra de chocolate\n5.Trident yerbabuena\n6.Trident morazul\n7.Tableta chocolate\n8.Cocada tradicional\n9.Tirudito supercoco\n10.Cocossette"));
			precio[cp-1] = Integer.parseInt(JOptionPane.showInputDialog("¿Que precio desea ponerle a "+producto[cp-1]+"?"));
			break;
	    }
		i = JOptionPane.showInputDialog("Desea volver a ver el menu Si/No");
		}
		while(i.equals("S")||i.equals("SI")||i.equals("si")||i.equals("Si")||i.equals("s"));
	}

}