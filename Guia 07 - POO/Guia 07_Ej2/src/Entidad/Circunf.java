/*
CLASE: CIRCUNFERENCIA
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
 */
package Entidad;

import java.util.Scanner;

public class Circunf {

    private Double radio;

    public Circunf() {
    }

    public Circunf(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunf{" + "radio=" + radio + '}';
    }

    /*c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.*/
    public void CrearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        this.radio = leer.nextDouble();
    }

    /*d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).*/
    public double Area() {
        double Area = Math.PI * this.radio * this.radio;
        return Area;
    }

    /*e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).*/
    public double Perimetro() {
        double Perimetro = 2 * Math.PI * this.radio;
        return Perimetro;
    }

}
