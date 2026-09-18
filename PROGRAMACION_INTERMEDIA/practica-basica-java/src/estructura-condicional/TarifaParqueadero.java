import java.util.Scanner;

public class TarifaParqueadero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tipo de vehículo (1=Moto, 2=Carro, 3=Camioneta): ");
        int tipo = scanner.nextInt();
        
        System.out.print("Ingrese el número de horas de permanencia: ");
        int horas = scanner.nextInt();
        
        if (horas <= 0) {
            System.out.println("El número de horas debe ser mayor a 0.");
        } else {
            int total = 0;
            switch (tipo) {
                case 1:
                    total = 2000 + (horas - 1) * 1500;
                    System.out.println("Valor total a pagar: $ " + total);
                    break;
                case 2:
                    total = 4000 + (horas - 1) * 3000;
                    System.out.println("Valor total a pagar: $ " + total);
                    break;
                case 3:
                    total = 5000 + (horas - 1) * 4000;
                    System.out.println("Valor total a pagar: $ " + total);
                    break;
                default:
                    System.out.println("La opción no es válida.");
                    break;
            }
        }
        
        scanner.close();
    }
}