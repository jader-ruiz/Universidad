package edu.universidad.programacionintermedia.poo.modificadoresacceso.cliente;
import edu.universidad.programacionintermedia.poo.modificadoresacceso.banco.*;

public class App {
    public static void main(String[] args) {

        Cuenta c = new Cuenta("Ana Torres", 500000, "Ahorros", "AH-001");

        // private → ERROR:
        // System.out.println(c.titular);

        // friendly → ERROR (paquete diferente):
        // System.out.println(c.saldo);

        // protected → ERROR (no es subclase):
        // System.out.println(c.tipo);

        // public → OK:
        System.out.println(c.numeroCuenta);

        // Getters (public) → OK para todo:
        System.out.println(c.getTitular());
        System.out.println(c.getSaldo());

        c.depositar(100000);
        c.mostrarInfo();

        System.out.println("---");

        // CuentaVIP hereda de Cuenta y accede a protected
        CuentaVIP vip = new CuentaVIP("Carlos Rios", 2000000, 500000);
        vip.mostrarInfoVIP();

        System.out.println("---");

        // Banco está en el mismo paquete que Cuenta
        Banco banco = new Banco();
        banco.operar(c);
    }
}