/*
7. Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
 */
package guia.pkg07_ej7extra;

import Rectangulo.Rectangulo;

public class Guia07_Ej7Extra {

    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo(); //Objeto
                
        System.out.println("El area del rectangulo es: "+r1.CalcularArea()); //Traigo el valor que retorna el metodo
        
        Rectangulo Rectangulo1 = new Rectangulo(); //Cree objeto Rectangulo1 de la clase Rectangulo
   
        Rectangulo1.lado1 = 4; //Le di los valores pedidos
        Rectangulo1.lado2 = 6;
        
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < Rectangulo1.lado2; i++) { //Dibujo el rectangulo en pantalla
            for (int j = 0; j < Rectangulo1.lado1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
    
}
