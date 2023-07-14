/*
4. Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */

package com.mycompany.guia02_ej4;

import java.util.Scanner;

public class Guia02_Ej4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados a consultar: ");
        double grados = leer.nextDouble();
        double F = 32 + (9 * grados / 5);
        System.out.println(grados+" C° equivalen a : "+F+" °F");
    }
}
