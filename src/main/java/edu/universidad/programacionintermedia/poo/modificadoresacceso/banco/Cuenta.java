package edu.universidad.programacionintermedia.poo.modificadoresacceso.banco;

public class Cuenta {

    private   String titular;    // solo Cuenta
    double    saldo;             // friendly: banco y Cuenta
    protected String tipo;       // banco, Cuenta y subclases
    public    String numeroCuenta; // todos

    public Cuenta(String titular, double saldo, String tipo, String numero) {
        this.titular      = titular;
        this.saldo        = saldo;
        this.tipo         = tipo;
        this.numeroCuenta = numero;
    }

    // Getter para acceder al atributo private desde fuera
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito de " + monto + " realizado.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Titular: " + titular);        // private: OK (estamos dentro)
        System.out.println("Saldo: " + saldo);            // friendly: OK
        System.out.println("Tipo: " + tipo);              // protected: OK
        System.out.println("Numero: " + numeroCuenta);    // public: OK
    }
}