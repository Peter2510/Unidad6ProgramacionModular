package src;
import java.util.Scanner;

public class Ejercicio5 {
   public static void main(String[] args) {

      Ejercicio5 ej5 = new Ejercicio5();

      Scanner scanner = new Scanner(System.in);

       System.out.println("Ingresa el numero de notas a ingresar");
      int n = scanner.nextInt();

   }

   //variables globales
   int n;
   //tamaño de la matriz
   int[] elementos = new int[n];
   //int ingresoUsuario;

   //Definir el Scanner
   
Scanner scanner = new Scanner(System.in);
   //constructor	
   public Ejercicio5() {


     


         

      for (int i = 0; i < 5; i++) {

         ingresarNumeros(i);
         

      }


     

   }

   public void numeroNotas(){


   }


   //metodo para ingresar numeros al array
   public void ingresarNumeros(int n) {

      System.out.println("\nIngresa un numero");
      elementos[5] = scanner.nextInt();

   }

  


  

}

