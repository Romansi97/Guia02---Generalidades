/*
1. Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package guia05_ej1;

public class Guia05_Ej1 {

    public static void main(String[] args) {

        int[] vector = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;
        }
        for (int j = 99; j >= 0; j--) {
            System.out.print("[" + vector[j] + "]");
        }
    }
}
