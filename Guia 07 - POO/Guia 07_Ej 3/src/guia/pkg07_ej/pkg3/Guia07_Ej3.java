/*
3. Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes
métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.
f) Método restar(): calcular la resta de los números y devolver el
resultado al main
g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.
 */
package guia.pkg07_ej.pkg3;

import Entidad.Operacion;

public class Guia07_Ej3 {

    public static void main(String[] args) {

        Operacion op1 = new Operacion(); //Llamamos a la clase operacion
        op1.CrearOperacion(0, 0);
        System.out.println("La suma de los número es: " + op1.Sumar(op1.getNumero1(), op1.getNumero2()));
        System.out.println("La resta de los números es: " + op1.Restar(op1.getNumero1(), op1.getNumero2()));
        System.out.println("La multiplicación de los números es: " + op1.Multiplicar(op1.getNumero1(), op1.getNumero2()));
        System.out.println("El resultado de la división es: " + op1.Division(op1.getNumero1(), op1.getNumero2()));
    }

}
