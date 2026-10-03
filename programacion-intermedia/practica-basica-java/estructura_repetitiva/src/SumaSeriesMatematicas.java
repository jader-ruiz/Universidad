import java.util.Scanner;

public class SumaSeriesMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.print("Ingrese el valor de n (número entero positivo): ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Por favor, ingrese un número mayor a 0.");
        } else {
            int sumaNaturalesBucle = 0;
            for (int i = 1; i <= n; i++) {
                sumaNaturalesBucle += i;
            }
            int sumaNaturalesFormula = (n * (n + 1)) / 2;
            
            System.out.println("--- Serie 1: Suma de números naturales ---");
            System.out.println("Resultado por bucle: " + sumaNaturalesBucle);
            System.out.println("Resultado por fórmula n*(n+1)/2: " + sumaNaturalesFormula);
            
            int sumaParesBucle = 0;
            for (int i = 1; i <= n; i++) {
                sumaParesBucle += (2 * i);
            }
            int sumaParesFormula = n * (n + 1);
            
            System.out.println("\n--- Serie 2: Suma de números pares ---");
            System.out.println("Resultado por bucle: " + sumaParesBucle);
            System.out.println("Resultado por fórmula n*(n+1): " + sumaParesFormula);
            
            int sumaCuadradosBucle = 0;
            for (int i = 1; i <= n; i++) {
                sumaCuadradosBucle += (i * i);
            }
            int sumaCuadradosFormula = (n * (n + 1) * (2 * n + 1)) / 6;
            
            System.out.println("\n--- Serie 3: Suma de cuadrados perfectos ---");
            System.out.println("Resultado por bucle: " + sumaCuadradosBucle);
            System.out.println("Resultado por fórmula n*(n+1)*(2n+1)/6: " + sumaCuadradosFormula);
        }
        
        scanner.close();
    }
}