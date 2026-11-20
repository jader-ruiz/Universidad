package edu.universidad.estructuradatos.listasenlazadas.taller;

import java.util.Scanner;


public class EditorialTitanes {
    Nodo cab;

    Nodo p;
    static Scanner sc = new Scanner(System.in);

    public EditorialTitanes(){
        cab = null;
        p = null;
    }

    public void leer(){

        System.out.print("Cedula: ");
        String cedula = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Sueldo: ");
        double sueldo = sc.nextDouble();
        System.out.print("Sexo: ");
        char sexo = sc.next().charAt(0);
        System.out.print("Edad: ");
        int edad = sc.nextInt();

        Nodo newNodo = new Nodo(new Empleados(cedula, nombre, sueldo, sexo, edad));

        if (p == null) {
            cab = newNodo;
            p = newNodo;
            return;
        }

        p.sig = newNodo;
        p = p.sig;
    }

}
