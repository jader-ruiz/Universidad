import java.util.Scanner;

public class TiempoViaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de minutos totales: ");
        int minutosTotales = scanner.nextInt();
        
        int totalSegundos = minutosTotales * 60;
        int horas = minutosTotales / 60;
        int minutosRestantes = minutosTotales % 60;
        int segundos = 0;
        
        System.out.println("Tiempo ingresado: " + minutosTotales + " minutos");
        System.out.println("Equivale a: " + horas + " horas, " + minutosRestantes + " minutos, " + segundos + " segundos");
        System.out.println("En segundos: " + totalSegundos + " segundos");
        
        scanner.close();
    }
}