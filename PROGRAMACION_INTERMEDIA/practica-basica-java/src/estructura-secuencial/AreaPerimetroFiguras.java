import java.util.Scanner;

public class AreaPerimetroFiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        
        double areaRectangulo = base * altura;
        double perimetroRectangulo = 2 * (base + altura);
        
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        double circunferenciaCirculo = 2 * Math.PI * radio;
        
        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Circunferencia del círculo: " + circunferenciaCirculo);
        
        scanner.close();
    }
}