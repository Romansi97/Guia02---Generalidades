/*
CLASE JUEGO
 */
package Juego;

import java.util.Scanner;

public class Juego {
    
    Scanner leer1 = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);
    
    public int jugador1;
    public int jugador2;

    public Juego() {
    }

    public Juego(int jugador1, int jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public int getJugador1() {
        return jugador1;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }
    
    public void IniciarJuego(int jugador1, int jugador2){
        
        int cont=3;
        
        System.out.println("Jugador 1. Ingrese un número: ");
        this.jugador1 = leer1.nextInt();
    
        do {
            
        System.out.println("Jugador 2. Tiene " +cont+"  intentos para descubrir el número");
        System.out.println("Ingrese el número");
        this.jugador2 = leer2.nextInt();
            
            if (this.jugador1 > this.jugador2) {
                
                System.out.println("Ingrese un número más alto");
                
            }
            if(this.jugador1 < this.jugador2){
            
                System.out.println("Ingrese un número más bajo");
            
            }
            
            if (this.jugador1 == this.jugador2) {
                
                System.out.println("El número ingresado es correcto!");
                break;
            }
            
            cont --;
            
        } while (cont > 0);
        
    }

}