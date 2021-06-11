package src;
import java.util.Scanner;

public class Ejercicio11 {
   public static void main(String[] args) {

      Ejercicio11 ej11 = new Ejercicio11();

   }

   //variables globales
   String nombre;
   int nota;


   // TipoDeDato nombre[] = new TipoDeDato[tamaño];

   String matriz1[] = new String[6];
   int matriz2[] = new int[6];



   //Definir el Scanner
   Scanner scanner = new Scanner(System.in);


   //constructor  
   public Ejercicio11() {

    crearMatriz1(); 
    mostrarMatriz1();

    crearMatriz2(); 
    mostrarMatriz2();
    notasPalabra();

    


   }



   public void crearMatriz1(){

         for (int i =0; i<6;i++) {


             System.out.println("\nIngrese un nombre:");
             nombre = scanner.nextLine();

            matriz1[i]=nombre;

         }
         System.out.println("");



      }

   public void mostrarMatriz1(){
      //numero de filas
      for (int i =0; i<6;i++ ) {


            System.out.print(" nombre "+(i+1)+" matriz 1: "+(matriz1[i]));


         System.out.println("");

      }
   }


    public void crearMatriz2(){

         for (int i =0; i<6;i++) {


             System.out.println("\nIngrese la nota del alumno :"+ matriz1[i]);
             nota = scanner.nextInt();

             if (nota>0 && nota <11) {

              matriz2[i]=nota;
               
             }

             else{
              System.out.println("\nIngrese una nota valida para: "+ matriz1[i]);
              System.out.println("\nIngrese la nota del alumno: "+ matriz1[i]);
             nota = scanner.nextInt();
              matriz2[i]=nota;

             }

            

         }
         System.out.println("");



      }

   public void mostrarMatriz2(){
      //numero de filas
      for (int i =0; i<5;i++ ) {


           System.out.print("Nota del alumno "+(matriz1[i])+" = "+(matriz2[i]));


         System.out.println("");

      }
   }

   public void notasPalabra(){
    System.out.println("");

    for (int i =0 ; i<5 ;i++ ) {

      if (matriz2[i]>=0 && matriz2[i]<4.99) {



        System.out.println("Nombre alumno: " +matriz1[i]+ " nota: "+matriz2[i] +" -> Suspenso");
        
      }

      if (matriz2[i]>=5 && matriz2[i]<6.99) {

        System.out.println("Nombre alumno: " +matriz1[i]+ " nota: "+matriz2[i] +" -> Bien");
        
      }

      if (matriz2[i]>=7 && matriz2[i]<8.99) {

        System.out.println("Nombre alumno: " +matriz1[i]+ " nota: "+matriz2[i] +" -> Notable");        
      }

      if (matriz2[i]>=9 && matriz2[i]<10) {

       System.out.println("Nombre alumno: " +matriz1[i]+ " nota: "+matriz2[i] +" -> Sobresaliente");
        
      }


      
    }
   }


   

}
