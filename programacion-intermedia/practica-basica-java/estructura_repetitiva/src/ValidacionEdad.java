import java.util.Scanner;

public class ValidacionEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        while (edad < 1 || edad > 120) {
            System.out.print("Error: La edad ingresada no es válida. Debe estar entre 1 y 120. Ingrese nuevamente: ");
            edad = scanner.nextInt();
        }
        
        if (edad >= 1 && edad <= 12) {
            System.out.println("Etapa de vida: Niñez");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Etapa de vida: Adolescencia");
        } else if (edad >= 18 && edad <= 25) {
            System.out.println("Etapa de vida: Juventud");
        } else if (edad >= 26 && edad <= 59) {
            System.out.println("Etapa de vida: Adultez");
        } else {
            System.out.println("Etapa de vida: Tercera edad");
        }
        
        scanner.close();
    }
}