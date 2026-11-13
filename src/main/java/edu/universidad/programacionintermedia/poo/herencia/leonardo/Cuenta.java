public class Cuenta {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public Cuenta (){}
    public Cuenta (String numeroCuenta, String titular, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setSaldo(double saldo) {
        if(saldo >=0){
            this.saldo = saldo;
        }else{
            System.out.println("el saldo no puede ser negativo");
        }
    }
    public void depositar(double cantidad){
        if(cantidad > 0){
            saldo += cantidad;
            System.out.println("deposito realizado Nuevo saldo: " + saldo);
        }else{
            System.out.println("la cantidad debe ser positiva.");
        }
    }
    public void retirar(double cantidad){
        if(cantidad > 0 && saldo >= cantidad){
            saldo -= cantidad;
            System.out.println("retiro realizado Nuevo saldo: " + saldo);
        }else{
            System.out.println("fondos insuficientes o cantidad invalida.");
        }
    }
    public void mostarInfo(){
        System.out.println("Numero de Cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

}
