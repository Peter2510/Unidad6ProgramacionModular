package src;
import java.util.Scanner;

public class Ejercicio9 {
   public static void main(String[] args) {

      Ejercicio9 ej9 = new Ejercicio9();

   }

   //variables globales

   int matriz[][], matriz2[][], tamanioFilas, tamanioColumas, tamanioFilas2, tamanioColumas2;

   //Definir el Scanner
   Scanner scanner = new Scanner(System.in);

   //constructor  
   public Ejercicio9() {

      tamanioMatriz();
      crearMatriz();
      mostrarMatriz();
      tamanioMatriz2();
      crearMatriz2();
      mostrarMatriz2();
      compararDimensionesYSumar();

   }

   public void tamanioMatriz() {

      System.out.println("\nIngrese el numero de columnas de la matriz 1: ");
      tamanioColumas = scanner.nextInt();

      System.out.println("\nIngrese el numero de filas de la matriz 1: ");
      tamanioFilas = scanner.nextInt();

      matriz = new int[tamanioFilas][tamanioColumas];

   }

   public void crearMatriz() {

      for (int i = 0; i < tamanioFilas; i++) {

         //numero de columnas
         for (int j = 0; j < tamanioColumas; j++) {

            System.out.println("\nIngrese los numeros de la matriz 1: ");
            int numerosMatriz1 = scanner.nextInt();

            matriz[i][j] = numerosMatriz1;

         }
         System.out.println("");

      }
   }

   public void mostrarMatriz() {
      //numero de filas
      for (int i = 0; i < tamanioFilas; i++) {

         //numero de columnas
         for (int j = 0; j < tamanioColumas; j++) {

            System.out.print((" " + matriz[i][j]) + " ");

         }
         System.out.println("");

      }
   }

   public void tamanioMatriz2() {

      System.out.println("\nIngrese el numero de columnas de la matriz 2: ");
      tamanioColumas2 = scanner.nextInt();

      System.out.println("\nIngrese el numero de filas de la matriz 2: ");
      tamanioFilas2 = scanner.nextInt();

      matriz2 = new int[tamanioFilas2][tamanioColumas2];

   }

   public void crearMatriz2() {

      for (int i = 0; i < tamanioFilas2; i++) {

         //numero de columnas
         for (int j = 0; j < tamanioColumas2; j++) {

            System.out.println("\nIngrese los numeros de la matriz 2: ");
            int numerosMatriz2 = scanner.nextInt();

            matriz2[i][j] = numerosMatriz2;

         }
         System.out.println("");

      }
   }

   public void mostrarMatriz2() {
      //numero de filas
      for (int i = 0; i < tamanioFilas2; i++) {

         //numero de columnas
         for (int j = 0; j < tamanioColumas2; j++) {

            System.out.print((" " + matriz2[i][j]) + " ");

         }
         System.out.println("");

      }
   }

   public void compararDimensionesYSumar() {
      if ((tamanioColumas == tamanioColumas2) && (tamanioFilas == tamanioFilas2)) {

         System.out.print("\nSe pueden sumar");

         int matrizResultado[][] = new int[2][2];

         /* for (int i =0;i<tamanioFilas ;i++ ) {

          for ( int j = 0 ;j< tamanioColumas ;i++ ) {

            matrizResultado [i][j]= matriz[i][j]+ matriz2[i][j];

            System.out.println(matrizResultado[0][0]);


          
          }
      }

      
    } */
      }

   }
}


   





   




