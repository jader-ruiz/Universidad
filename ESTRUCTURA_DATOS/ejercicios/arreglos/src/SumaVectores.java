
import java.util.Scanner;
public class SumaVectores {
    final int tam = 10;
    int[] w;
    int[] a = new int[tam];
    int[] b = new int[tam];
    Scanner sc;

    public SumaVectores(){
        w = new int[tam];
    }

    public void leerSuma(){
        sc = new Scanner(System.in);
        for(int i = 0; i < w.length; i++){
            System.out.print("\nNumero 1: ");
            a[i] = sc.nextInt();
            System.out.print("Numero 2: ");
            b[i] = sc.nextInt();

            w[i] = a[i]+b[i];
        }
    }

    public void mostrar(){
        System.out.println("La suma de todos los numeros: ");
        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i]+" ");
        }
    }

    public static void main(String[] args) {
        SumaVectores op = new SumaVectores();
        op.leerSuma();
        op.mostrar();
    }
}
