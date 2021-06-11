package src;
import java.util.Scanner;


	public class Ejercicio3{
	public static void main(String[] args){

	Ejercicio3 ej3 = new Ejercicio3();

}


	//variables globales

	//tamaño de la matriz
	int[] elementos = new int[8];
	int numero;
	

	//Definir el Scanner
	Scanner scanner = new Scanner(System.in);

	public Ejercicio3(){

	for(int i = 0 ; i<8; i++){
				
				ingresarNumeros(i);

				//mostrarDato(i);
				

	}

	
				

				//mostrarDato(i);
				

	
	
			buscarNumero();
		
	
		

	}

	public void ingresarNumeros(int numero){

	
			System.out.println("Ingresa un numero");
			elementos[numero]= scanner.nextInt();

		
	}


	public void buscarNumero(){

			int buscar = 0;

			System.out.println("Ingrese un valor a buscar");
			buscar = scanner.nextInt();


			int contador=0;

			while ((contador < 8 ) &&(elementos[contador]) !=buscar) {

				contador++;
					

			}

			if (contador != 8) {

				System.out.println("Lo encontre");
				
			}

				else{

					System.out.println("No lo encontre");	
				}


	}



		
	}



		



