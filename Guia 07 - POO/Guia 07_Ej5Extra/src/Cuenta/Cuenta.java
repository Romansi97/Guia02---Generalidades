/*
CLASE: CUENTA
 */
package Cuenta;

import java.util.Scanner;

public class Cuenta {

    Scanner leer = new Scanner(System.in);
    
    private double saldo = 10000;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void RetirarDinero(){
        int elegir;
        double retiro;  
        
        System.out.println("Ingrese el nombre de titular: ");
        this.titular = leer.nextLine();
        
        System.out.println("Bienvenido "+this.titular);
        
        do {
          
        System.out.println("Posee $ "+this.saldo+ ". Cuanto dinero quiere retirar?");
        retiro = leer.nextDouble();    
            
        if (retiro > this.saldo) {
            
            System.out.println("Usted no posee esa cantidad de dinero");
            
        }else{
        
            this.saldo -= retiro;
        
        }
        retiro=0;
        
            System.out.println("Saldo restante: "+saldo);
        
        System.out.println("Desea retirar más dinero? Presione cualquier tecla para salir o 1 para continuar");
        elegir = leer.nextInt();
        
        
        } while (elegir == 1);
        

    
        
    
    
    }





    
}
