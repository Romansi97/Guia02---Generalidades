/*
CLASE: RECTANGULO
 */
package Rectangulo;

import java.util.Scanner;

public class Rectangulo {
    
    Scanner leer = new Scanner(System.in);
    
    public double lado1;
    public double lado2;

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    //Método "calcular_area" que calcule y devuelva el área del rectángulo
    
    public double CalcularArea(){
        
        System.out.println("Ingrese un lado: ");
        this.lado1= leer.nextDouble();
        
        System.out.println("Ingrese el otro lado: ");
        this.lado2 = leer.nextDouble();
        
        double area = this.lado1 * this.lado2;
    
        return area;
    }

}