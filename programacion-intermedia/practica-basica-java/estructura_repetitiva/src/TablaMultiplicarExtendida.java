import java.util.*;
public class TablaMultiplicarExtendida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        int n = sc.nextInt();
        

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 12; j++) {
                if(i == 1){
                    if(j >= 5){
                        System.out.print(" "); //Para que quede un poco alineado
                    }
                }
                System.out.print(i*j+ " ");
            }
            System.out.println();
        }
    }
}
