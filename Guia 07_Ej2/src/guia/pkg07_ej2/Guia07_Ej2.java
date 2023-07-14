/*
2. Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
 */
package guia.pkg07_ej2;

import Entidad.Circunf;

public class Guia07_Ej2 {

    public static void main(String[] args) {

        Circunf c1 = new Circunf(); //Traigo la clase al main
        c1.CrearCircunferencia();
        System.out.println("El radio es: " + c1.getRadio());
        System.out.println("El Area es: " + c1.Area());
        System.out.println("El Perimetro es: " + c1.Perimetro());
    }

}
