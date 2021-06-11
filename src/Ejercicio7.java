package src;
import java.util.Scanner;

public class Ejercicio7 {
   public static void main(String[] args) {

      Ejercicio7 ej7 = new Ejercicio7();

   }

   //variables globales


   //tamaño de la matriz, corchetes indica la cantidad de filas
   
   int numAleatorio;

   int matriz[][] = new int[4][3];
   


   //Definir el Scanner
   Scanner scanner = new Scanner(System.in);


   //constructor  
   public Ejercicio7() {


    crearMatriz();
    mostrarMatriz();
     

   }

    public void mostrarMatriz(){
      //numero de filas
      for (int i =0; i<4;i++ ) {

         //numero de columnas
         for (int j=0; j<3; j++) {

            System.out.print((" "+matriz[i][j])+" ");
            
         }
         System.out.println("");
         
      }
   }



   public void crearMatriz(){

      // generar numero aleatorio entre 10 y 50
      

   
         for (int i =0; i<4;i++ ) {

         //numero de columnas
         for (int j=0; j<3 ; j++) {


              numAleatorio = (int) (Math.random() * (555 - 0 ) + 0 );
         
            matriz[i][j]=numAleatorio;
            
         }
         System.out.println("");
         
      }


         
      }

        



   }



   

  


  


