import java.util.Scanner;

public class ValidarEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = -1;

        while(edad < 0 || edad > 120){
            System.out.println("Ingresa tu edad (0-120): ");
            edad = sc.nextInt();
            if(edad < 0 || edad > 120){
                System.out.println("Edad invalida, intenta de nuevo.");
            }
        }

        System.out.println("Edad registrada: "+ edad);
        sc.close();
    }
}
