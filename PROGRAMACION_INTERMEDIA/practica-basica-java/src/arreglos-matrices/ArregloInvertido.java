import java.util.Scanner;
public class ArregloInvertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = null;
        int tam = 0;
        boolean condicion = false;
        
        while(!condicion){
            System.out.print("Cuantos numeros quiere ingresar (1 - 20): ");
            tam = sc.nextInt();
            if(tam < 1 || tam > 20){
                System.out.println("Numero incorrecto");
            }else{
                v = new int[tam];
                condicion = true;
            }
            
        }

        for (int i = 0; i < v.length; i++) {
            System.out.print((i+1)+". Ingrese el numero: ");
            v[i] = sc.nextInt();
        }

        System.out.println("\n"+"Original: ");
        for(int num : v){
            System.out.print(num+" ");
        }

        int posicion = 1;
        for(int i = 0; i < v.length/2; i++){
            int temp = v[v.length - posicion];
            v[v.length - posicion] = v[i];
            v[i] = temp;
            posicion++;
        }

        System.out.println("\n"+"\n"+"Invertido: ");
        for(int num : v){
            System.out.print(num+" ");
        }

    }
}
