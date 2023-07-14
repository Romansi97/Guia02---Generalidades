package Entidad;
/*
1. Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters.
 */

public class CuentaBancaria {
    
    public int NumeroCuenta;
    public long DNICliente;
    public double SaldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int NumeroCuenta, long DNICliente, double SaldoActual) {
        this.NumeroCuenta = NumeroCuenta;
        this.DNICliente = DNICliente;
        this.SaldoActual = SaldoActual;
    }

    public CuentaBancaria(int NumeroCuenta, long DNICliente) {
        this.NumeroCuenta = NumeroCuenta;
        this.DNICliente = DNICliente;
    }

    public CuentaBancaria(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public long getDNICliente() {
        return DNICliente;
    }

    public void setDNICliente(long DNICliente) {
        this.DNICliente = DNICliente;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "NumeroCuenta=" + NumeroCuenta + ", DNICliente=" + DNICliente + ", SaldoActual=" + SaldoActual + '}';
    }

}
