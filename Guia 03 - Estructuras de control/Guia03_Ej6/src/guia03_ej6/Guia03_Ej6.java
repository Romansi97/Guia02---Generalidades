/*
6. Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
 */
package guia03_ej6;

import java.util.Scanner;

public class Guia03_Ej6 {

    public static void main(String[] args) {
        int resultado;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número entero: ");
        int num2 = leer.nextInt();
        System.out.println("Elija entre las siguientes opciones: \n"
                + "1. Sumar. \n"
                + "2. Restar. \n"
                + "3. Multiplicar. \n"
                + "4. Dividir. \n"
                + "5. Salir.");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("El resutado de la suma es: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("El resutado de la resta es: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("El resutado de la multiplicación es: " + resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("El resutado de la división es: " + resultado);
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("La opción ingresada es errónea. Saliendo...");
        }
    }
}
