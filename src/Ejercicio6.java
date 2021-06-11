package src;
import java.util.Scanner;

public class Ejercicio6 {
   public static void main(String[] args) {

      Ejercicio6 ej6 = new Ejercicio6();

   }

   //variables globales
   //tamaño de la matriz, corchetes indica la cantidad de filas
   int matriz [][] = {{ 5 , 6 , 13 },{ 14 , 2 , 4 },{21 , 7 , 6 }};
   //int ingresoUsuario;

   //Definir el Scanner
   Scanner scanner = new Scanner(System.in);


   //constructor  
   public Ejercicio6() {


    mostrarMatriz();
     

   }

   public void mostrarMatriz(){
      //numero de filas
      for (int i =0; i<3;i++ ) {

         //numero de columnas
         for (int j=0; j<3 ; j++) {

            System.out.print(" "+(2)*(matriz[i][j])+" ");
            
         }
         System.out.println("");
         
      }
   }

  


  

}

