import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el peso en kg: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Ingrese la estatura en metros: ");
        double estatura = scanner.nextDouble();
        
        double imc = peso / Math.pow(estatura, 2);
        
        if (imc < 18.5) {
            System.out.println("IMC: " + String.format("%.2f", imc) + " - Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("IMC: " + String.format("%.2f", imc) + " - Peso normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("IMC: " + String.format("%.2f", imc) + " - Sobrepeso");
        } else {
            System.out.println("IMC: " + String.format("%.2f", imc) + " - Obesidad");
        }
        
        scanner.close();
    }
}