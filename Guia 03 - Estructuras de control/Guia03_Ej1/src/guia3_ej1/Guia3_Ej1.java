/*
1. Crear un programa que dado un número determine si es par o impar
 */
package guia3_ej1;

import java.util.Scanner;

public class Guia3_Ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número ingresado es par.");
        } else {
            System.out.println("El número ingresado es impar.");
        }
    }
}
