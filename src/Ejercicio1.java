package src;
import java.util.Scanner;


	public class Ejercicio1{
	public static void main(String[] args){

	Ejercicio1 ej1 = new Ejercicio1();

}


	//variables globlaes
	int[] elementos = new int[5];
	Scanner scanner = new Scanner(System.in);

	public Ejercicio1(){

	for(int i = 0 ; i<5; i++){
				
				pedirValor(i);
	}



	for(int i = 0 ; i<5; i++){
				
				mostrarDato(i);

	}

	double promedio = getPromedio();
	System.out.println("\nEl promedio de los numeros ingresados es "+ promedio);

	}

	public double getPromedio(){

			int total = 0;

			for(int i = 0; i<5; i++){

			total+=elementos[i];
			}



			double promedio = (double)total/5;
			return promedio;
}


		public void mostrarDato(int numero){
		
		System.out.println("\nEl indice es "+numero+ " el valor es: "+ elementos[numero]);
}


		public void pedirValor(int numero){
	
		System.out.print("\nIngrese el valor numero "+(numero+1)+": ");
		elementos[numero] = scanner.nextInt();
}

}