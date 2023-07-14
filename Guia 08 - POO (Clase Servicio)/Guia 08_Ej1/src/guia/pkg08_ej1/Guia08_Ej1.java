/*
1. Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario y los muestre en el main.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta
 */
package guia.pkg08_ej1;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaService;
import java.util.Scanner;

public class Guia08_Ej1 {

    public static void main(String[] args) {
        CuentaBancariaService cbs = new CuentaBancariaService();
        CuentaBancaria a = null;
        int opcion;
        System.out.println("Menú\n"
                + "1_ Crear cuenta.\n"
                + "2_ Ingresar dinero.\n"
                + "3_ Retirar dinero.\n"
                + "4_ Extracción Rápida.\n"
                + "5_ Consultar saldo.\n"
                + "6_ Consultar datos.");
        do {
            System.out.println("Elija la opción deseada o presione 9 para finalizar. ");
            Scanner leer = new Scanner(System.in);
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    a = cbs.CrearCuenta();
                    break;
                case 2:
                    a.setSaldoActual(cbs.Ingresar(a));
                    break;
                case 3:
                    a.setSaldoActual(cbs.Retirar(a));
                    break;
                case 4:
                    cbs.ExtraccionRapida(a);
                    break;
                case 5:
                    cbs.ConsultarSaldo(a);
                    break;
                case 6:
                    cbs.ConsultarDatos(a);
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion <= 6);
    }
}
