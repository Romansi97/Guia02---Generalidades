/*
1. Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */

package com.mycompany.guia02_ej1;

import java.util.Scanner;

public class Guia02_Ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer entero: ");
        int num1 = leer.nextInt();  //Pido el primer entero
        System.out.println("Ingrese el segundo entero: ");
        int num2 = leer.nextInt(); //Pido el segundo entero      
        int suma = num1 + num2; //Sumo ambos enteros
        System.out.println("La suma de ambos enteros es: "+suma);
    }
}
