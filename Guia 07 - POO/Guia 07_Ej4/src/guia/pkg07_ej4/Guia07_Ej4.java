/*
4. Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
 */
package guia.pkg07_ej4;

import Entidad.Rectangulo;

public class Guia07_Ej4 {

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo();
        r1.CrearRectangulo(0, 0);
        System.out.println("La Superficie es: " + r1.Superficie(r1.getBase(), r1.getAltura()));
        System.out.println("El perimetro es: " + r1.Perimetro(r1.getBase(), r1.getAltura()));
        r1.Dibujo(r1.getAltura(), r1.getBase());
    }
}
