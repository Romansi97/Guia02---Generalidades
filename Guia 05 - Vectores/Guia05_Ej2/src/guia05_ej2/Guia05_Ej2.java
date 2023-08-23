/*
2. Realizar un algoritmo que llene un vector de tamaño 15 con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido.
 */
package guia05_ej2;

import static java.lang.Math.random;
import java.util.Scanner;

public class Guia05_Ej2 {

    public static void main(String[] args) {
                int contPosicion = 0, contRepetido =0;
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[15];
        
        System.out.println("Ingrese el número a buscar: ");
        int num = leer.nextInt();
               
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10) + 1;
            System.out.print("["+vector[i]+"]");
            if (num == vector[i]) {
                contRepetido ++;
                System.out.println(vector[i]);
                }
        }
        System.out.println(contRepetido);
   
            
        }
        
    
    
    
    }
    

