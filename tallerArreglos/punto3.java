package tallerArreglos;

public class punto3 {
	
	public static void main(String[] args) {
		int contador = 0;
		int [] numeros = new int[20];
		for(int i=0; i<numeros.length; i++) {
			numeros [i] = (int) Math.floor(Math.random()*(0 + 2));
			System.out.print(numeros[i]+", ");
			if(numeros[i]==0) {
				contador++;
			}
		}
		System.out.println("\nhay un total de "+contador+" numeros 0");
	}
}