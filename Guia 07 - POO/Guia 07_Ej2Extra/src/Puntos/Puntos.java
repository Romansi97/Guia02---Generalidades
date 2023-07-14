/*
CLASE: PUNTOS
 */
package Puntos;

import java.util.Scanner;

public class Puntos {
    
    Scanner leer = new Scanner(System.in);
    
    //sus atributos serán, x1, y1, x2, y2
    
    public double x1;
    public double y1;
    public double x2;
    public double y2;

    public Puntos() {
    }

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    //Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los atributos del objeto.
    
    public void CrearPuntos(double x1, double y1, double x2, double y2){
        
        System.out.println("Ingrese la primer coordenada x: ");
        this.x1 = leer.nextDouble();
        System.out.println("Ingrese la primer coordenada y: ");
        this.y1 = leer.nextDouble();
        
        System.out.println("Ingrese la segunda coordenada x: ");
        this.x2 = leer.nextDouble();
        System.out.println("Ingrese la segunda coordenada y: ");
        this.y2 = leer.nextDouble();        
        
    }

    //Después, a través de otro método calcular y devolver la distancia que
    //existe entre los dos puntos que existen en la clase Puntos.
    
    public double Distancia (double x1, double y1, double x2, double y2){
        
        double dis = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        return dis;
    
    }
    
}
