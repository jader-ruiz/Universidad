import java.util.Scanner;

public class MainStack{
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        Stack1 op = new Stack1();
        int opcion = 0;

        do {
            System.out.println("\n==== Menu Principal ====");
            System.out.println("1. Ingresar Datos Persona");
            System.out.println("2. Eliminar Persona de la Pila");
            System.out.println("3. Imprimir Datos de la Persona");
            System.out.println("4. Salir");
            System.out.print("Digite una Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el nombre: ");
                    a = sc.nextLine();
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese el apellido: ");
                    String apellido = sc.nextLine();
                    System.out.print("Ingrese la edad: ");
                    int edad = sc.nextInt();
                    System.out.println(op.adicionar(nombre,apellido,edad));  
                }  
                case 2 -> {
                    System.out.println(op.eliminar());
                }
                case 3 -> {
                    System.out.println("\n==== Listado de Personas ====");
                    System.out.println(op.imprimir());
                }   
                case 4 -> System.exit(0);
                default -> System.out.println("Numero invalido...");
            }
        } while (opcion != 4);
    }
}