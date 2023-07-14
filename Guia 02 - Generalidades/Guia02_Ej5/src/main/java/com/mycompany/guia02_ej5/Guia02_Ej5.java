/*
5. Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
 */

package com.mycompany.guia02_ej5;

import java.util.Scanner;

public class Guia02_Ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int num1 = leer.nextInt();
        int doble = num1 * 2;
        System.out.println("El doble de "+num1+" es: "+doble);
        int triple = num1 * 3;
        System.out.println("El triple de "+num1+" es: "+triple);
        double raiz = Math.sqrt(num1);
        System.out.println("La raiz cuadrada de "+num1+" es "+raiz);
    }
}
