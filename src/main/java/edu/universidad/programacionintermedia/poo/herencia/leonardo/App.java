public class App {

    public static void main(String[] args) {

        CuentaAhorros ahorro = new CuentaAhorros(
            "1001", "Leonardo", 200000, 2.5
        );

        CuentaCorriente corriente = new CuentaCorriente(
            "2001", "Carlos", 100000, 50000
        );

        System.out.println("===== CUENTA DE AHORROS =====");

        ahorro.depositar(50000);

        ahorro.retirar(20000);
        ahorro.retirar(15000);
        ahorro.retirar(10000);
        ahorro.retirar(5000);

        ahorro.aplicarInteres();

        System.out.println("\n===== CUENTA CORRIENTE =====");

        corriente.depositar(30000);

        corriente.retirar(150000);

        System.out.println("\n===== INFORMACIÓN FINAL =====");

        System.out.println("\nCuenta de ahorros:");
        ahorro.mostarInfo();

        System.out.println("\nCuenta corriente:");
        corriente.mostarInfo();
    }
}