import java.util.*;
public class arreglos3 {

    Scanner teclado;
    final int tam = 10;
    int v[];
    

    public arreglos3(){
            v = new int[tam];
    }

    public void leer(){
        
        teclado = new Scanner(System.in);
        System.out.println("Digite valor: ");
        for(int i = 0; i < v.length; i++){
            v[i] = teclado.nextInt();
        }

    }

    public void mostrar(){
        System.out.println("Lista de numeros enteros: ");
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i]+" ");
        }
    }
    public static void main(String[] args) {
            arreglos3 op = new arreglos3();
            op.leer();
            op.mostrar();
        
    }
}
