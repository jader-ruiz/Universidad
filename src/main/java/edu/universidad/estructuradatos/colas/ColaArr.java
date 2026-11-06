package edu.universidad.estructuradatos.colas;
import java.util.*;
public class ColaArr{
    public static final int TOPE = 10;
    String[] v;
    int cima;
    static Scanner sc = new Scanner(System.in);

    public ColaArr(){
        v = new String[TOPE];
        cima = -1;
    }

    public static void main(String[] args) {
        ColaArr sArr = new ColaArr();
        int op = 0;

        do {
            System.out.println("\n1. Ingresar Nombre");
            System.out.println("2. Eliminar Nombre");
            System.out.println("3. Imprimir Nombre");
            System.out.println("4. Salir");
            System.out.print("Digite la opcion: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    sArr.insetar();
                }
                case 2 -> {
                    sArr.eliminar();
                }
                case 3 -> {
                    sArr.imprimir();
                }
                case 4 -> {
                    System.out.println("\nSaliendo...");
                    System.exit(0);
                }

                default -> System.out.println("\nNúmero invalido...");
            }

        } while (op != 4);
    }

    public void insetar(){
        String valor;
        System.out.print("\nDigite Nombre: ");
        valor = sc.nextLine();
        if(llena()){
            System.out.println("\nLa cola esta llena");
        }else{
            if(cima == -1){
                cima = 0;
                v[cima] = valor;
            }else{
                ++cima;
                v[cima] = valor;
            }
        }
    }

    public boolean llena(){
        if(v.length == cima){
            return true;
        }
        return false;
    }

    public void eliminar(){
        int i,j;
        if(vacia()) System.out.println("\nLa cola se encuentra vacia...");
        else{
            for(i = 0, j = i+1; i<cima; i++, j++){
                v[i] = v[j];
            }
            v[cima] = null;
            cima--;
            System.out.println("\nSe elimino...");
        }
    }

    public boolean vacia(){
        if(cima == -1){
            return true;
        }
        return false;
    }

    public void imprimir(){
        int i = 0;
        System.out.println("\nLista de personas:");
        System.out.println(Arrays.toString(v));
    }

}