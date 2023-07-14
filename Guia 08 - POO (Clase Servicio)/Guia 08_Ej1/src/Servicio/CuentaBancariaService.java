/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
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
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaService{

    public CuentaBancariaService() {
    }

    Scanner leer = new Scanner(System.in);

    /*a) Método para crear cuenta pidiéndole los datos al usuario.
        public int NumeroCuenta;
         public long DNICliente;
            public double SaldoActual;
     */
    public CuentaBancaria CrearCuenta() {

        System.out.println("Ingrese el Número de cuenta: ");
        int nc = leer.nextInt();
        System.out.println("Ingrese el DNI del cliente: ");
        long dni = leer.nextLong();
        System.out.println("Ingrese el saldo: ");
        double saldo = leer.nextDouble();

        CuentaBancaria cb = new CuentaBancaria(nc, dni, saldo);

        return cb;
    }

    /*b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.*/
    public double Ingresar(CuentaBancaria cuenta) {
        System.out.println("Ingrese la cantidad de dinero a depositar: ");
        double dinero = leer.nextDouble();
        double resultado = cuenta.getSaldoActual() + dinero;
        return resultado;
    }
    
    /*c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.*/
    public double Retirar(CuentaBancaria cuenta) {
        double resultado = 0;
        System.out.println("Ingrese la cantidad de dinero a retirar: ");
        double dinero = leer.nextDouble();
        if (dinero > cuenta.getSaldoActual()) {
            System.out.println("Su cuenta no dispone de esa cantidad, se retirará la totalidad de: $"+cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
            resultado = 0;
        } else {
            resultado = cuenta.getSaldoActual() - dinero;
        }
        System.out.println("Su saldo actual es: " + resultado);
        return resultado;
    }

    /*d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%¨*/
    public void ExtraccionRapida(CuentaBancaria cuenta) {
        System.out.println("Retirará un 20% de su saldo en cuenta.");
        double extraccion = cuenta.getSaldoActual() * 0.2;
        cuenta.setSaldoActual(extraccion);
        System.out.println("Retiró $" + extraccion);
    }

    /*e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.*/
    public void ConsultarSaldo(CuentaBancaria cuenta){
        System.out.println("Su saldo es: "+cuenta.getSaldoActual());
    }
    
    /*f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta*/
    public void ConsultarDatos(CuentaBancaria cuenta){
        System.out.println("DNI: "+cuenta.getDNICliente()+"\n"
                + "N°Cuenta: "+cuenta.getNumeroCuenta()+"\n"
        + "Saldo: "+cuenta.getSaldoActual());    
    }
}
