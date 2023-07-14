/*
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada
 */
package Service;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    public CafeteraServicio() {
    }
    
    Scanner leer = new Scanner(System.in);
    Cafetera cafe = new Cafetera();
            
    /*Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.*/
    public void llenarCafetera(Cafetera cafe) {
        System.out.println("La cafetera posee: "+cafe.getCantidadActual());
        int actual = cafe.getCantidadActual();
        int resultado = cafe.getCapacidadMaxima() - actual;
        cafe.setCantidadActual(1000);
    }
    
    /*Método servirTaza(int): se pide el tamaño de una taza vacía, el
    método recibe el tamaño de la taza y simula la acción de servir la
    taza con la capacidad indicada. Si la cantidad actual de café “no
    alcanza” para llenar la taza, se sirve lo que quede. El método le
    informará al usuario si se llenó o no la taza, y de no haberse llenado
    en cuanto quedó la taza.
    */
    public void servirTaza(Cafetera cafe) {
        System.out.println("Ingrese el tamaño de la taza a servir: ");
        int taza = leer.nextInt();
        if (taza >= cafe.getCantidadActual()) {
            System.out.println("La taza no llegó a llenarse completamente. Se servió la cantidad de: " + cafe.getCantidadActual()+ " ml.");
            cafe.setCantidadActual(0);
        } else {
            cafe.setCantidadActual(cafe.getCantidadActual() - taza);
            System.out.println("La taza fue llenada completamente.");
        }
    }
    
    /**
     * Método vaciarCafetera(): pone la cantidad de café actual en cero.
     */
    public void vaciarCafetera(Cafetera cafe) {
        cafe.setCantidadActual(0);
     }
    
    /**
     * Método agregarCafe(int): se le pide al usuario una cantidad de café,
    el método lo recibe y se añade a la cafetera la cantidad de café
    indicada
     */
    public void agregarCafe(Cafetera cafetera){
        System.out.println("Ingrese la cantidad de café a agregar: ");
        int cafe = leer.nextInt();
        int restante = cafetera.getCapacidadMaxima() - cafetera.getCantidadActual();
        if (cafe <= restante) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cafe);
        }else{
            System.out.println("La cantidad ingresada excede la capacidad de la cafetera.");
        }
    }
}
