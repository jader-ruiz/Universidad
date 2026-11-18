package edu.universidad.programacionintermedia.poo.modificadoresacceso.cliente;
import edu.universidad.programacionintermedia.poo.modificadoresacceso.banco.Cuenta;

public class CuentaVIP extends Cuenta {
    private double limiteCredito;

    public CuentaVIP(String titular, double saldo, double limite) {
        super(titular, saldo, "VIP", "VIP-001");
        this.limiteCredito = limite;
    }

    public void mostrarInfoVIP() {
        // private titular → NO accesible (otro paquete, no importa que sea subclase)
        // System.out.println(titular); ← ERROR

        // friendly saldo → NO accesible (otro paquete)
        // System.out.println(saldo); ← ERROR

        // protected tipo → SÍ accesible (subclase)
        System.out.println("Tipo: " + tipo);

        // public numeroCuenta → SÍ accesible (todos)
        System.out.println("Numero: " + numeroCuenta);

        // Getter para acceder al private:
        System.out.println("Titular: " + getTitular());

        System.out.println("Limite de credito: " + limiteCredito);
    }
}