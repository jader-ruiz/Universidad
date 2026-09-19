import java.util.*;
public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numRandom = (int)(Math.random() * 100) + 1;
        int numIngresado;
        boolean acerto = true;
        int intentos = 0;

        System.out.println("Adivina el numero (entre 1 y 100): ");

        while (acerto) { 
            numIngresado = sc.nextInt();
            intentos++;
            if(numIngresado < numRandom){
                System.out.println("Intento "+intentos+": "+numIngresado+" -> El numero es mayor");
            }else if(numIngresado > numRandom){
                System.out.println("Intento "+intentos+": "+numIngresado+" -> El numero es menor");
            }else{
                System.out.println("Intento "+intentos+": "+numIngresado+" -> ¡Correcto! Lo lograste en "+intentos+" intentos.");
                acerto = false;
            }
        }
    }
}
