package ESTRUCTURA_DATOS.matrices;
import java.util.*;
public class Matriz3 {
    public Scanner sc;
    public int[][] mat;

    public Matriz3(){
        mat = new int[3][3];
    }

    public static void main(String[] args) {
        Matriz3 obj = new Matriz3();

        obj.leer();
        obj.mostrar();
    }

    public void leer(){
        sc = new Scanner(System.in);
        System.out.println("Digite los numeros que desea ingresar: ");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print("Fila: "+(i+1)+" Columna: "+(j+1)+": ");
                mat[i][j] = sc.nextInt();
            }
        }
    }
    public void mostrar(){
        System.out.print("\n");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
