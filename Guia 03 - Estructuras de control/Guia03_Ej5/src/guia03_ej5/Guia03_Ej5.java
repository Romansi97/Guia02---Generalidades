/*
5. Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuacion solicite numeros al usuario hasta que la suma de los
números introducidos supere el limite inicial.
 */
package guia03_ej5;

import java.util.Scanner;

public class Guia03_Ej5 {

    public static void main(String[] args) {
        int num, num2, resultado = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un entero positivo: ");
        num = leer.nextInt();
        do {
            System.out.println("Ingrese otro número entero: ");
            num2 = leer.nextInt();
            resultado += num2;
        } while (num > resultado);
    }
}
