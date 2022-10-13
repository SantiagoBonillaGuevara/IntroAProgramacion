package ejercicioEnClase;

import java.util.Scanner;

public class punto2 {

	public static void main(String[] args) {
		String c;
		Scanner keyboard = new Scanner(System.in);
		String contraseñaCorrecta = "Alice";
		int i = 0;
		while(i==0) {
			System.out.print("digite la contraseña\n");
			c = keyboard.nextLine();
			if(c.equals(contraseñaCorrecta)){
				i++;
			}
		}System.out.println("La contraseña es correcta");
	}
}