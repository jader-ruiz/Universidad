import java.util.*;
public class DesplazarNumAdelante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] s = new int[10];
        boolean continuar = true;

        System.out.println("Ingrese numero: ");
        for(int i = 0;i < s.length; i++){
            if(i >= (s.length-1)){
                continuar = false;
                System.out.println("Digite en que posicion quiere ingresar el numero (1 - 10): ");
                int posicion = (sc.nextInt()-1);

                System.out.println("Digite el numero que quiere reemplazar en esa posición: ");
                int numero = sc.nextInt();

                for (int j = s.length - 1; j > posicion; j--) {
                    s[j] = s[j - 1];
                }

                s[posicion] = numero;

            }
            if(continuar == true){
                s[i] = sc.nextInt();
            }
            
        }

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+" ");
        }
    }
}
