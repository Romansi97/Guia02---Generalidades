/*
1_ Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
package guia04_ej1;

import java.util.Scanner;

public class Guia04_Ej1 {

    public static void main(String[] args) {
        double retorno = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        double num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double num2 = leer.nextDouble();
        System.out.println("Ingrese la opción deseada: \n"
                + "[1] Sumar ambos números.\n"
                + "[2] Restar ambos números.\n"
                + "[3] Multiplicar ambos números.\n"
                + "[4] Dividir ambos números.");
        int opc = leer.nextInt();
        switch (opc) {
            case 1:
                retorno = sumar(num1, num2);
                System.out.println("El resultado de la operación es: "+retorno);
                break;
            case 2:
                retorno = restar(num1, num2);
                System.out.println("El resultado de la operación es: "+retorno);
                break;
            case 3:
                retorno = multiplicar(num1, num2);
                System.out.println("El resultado de la operación es: "+retorno);
                break;
            case 4:
                retorno = dividir(num1, num2);
                System.out.println("El resultado de la operación es: "+retorno);
                break;
            default:
                System.out.println("La opción ingresada es incorrecta. Hasta luego!");
                break;
        }
    }

    public static double sumar(double num1, double num2) {
        double resultado = num1 + num2;
        return resultado;
    }

    public static double restar(double num1, double num2) {
        double resultado = num1 - num2;
        return resultado;
    }

    public static double multiplicar(double num1, double num2) {
        double resultado = num1 * num2;
        return resultado;
    }

    public static double dividir(double num1, double num2) {
        double resultado = num1 / num2;
        return resultado;
    }
}
