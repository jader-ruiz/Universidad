import java.util.Scanner;

public class NumerosPrimosRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de a: ");
        int a = scanner.nextInt();
        
        System.out.print("Ingrese el valor de b: ");
        int b = scanner.nextInt();
        
        int cantidad = 0;
        long suma = 0;
        String primosStr = "";
        
        for (int i = a; i <= b; i++) {
            if (i < 2) {
                continue;
            }
            
            boolean esPrimo = true;
            int d = 2;
            while (d <= Math.sqrt(i)) {
                if (i % d == 0) {
                    esPrimo = false;
                    break;
                }
                d++;
            }
            
            if (esPrimo) {
                if (cantidad > 0) {
                    primosStr += ", ";
                }
                primosStr += i;
                cantidad++;
                suma += i;
            }
        }
        
        System.out.println("Primos entre " + a + " y " + b + ": " + primosStr);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Suma: " + suma);
        
        scanner.close();
    }
}