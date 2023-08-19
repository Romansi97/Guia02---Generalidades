/*3. Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */
package guia04_ej3;

import java.util.Scanner;

public class Guia04_Ej3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a cambiar.");
        int valor = leer.nextInt();
        System.out.println("Ingrese el tipo de cambio\n"
                + "A_ Libras.\n"
                + "B_ Dolares. \n"
                + "C_ Yenes");
        leer.nextLine();
        String moneda = leer.nextLine().toUpperCase();
        cambio(moneda, valor);
    }

    public static void cambio(String moneda, int valor) {
        switch (moneda) {
            case "A":
                System.out.println("Sus " + valor + " euros equivalen a " + valor * 0.86 + " libras.");
                break;
            case "B":
                System.out.println("Sus " + valor + " euros equivalen a " + valor * 1.28611 + " dólares.");
                break;
            case "C":
                System.out.println("Sus " + valor + " euros equivalen a " + valor * 129.852 + " yenes.");
                break;
            default:
                System.out.println("La opción ingresada es incorrecta.");
        }

    }

}