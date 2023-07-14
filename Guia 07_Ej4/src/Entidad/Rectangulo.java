/*
CLASE: RECTANGULO
 */
package Entidad;

import java.util.Scanner;

public class Rectangulo {

    Scanner leer = new Scanner(System.in);

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /*Método para crear el rectángulo con los datos del Rectángulo dados por
el usuario.*/
    public void CrearRectangulo(double base, double altura) {
        System.out.println("Ingrese la base del rectangulo: ");
        this.base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        this.altura = leer.nextDouble();
    }

    /*Método para calcular la superficie del
rectángulo* --> Superficie = base * altura / Perímetro = (base + altura) * 2*/
    public double Superficie(double base, double altura) {
        double Super = base * altura;
        return Super;
    }

    /*Método para calcular el perímetro del rectángulo.*/
    public double Perimetro(double base, double altura) {
        double Peri = (base + altura) * 2;
        return Peri;
    }

    /*método que dibujará el rectángulo mediante
asteriscos usando la base y la altura*/
    public void Dibujo(double base, double altura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
                System.out.print("");
            }
            System.out.println("");
        }
    }

}
