package src;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Ejercicio10 ej10 = new Ejercicio10();

    }

    //variables globales

    //tamaño de la matriz, corchetes indica la cantidad de filas

    int numAleatorio;
    int numeroFilas = 3;
    int numeroColumnas = 4;
    int matriz[][] = new int[numeroFilas][numeroColumnas];

    //Definir el Scanner
    Scanner scanner = new Scanner(System.in);

    //constructor  
    public Ejercicio10() {

        crearMatriz();
        mostrarMatriz();
        traspuesta();

    }

    public void crearMatriz() {

        // generar numero aleatorio entre 10 y 50

        for (int i = 0; i < numeroFilas; i++) {

            //numero de columnas
            for (int j = 0; j < numeroColumnas; j++) {

                numAleatorio = (int)(Math.random() * (100 - 5) + 5);

                matriz[i][j] = numAleatorio;

            }
            System.out.println("");

        }

    }

    public void mostrarMatriz() {

        System.out.println("Matriz generada aleatoriamente\n");
        //numero de filas
        for (int i = 0; i < numeroFilas; i++) {

            //numero de columnas
            for (int j = 0; j < numeroColumnas; j++) {

                System.out.print((" " + matriz[i][j]) + " ");

            }
            System.out.println("");

        }
    }

    public void traspuesta() {

        int tmp;

        for (int i = 0; i < numeroFilas; i++) {

            //numero de columnas
            for (int j = 0; j < i; j++) {
                tmp = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = tmp;

            }
            System.out.println("");

        }

        System.out.println("Matriz traspuesta\n");

        for (int i = 0; i < numeroFilas; i++) {

            //numero de columnas
            for (int j = 0; j < numeroColumnas; j++) {

                System.out.print((" " + matriz[i][j]) + " ");

            }
            System.out.println("");

        }

    }

}