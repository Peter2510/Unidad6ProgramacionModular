package src;
import java.util.Scanner;


	public class Ejercicio2{
	public static void main(String[] args){

	Ejercicio2 ej2 = new Ejercicio2();

}


	//variables globales

	//tamaño de la matriz
	int[] elementos = new int[10];
	int numAleatorio=0;
	int mayor;

	//Definir el Scanner
	Scanner scanner = new Scanner(System.in);

	public Ejercicio2(){

	for(int i = 0 ; i<10; i++){
				
				ingresarNumeros(i);
	}



	for(int i = 0 ; i<10; i++){
				
				
				mostrarDato(i);
				compararDatos(numAleatorio,i);

			

	}

		System.out.println("El numero mayor es :" +mayor);

	}



		public void mostrarDato(int numero){
		
		System.out.println("\nEl indice es "+numero+ " el valor es: "+ elementos[numero]);

}


		public void ingresarNumeros(int numero){

	
		// generar numero aleatorio entre 10 y 50
			numAleatorio = (int) (Math.random() * (100 - 1 ) + 1 );
			
			elementos[numero] = numAleatorio;


			System.out.println("\n"+numAleatorio);
	}



		public void compararDatos(int numAleatorio, int i){

			int mayor =elementos[0];


			if (mayor>elementos[5]) {

				mayor = numAleatorio ;

					

			}
				
			}


		}



