package edu.universidad.programacionintermedia.poo.modificadoresacceso.banco;
public class Banco {
    public void operar(Cuenta c) {
        // private titular → ERROR si descomentamos:
        // System.out.println(c.titular);

        System.out.println(c.saldo);        // friendly: OK (mismo paquete)
        System.out.println(c.tipo);         // protected: OK (mismo paquete)
        System.out.println(c.numeroCuenta); // public: OK

        // Para acceder a titular usamos el getter:
        System.out.println(c.getTitular());
    }
}