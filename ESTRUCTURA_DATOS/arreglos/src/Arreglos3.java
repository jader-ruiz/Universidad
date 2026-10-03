import java.util.*;
public class Arreglos3 {

    Scanner teclado;
    final int tam = 10;
    int v[];
    

    public Arreglos3(){
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
            Arreglos3 op = new Arreglos3();
            op.leer();
            op.mostrar();
        
    }
}
