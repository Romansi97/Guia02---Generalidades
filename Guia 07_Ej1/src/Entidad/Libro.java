/*
CLASE: LIBRO
 */
package Entidad;

import java.util.Scanner;

public class Libro {
    
    Scanner leer = new Scanner(System.in);
    
    //ATRIBUTOS: ISBN, Título, Autor, Número de páginas.
   
    public int ISBN;
    public String titulo;
    public String autor;
    public int pag;

    //Constructor con todos los atributos pasados por parámetro.
    
    public Libro(int ISBN, String titulo, String autor, int pag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.pag = pag;
    }
    
    //Constructor vacío.
    public Libro() {
    }
    
    public void setTodos(int ISBN, String titulo, String autor, int pag){ //Metodo 1
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.pag = pag;
    }
    
    
    public void CargarLibro(){
        System.out.println("Ingrese el ISBN: ");
        this.ISBN = leer.nextInt();
        System.out.println("Ingrese el titulo: ");
        this.titulo = leer.next();
        System.out.println("Ingrese el autor: ");
        this.autor = leer.next();
        System.out.println("Ingrese la cantidad de páginas: ");
        this.pag = leer.nextInt();
        }
    
    
    
    //Muestro todos los datos en pantalla predeterminado. Con ALT + INS + toString
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", pag=" + pag + '}';
    }
}
