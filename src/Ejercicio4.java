package src;
import java.util.Scanner;

public class Ejercicio4 {
   public static void main(String[] args) {

      Ejercicio4 ej4 = new Ejercicio4();

   }

   //variables globales

   //tamaño de la matriz
   int[] elementos = new int[10];
   int numero,mayor,menor;

   //Definir el Scanner
   Scanner scanner = new Scanner(System.in);


   //constructor	
   public Ejercicio4() {

      for (int i = 0; i < 10; i++) {

         ingresarNumeros(i);
         

      }

     numeroMayor();
     distancia();

   }

   //metodo para ingresar numeros al array
   public void ingresarNumeros(int numero) {

      System.out.println("\nIngresa un numero");
      elementos[numero] = scanner.nextInt();

   }

   public void numeroMayor(){

   	mayor = menor = elementos[0];

   		for (int i=0; i<10 ;i++ ) {

   			if (elementos[i]>mayor) {

   				mayor = elementos[i];
   				
   			}
   			
   		}

   		System.out.println("\nEl mayor valor ingresado es: "+mayor);

   }


   public void distancia(){

   	 for (int i =0;i<10 ; i++ ) {

   	 	System.out.println("\nLa distancia de "+elementos[i]+" al numero mayor es: " +(mayor-elementos[i]));
   	 	
   	 }
   }

}

