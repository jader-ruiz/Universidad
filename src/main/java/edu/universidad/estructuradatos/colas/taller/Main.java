package edu.universidad.estructuradatos.colas.taller;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int opcion = 0;
        
        Cola ag = new Cola();
        
        do {
            System.out.println("\nIngrese alguna de las siguientes opciones:");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Imprimir lista de estudiantes");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Mostrar estudiantes con >= 4.0 Promedio");
            System.out.println("5. Mostrar estudiantes entre 20 y 25 años");
            System.out.println("6. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 ->
                    ag.insetar();
                case 2 ->
                    System.out.println(ag.imprimir());
                case 3 ->
                    ag.eliminar();
                case 4 ->
                    System.out.println(ag.mayorCuatro());
                case 5 ->
                    System.out.println(ag.entre20y25());
                case 6 ->
                    System.exit(0);
                default ->
                    System.out.println("\nOpcion invalida...");
            }
        } while (opcion != 6);

    }
}