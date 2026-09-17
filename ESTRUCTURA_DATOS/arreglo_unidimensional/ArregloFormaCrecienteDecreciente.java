
import java.util.Scanner;

public class ArregloFormaCrecienteDecreciente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean creciente = false;
        boolean decreciente = false;
        
        System.out.print("Cuantos numeros quiere digitar: ");
        int[] s = new int[sc.nextInt()];

        System.out.println("Ingresa los numeros: ");
        for(int i = 0;i < s.length;i++){
            s[i] = sc.nextInt();
        }

        for (int i = 0; i < (s.length-1); i++) {
            if(s[i] < s[i+1]){
                creciente = true;
            }
            if(s[i] > s[i+1]){
                decreciente = true;
            }
        }

        if(creciente == true && decreciente == false){
            System.out.println("\nCreciente");
        }else if(creciente == false && decreciente == true){
            System.out.println("\nDecreciente");
        }else if(creciente == true && decreciente == true){
            System.out.println("\nDesordenado");
        }else{
            System.out.println("\nIgual");
        }
    }
}
