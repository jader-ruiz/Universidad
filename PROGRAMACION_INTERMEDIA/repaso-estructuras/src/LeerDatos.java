import java.util.Scanner;
public class LeerDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cómo te llamas: ");
        String nombre = sc.nextLine();

        System.out.print("Cuántos años tienes: ");
        String edad = sc.nextLine();

        System.out.println("Hola, "+ nombre + " tienes " + edad + " años.");
        
        sc.close();
    }
}
