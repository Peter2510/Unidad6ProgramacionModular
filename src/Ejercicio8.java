package src;
import java.util.Scanner;

public class Ejercicio8 {
   public static void main(String[] args) {

      Ejercicio8 ej8 = new Ejercicio8();

   }

   //variables globales
   String palabra;
   

   // TipoDeDato nombre[] = new TipoDeDato[tamaño];

   String matriz1[] = new String[5];
   String matriz2[] = new String[5];

 

   //Definir el Scanner
   Scanner scanner = new Scanner(System.in);


   //constructor  
   public Ejercicio8() {

    crearMatriz1(); 
    mostrarMatriz1();

    crearMatriz2(); 
    mostrarMatriz2();

    comparar();
     

   }



   public void crearMatriz1(){
   
         for (int i =0; i<5;i++) {
     

             System.out.println("\nIngrese una palabra:");
             palabra = scanner.nextLine();
         
            matriz1[i]=palabra;
            
         }
         System.out.println("");


         
      }

   public void mostrarMatriz1(){
      //numero de filas
      for (int i =0; i<5;i++ ) {


            System.out.print(" Palabra "+(i+1)+" matriz 1: "+(matriz1[i]));
            
         
         System.out.println("");
         
      }
   }


    public void crearMatriz2(){
   
         for (int i =0; i<5;i++) {
     

             System.out.println("\nIngrese una palabra:");
             palabra = scanner.nextLine();
         
            matriz2[i]=palabra;
            
         }
         System.out.println("");


         
      }

   public void mostrarMatriz2(){
      //numero de filas
      for (int i =0; i<5;i++ ) {


           System.out.print(" Palabra "+(i+1)+" matriz 2: "+(matriz2[i]));
            
         
         System.out.println("");
         
      }
   }


   public void comparar(){

      int palabra1Matriz1 = 0;
      int palabra1Matriz2 = 0;

      int longitudPalabra1Matriz1 = matriz1[palabra1Matriz1].length();
      int longitudPalabra1Matriz2 = matriz2[palabra1Matriz2].length();

      if (longitudPalabra1Matriz1==longitudPalabra1Matriz2) {

         System.out.println("\nLa palabra 1 del arreglo 1 es igual a la palabra 1 del arreglo 2");

         System.out.println("\nIndice de la palabra 1 arreglo 1 : " + "0");
         System.out.println("Indice de la palabra 1 arreglo 2: " + "0");

         System.out.println("\nLa longitud de la palabra 1 arreglo 1: "+ longitudPalabra1Matriz1);
         System.out.println("La longitud de la palabra 1 arreglo 2: "+ longitudPalabra1Matriz2);


         
      }

      else{

         System.out.println("\nLa palabra 1 del arreglo 1 es igual a la palabra 1 del arreglo 2 no son iguales");
      }
      
   }

}

