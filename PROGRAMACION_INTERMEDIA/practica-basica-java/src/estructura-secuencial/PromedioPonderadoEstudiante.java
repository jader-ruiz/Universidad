import java.util.Scanner;

public class PromedioPonderadoEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la nota del primer parcial (30%): ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Ingrese la nota del segundo parcial (30%): ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Ingrese la nota del examen final (40%): ");
        double nota3 = scanner.nextDouble();
        
        double notaDefinitiva = (nota1 * 0.3) + (nota2 * 0.3) + (nota3 * 0.4);
        
        String resultado = (notaDefinitiva >= 3.0) ? "Aprueba" : "Reprueba";
        
        System.out.println("Nota definitiva: " + String.format("%.2f", notaDefinitiva));
        System.out.println("Resultado: " + resultado);
        
        scanner.close();
    }
}