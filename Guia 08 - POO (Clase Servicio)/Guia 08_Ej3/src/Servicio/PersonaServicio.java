/*
En el paquete Servicios crear PersonaServicio con los siguientes 3
métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje.
c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicio extends Persona {

    Scanner leer = new Scanner(System.in);

    public boolean esMayorDeEdad(Persona persona) {
        boolean Mayor = false;
        if (persona.getEdad() >= 18) {
            Mayor = true;
        }
        return Mayor;
    }

    /*
    b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje.
     */
    public Persona CrearPersona() {
        Persona persona = new Persona();
        char eleccion;
        System.out.println("Ingrese el nombre de la persona: ");
        persona.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad: ");
        persona.setEdad(leer.nextInt());
        do {
            System.out.println("Ingrese el sexo (H, M, O): ");
            eleccion = leer.next().toUpperCase().charAt(0);
            if (eleccion == 'H') {
                persona.setSexo("H");
                break;
            }
            if (eleccion == 'M') {
                persona.setSexo("M");
                break;
            }
            if (eleccion == 'O') {
                persona.setSexo("O");
                break;
            } else {
                System.out.println("El sexo ingresado es incorrecto");
            }
        } while (eleccion == 'H' || eleccion == 'M' || eleccion == 'O');
        System.out.println("Ingrese el peso: ");
        persona.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura: ");
        persona.setAltura(leer.nextDouble());
        return persona;
    }

/*c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.*/
    public double calcularIMC(Persona persona) {
        int result = 2;
        double IMC = persona.getPeso() / (persona.getAltura() * persona.getAltura());  //(peso en kg/(altura^2 en mt2)
        if (IMC < 20) {
            result = -1;
            System.out.println("La persona está por debajo de su peso");
        }else if (IMC >= 20 && IMC <= 25) {
            result = 0;
            System.out.println("La persona está en su peso ideal");
        }else if (IMC > 25){
            result = 1;
            System.out.println("La persona tiene sobrepeso");
        }
        
        return result;
    }
}
