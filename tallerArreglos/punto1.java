package tallerArreglos;

import java.util.Scanner;

public class punto1 {

 public static void main(String[] args) {
  
  Scanner keyboard = new Scanner(System.in);
  int[] numeros = new int[4];
  
  System.out.println("Ingrese 4 números enteros");

  for (int i=0; i<numeros.length; i++) {
   System.out.print("Ingrese el dato "+(i+1)+": "); 
   numeros[i] = keyboard.nextInt(); 
  }
  int mayor, menor;
  mayor = menor = numeros [0];
  
  for (int i=0; i<numeros.length; i++) {
   if(numeros [i]>mayor) {
    mayor=numeros[i];
   }
   if(numeros[i]<menor) {
    menor=numeros[i];
   }
  }
  System.out.println("El mayor numero es : "+mayor);
  System.out.println("El menor numero es : "+menor);
 }
}