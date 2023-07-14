/*
CLASE: EMPLEADO
 */
package Empleado;

import java.util.Scanner;

public class Empleado {
    
    Scanner leer = new Scanner(System.in);
    
    //atributos como "nombre", "edad" y "salario".
    
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
//Método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual.
//El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
    
    public void CalcularAumento(){
    
        System.out.println("Ingrese el nombre del empleado: ");
        this.nombre = leer.nextLine();
    
        System.out.println("Ingrese la edad de "+this.nombre);
        this.edad = leer.nextInt();
        
        System.out.println("Ingrese el salario actual de "+this.nombre);
        this.salario = leer.nextDouble();
        
        if (this.edad > 30) {
            
            this.salario = this.salario * 1.1;
            
        }else {
        
            this.salario = this.salario * 1.05;
        
        }
    
        System.out.println("El salario actual es: "+this.salario);
    
    }
    
    
    
    
}
