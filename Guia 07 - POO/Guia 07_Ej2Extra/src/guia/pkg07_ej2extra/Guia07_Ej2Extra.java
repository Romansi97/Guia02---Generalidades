/*
2. Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:

http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

 */
package guia.pkg07_ej2extra;

import Puntos.Puntos;

public class Guia07_Ej2Extra {

    public static void main(String[] args) {
       
        Puntos p1 = new Puntos();
        
        p1.CrearPuntos(0, 0, 0, 0);
        
        System.out.println("La distancia entre ambos puntos es: "+p1.Distancia(p1.getX1(), p1.getY1(), p1.getX2(), p1.getY2()));
    
    }
    
}
