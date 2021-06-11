package src;
import java.util.Scanner;

public class Ejercicio9 {
   public static void main(String[] args) {

      Ejercicio9 ej9 = new Ejercicio9();

   }

   //variables globales


   int  matriz[][],matriz2[][] ,tamanioFilas, tamanioColumas,tamanioFilas2, tamanioColumas2;

   //Definir el Scanner
   Scanner scanner = new Scanner(System.in);


   //constructor  
   public Ejercicio9() {

    tamanioMatriz();
    //crearMatriz();
   mostrarMatriz();
   tamanioMatriz2();
    //crearMatriz();
   mostrarMatriz2();



   }

   public void tamanioMatriz(){

    System.out.println("Ingrese el numero de columnas: ");
    tamanioColumas = scanner.nextInt();


    System.out.println("Ingrese el numero de filas: ");
    tamanioFilas = scanner.nextInt();

    matriz = new int[tamanioFilas][tamanioColumas];


   }

  /*public void crearMatriz(){


         for (int i =0; i<tamañoFilas;i++ ) {

         //numero de columnas
         for (int j=0; j<tamañoColumas ; j++) {

         }
         System.out.println("");

         } */

public void mostrarMatriz(){
      //numero de filas
      for (int i =0; i<tamanioFilas;i++ ) {

         //numero de columnas
         for (int j=0; j<tamanioColumas; j++) {

            System.out.print((" "+matriz[i][j])+" ");

         }
         System.out.println("");

      }
   }

    public void tamanioMatriz2(){

    System.out.println("Ingrese el numero de columnas: ");
    tamanioColumas2 = scanner.nextInt();


    System.out.println("Ingrese el numero de filas: ");
    tamanioFilas2 = scanner.nextInt();

    matriz2 = new int[tamanioFilas2][tamanioColumas2];


   }

   public void mostrarMatriz2(){
      //numero de filas
      for (int i =0; i<tamanioFilas2;i++ ) {

         //numero de columnas
         for (int j=0; j<tamanioColumas2; j++) {

            System.out.print((" "+matriz2[i][j])+" ");

         }
         System.out.println("");

      }
   }



}

    

   


   





   




