import java.util.Scanner;

public class AnoBisiestoDiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un año (número entero positivo): ");
        int anio = scanner.nextInt();
        
        System.out.print("Ingrese un número de la semana (1 a 7): ");
        int dia = scanner.nextInt();
        
        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        if (esBisiesto) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
        
        switch (dia) {
            case 1:
                System.out.println("Día: Lunes");
                break;
            case 2:
                System.out.println("Día: Martes");
                break;
            case 3:
                System.out.println("Día: Miércoles");
                break;
            case 4:
                System.out.println("Día: Jueves");
                break;
            case 5:
                System.out.println("Día: Viernes");
                break;
            case 6:
                System.out.println("Día: Sábado");
                break;
            case 7:
                System.out.println("Día: Domingo");
                break;
            default:
                System.out.println("Error: El número de día está fuera del rango (1-7).");
                break;
        }
        
        scanner.close();
    }
}