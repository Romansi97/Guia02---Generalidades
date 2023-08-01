/*
2)Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
package guia04_ej2;

import java.util.Scanner;

public class Guia04_Ej2 {

    public static void main(String[] args) {
        String nombre;
        int edad = 0, cont = 0, opc = 0;
        boolean retorno;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese el nombre: ");
            nombre = leer.nextLine();
            leer.nextLine();
            System.out.println("Ingrese la edad: ");
            edad = leer.nextInt();
            System.out.println(nombre + " es mayor de edad? " + MayorMenor(edad));
            System.out.println("Desea ingresar otra persona?: [1] Si / [2] No.");
            opc = leer.nextInt();
            if (opc == 1) {
                cont = 0;
            } else {
                cont = 1;
            }
        } while (cont == 0);
        System.out.println("Hasta luego!");
    }

    public static boolean MayorMenor(int edad) {
        boolean resultado = false;
        if (edad >= 18) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

}
