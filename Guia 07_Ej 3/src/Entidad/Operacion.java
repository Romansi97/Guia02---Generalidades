/*
CLASE: OPERACION
 */
package Entidad;

import java.util.Scanner;

public class Operacion {

    Scanner leer = new Scanner(System.in);
    private double numero1; //Creamos atributos privados
    private double numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() { //GET
        return numero2;
    }

    public void setNumero2(double numero2) { //SET
        this.numero2 = numero2;
    }

    /*d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.*/
    public void CrearOperacion(double numero1, double numero2) { //Metodo 1
        System.out.println("Ingrese el primer valor: ");
        this.numero1 = leer.nextDouble();
        System.out.println("Ingrese el segundo valor: ");
        this.numero2 = leer.nextDouble();
    }

    /*e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.*/
    public double Sumar(double numero1, double numero2) {
        double suma = numero1 + numero2;
        return suma;
    }

    /*f) Método restar(): calcular la resta de los números y devolver el
resultado al main*/
    public double Restar(double numero1, double numero2) {
        double resta = numero1 - numero2;
        return resta;
    }

    /*g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main*/
    public double Multiplicar(double numero1, double numero2) {
        double Multi;
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("La cuenta es errónea");
            return Multi = 0;
        } else {
            Multi = numero1 * numero2;
            return Multi;
        }
    }

    /*h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.*/
    public double Division(double numero1, double numero2) {
        double Divi;
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("La cuenta es errónea");
            return Divi = 0;
        } else {
            Divi = numero1 / numero2;
            return Divi;
        }
    }
}
