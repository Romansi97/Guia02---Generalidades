/*
2. Programa Nespresso. Desarrolle una clase Cafetera en el paquete
Entidades con los atributos capacidadMáxima (la cantidad máxima de
café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Agregar constructor vacío y con
parámetros así como setters y getters. Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
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
package guia.pkg08_ej2_nespresso;

import Entidades.Cafetera;
import Service.CafeteraServicio;
import java.util.Scanner;

public class Guia08_Ej2_Nespresso {

    public static void main(String[] args) {

        CafeteraServicio cs = new CafeteraServicio();
        Cafetera cafe = new Cafetera();
        Scanner leer = new Scanner(System.in);

        int choose;
        do {
            System.out.println("Ingrese la opción deseada: \n"
                    + "1- Llenar cafetera. \n"
                    + "2- Servir en taza. \n"
                    + "3- Vaciar cafetera. \n"
                    + "4- Agregar café. \n"
                    + "5- Mostrar cafetera.");
            choose = leer.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Eligió el llenado de la cafetera");
                    cs.llenarCafetera(cafe);
                    break;
                case 2:
                    System.out.println("Eligió servir taza");
                    cs.servirTaza(cafe);
                    break;
                case 3:
                    System.out.println("Eligió vaciar cafetera");
                    cs.vaciarCafetera(cafe);
                    break;
                case 4:
                    System.out.println("Eligió agregar café");
                    cs.agregarCafe(cafe);
                    break;
                case 5:
                    System.out.println(cafe);
                     break;                    
                default:
                    System.out.println("Opción incorrecta. Finalizando...");
            }
        } while (choose <= 6);
    }
}
