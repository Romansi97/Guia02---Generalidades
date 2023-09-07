/*
a) Método getDiscriminante(): devuelve el valor del discriminante
(double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
soluciones, para que esto ocurra, el discriminante debe ser mayor o
igual que 0.
c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
única solución, para que esto ocurra, el discriminante debe ser igual
que 0.
d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true,
imprime las 2 posibles soluciones.
e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
una única raíz. Es en el caso en que se tenga una única solución
posible.
f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra
ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
que devuelvan nuestros métodos y en caso de no existir solución, se
mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía
el signo delante de -b
 */
package Service;

import Entity.Raices;

public class RaicesService {

    Raices raices = new Raices();

    /*
    a) Método getDiscriminante(): devuelve el valor del discriminante
(double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
     */
    public double getDiscriminante(double a, double b, double c) {
        double discriminante = (b * b) - 4 * a * c;
        return discriminante;
    }

    /*b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
soluciones, para que esto ocurra, el discriminante debe ser mayor o
igual que 0.*/
    public boolean tieneRaices(double discriminante) {
        if (discriminante >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /*c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
única solución, para que esto ocurra, el discriminante debe ser igual
que 0.*/
    public boolean tieneRaiz(double discriminante) {
        if (discriminante == 0) {
            return true;
        } else {
            return false;
        }
    }

    /*
    d) Método obtenerRaices(): llama a tieneRaices() y si devolvió́true,
imprime las 2 posibles soluciones.
     */
    public void obtenerRaices(double discriminante) {
        if (tieneRaices(discriminante) == true) {
            
        }
        ;
    }

    /*
    Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
una única raíz. Es en el caso en que se tenga una única solución
posible.
    */
    public void obtenerRaiz(double discriminante){
        System.out.println(tieneRaiz(discriminante));
    }
}
