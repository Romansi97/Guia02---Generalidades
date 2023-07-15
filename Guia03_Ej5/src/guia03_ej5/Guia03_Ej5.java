/*
5. Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package guia03_ej5;

import java.util.Scanner;

public class Guia03_Ej5 {

    public static void main(String[] args) {
        int num, resultado = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un entero positivo: ");
        resultado = leer.nextInt();
        do {
            System.out.println("Ingrese otro número entero: ");
            num = leer.nextInt();
            resultado += num;
            
        } while (resultado <= num);
        
        
    }
    
}
