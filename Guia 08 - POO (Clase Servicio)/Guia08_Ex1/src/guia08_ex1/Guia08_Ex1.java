/*
1_ Vamos a realizar una clase llamada Raices, donde representaremos los
valores de una ecuación de 2º grado. Tendremos los 3 coeficientes
como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores
para construir el objeto a través de un método constructor. Luego, en
RaicesServicio las operaciones que se podrán realizar son las siguientes:
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
package guia08_ex1;

import Entity.Raices;
import Service.RaicesService;

public class Guia08_Ex1 {

    public static void main(String[] args) {

        RaicesService raicesservice1 = new RaicesService();
        Raices raices1 = new Raices();

       System.out.println("Valor del discriminante: "+raicesservice1.getDiscriminante(raices1.a, raices1.b, raices1.c));
       
       double discriminante = raicesservice1.getDiscriminante(raices1.a , raices1.b, raices1.c);
       System.out.println("Posee dos soluciones? "+raicesservice1.tieneRaices(discriminante));
       System.out.println("Posee una raíz? "+raicesservice1.tieneRaiz(discriminante));  

       raicesservice1.obtenerRaices(discriminante);
       raicesservice1.obtenerRaiz(discriminante);
    }

}
