package edu.universidad.estructuradatos.listasenlazadas;
import java.util.*;

public class ListaEnlazada1{
    Nodo cab;
    Nodo p;
    static Scanner sc = new Scanner(System.in);

    public ListaEnlazada1(){
        cab = null;
        p = null;
    }

    public void leer(){
        int x;
        System.out.println("Digite numero:");
        x = sc.nextInt();
        if(siVacio()){
            Nodo nuevo = new Nodo(x);
            cab = nuevo;
            p = nuevo;
            p.sig = null;
        }else{
            Nodo nuevo = new Nodo(x);
            nuevo.num = x;
            nuevo.sig = null;
            p.sig = nuevo;
            p = nuevo;
        }
    }

    public boolean siVacio(){
        return cab == null;
    }

    public void imprimir(){
        String salida = "Lista de Numeros\n";
        for(p = cab; p != null; p = p.sig){
            salida += p.num + "\n";
        }
        System.out.println(salida);
    }

    public static void main(String[] args) {
        ListaEnlazada1 ps = new ListaEnlazada1();
        int op;
        do {
            System.out.println("Menu Principal");
            System.out.println("1. Ingresar valor");
            System.out.println("2. Imprimir valor");
            System.out.println("3. Salir");
            System.out.print("Digite opcion: ");
            op = sc.nextInt();

            switch (op) {
                case 1 -> ps.leer();
                case 2 -> ps.imprimir();
                case 3 -> System.exit(0);
                default -> System.exit(0);
            }
        } while (op != 3);
    }
}