/*
1. Realizar una clase llamada Persona en el paquete de entidades que
tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’
para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro
atributo, puede hacerlo. Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3
métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje
3
c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
● Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
● Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.
 */
package guia.pkg08_ej3;

import Entidad.Persona;
import Servicio.PersonaServicio;

public class Guia08_Ej3 {

    public static void main(String[] args) {
        PersonaServicio ps1 = new PersonaServicio();
        Persona p1 = ps1.CrearPersona();
        Persona p2 = ps1.CrearPersona();
        Persona p3 = ps1.CrearPersona();
        Persona p4 = ps1.CrearPersona();
//        Otra forma de crear persona
//        Persona p1 = new Persona("Yasar", 29, "H", 114, 1.79, 0);
//        Persona p2 = new Persona("Victoria", 31, "M", 80, 1.69, 0);
//        Persona p3 = new Persona("Enzo", 17, "H", 75, 1.83, 0);
//        Persona p4 = new Persona("Eric", 25, "H", 50, 1.75, 0);
        double[] IMC = new double[4];
        IMC[0] = ps1.calcularIMC(p1);
        IMC[1] = ps1.calcularIMC(p2);
        IMC[2] = ps1.calcularIMC(p3);
        IMC[3] = ps1.calcularIMC(p4);
        int contBajoPeso = 0;
        int contEnPeso = 0;
        int contSobrePeso = 0;
        for (int i = 0; i < 4; i++) {
            if (IMC[i] == -1) {
                contBajoPeso += 1;
            }
            if (IMC[i] == 0) {
                contEnPeso += 1;
            }
            if (IMC[i] == 1) {
                contSobrePeso += 1;
            }
        }
        System.out.println("Los valores de IMC dieron: \n"
                + "Bajo peso: " + contBajoPeso + "\n"
                + "En peso: " + contEnPeso + "\n"
                + "Sobrepeso: " + contSobrePeso);
        int contMayor = 0, contMenor = 0;
        boolean[] Edad = new boolean[4];
        Edad[0] = ps1.esMayorDeEdad(p1);
        Edad[1] = ps1.esMayorDeEdad(p2);
        Edad[2] = ps1.esMayorDeEdad(p3);
        Edad[3] = ps1.esMayorDeEdad(p4);
        for (int i = 0; i < 4; i++) {
            if (Edad[i] == true) {
                contMayor += 1;
            } else {
                contMenor += 1;
            }
        }
        System.out.println("Mayores de edad: " + contMayor + ". Menores de edad: " + contMenor);
    }
}
