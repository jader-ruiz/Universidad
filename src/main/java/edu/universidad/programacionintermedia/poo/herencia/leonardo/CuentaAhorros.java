public class CuentaAhorros extends Cuenta {
    private double tasaInteres;
    private int retirosMes;

    public CuentaAhorros(String numeroCuenta, String titular, double saldo, double tasaInteres){
        super(numeroCuenta, titular, saldo);
        this.tasaInteres = tasaInteres;
    }
    public double getTasaInteres() {
        return tasaInteres;
    }
    public void setTasaInteres(double tasaInteres) {
        if(tasaInteres >= 0){
            this.tasaInteres = tasaInteres;
        }
    }
    public void aplicarInteres(){
        double interes = getSaldo()*tasaInteres/100;
        setSaldo(getSaldo()+interes);
        System.out.println("interes ganado: " + interes);
    }
    @Override 
    public void retirar(double cantidad){
        if(retirosMes >= 3){
            System.out.println("no se permiten mas de 1 retiros al mes.");
        }else if(cantidad > 0 && getSaldo()>= cantidad){
            setSaldo(getSaldo()-cantidad);
            retirosMes++;
            System.out.println("retiro realizado Nuevo saldo: " + getSaldo());
        }else{
            System.out.println("fondos insuficientes o cantidad invalida.");
        }
    }
    @Override 
    public void mostarInfo(){
        System.out.println("Tasa de Interes: " + tasaInteres);
        System.out.println("Retiros del Mes: " + retirosMes);
    }
}
