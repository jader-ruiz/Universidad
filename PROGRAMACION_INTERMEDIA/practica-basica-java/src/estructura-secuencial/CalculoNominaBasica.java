import java.util.Scanner;
public class CalculoNominaBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int h = 15000;

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();

        System.out.println("Empleado: "+nombre);
        System.out.println("Horas trabajadas: "+horasTrabajadas);
        System.out.println("Salario bruto: "+"$ "+(h*horasTrabajadas));
        System.out.println("Descuento SS (8%): "+"$ "+(h*horasTrabajadas*0.08));
        System.out.println("Retención (5%): "+"$ "+(h*horasTrabajadas*0.05));
        System.out.println("Salario neto: "+"$ "+(h*horasTrabajadas - ((h*horasTrabajadas*0.08) + (h*horasTrabajadas*0.05))));


    }    
}
