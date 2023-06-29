/*
3. Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */

package com.mycompany.guia02_ej3;

import java.util.Scanner;

public class Guia02_Ej3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        System.out.print("Minúscula: ");
        System.out.println(frase.toLowerCase());
        System.out.print("Mayuscula: ");
        System.out.println(frase.toUpperCase());
    }
}
