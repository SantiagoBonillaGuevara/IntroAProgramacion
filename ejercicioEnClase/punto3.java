package ejercicioEnClase;

import java.util.Scanner;

public class punto3 {

	public static void main(String[] args) {
		int min;
		int max;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("digite un minimo\n");
		min = keyboard.nextInt();
		System.out.print("digite un maximo\n");
		max = keyboard.nextInt();
		for(int i = min; i<max;i++) {
			if(i%2 ==0) {
				System.out.println(i);
			}
		}
	}
}