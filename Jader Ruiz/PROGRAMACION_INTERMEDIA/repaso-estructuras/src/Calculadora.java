import java.util.*;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero 1: ");
        double a = sc.nextDouble();

        System.out.print("Operacion (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Numero 2: ");
        double b = sc.nextDouble();

        double resultado;

        switch (op) {
            case '+':
                resultado = a+b;
                break;
            case '-':
                resultado = a-b;
                break;
            case '*':
                resultado = a*b;
                break;
            case '/':
                if(b == 0){
                    System.out.println("No se puede dividir entre 0.");
                    return;
                }
                resultado = a/b;
                break;
            default:
                System.out.println("Operación invalida");
                resultado = 0;
                break;
        }

        System.out.println("Resultado: "+resultado);

        

    }
}
