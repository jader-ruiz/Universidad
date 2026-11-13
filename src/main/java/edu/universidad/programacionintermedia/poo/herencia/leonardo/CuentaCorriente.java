public class CuentaCorriente extends Cuenta {

    private double sobregiro;

    public CuentaCorriente(String numeroCuenta, String titular, double saldo, double sobregiro) {
        super(numeroCuenta, titular, saldo);
        this.sobregiro = sobregiro;
    }

    public double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(double sobregiro) {
        if (sobregiro >= 0) {
            this.sobregiro = sobregiro;
        }
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= getSaldo() + sobregiro) {
            setSaldo(getSaldo() - cantidad);
            System.out.println("Retiro realizado. Nuevo saldo: " + getSaldo());
        } else {
            System.out.println("Se excedió el límite de sobregiro.");
        }
    }

    @Override
    public void mostarInfo() {
        super.mostarInfo();
        System.out.println("Límite de sobregiro: " + sobregiro);
    }
}