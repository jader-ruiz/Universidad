package edu.universidad.estructuradatos.colas.taller;

import java.util.*;

public class Cola{
    Estudiante[] estudiantes;
    public static final int TOPE = 3;
    static Scanner sc = new Scanner(System.in);
    int cima;

    public Cola(){
        estudiantes = new Estudiante[TOPE];
        cima = -1;
    }

    public void insetar(){
        if(llena()){
            System.out.println("\nLa cola esta llena");
            return;
        }
        sc.nextLine();

        System.out.print("\nCodigo: ");
        String codigo = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Sexo: ");
        char sexo = sc.next().charAt(0);

        System.out.print("Promedio: ");
        double promedio = sc.nextDouble();
    
        if(cima == -1){
            cima = 0;
            estudiantes[cima] = new Estudiante(codigo,nombre,edad,sexo,promedio);
        }else{
            ++cima;
            estudiantes[cima] = new Estudiante(codigo,nombre,edad,sexo,promedio);
        }
    }

    public boolean llena(){
        if(cima == estudiantes.length) return true;
        return false;
    }

    public String imprimir(){
        if(vacia()){
            return "\nLa lista se encuentra vacia";
        }
        String resultado = "";
        for (Estudiante estudiante : estudiantes) {
            if(estudiante == null) continue;
            resultado += estudiante;
        }
        return "====== Lista de estudiantes ======\n" + resultado;
    }

    public void eliminar(){
        if(vacia()){
            System.out.println("\nLa cola se encuentra vacia...");
            return;
        }else{
            int i,j;
            for(i = 0, j = i+1; i < cima; i++, j++){
                estudiantes[i] = estudiantes[j];
            }
            estudiantes[cima] = null;
            cima--;
            System.out.println("\nSe elimino...");
        }
    }

    public boolean vacia(){
        if(cima == -1) return true;
        return false;
    }

    public String mayorCuatro(){
        if(vacia()){
            return "\nLa lista se encuentra vacia";
        }
        String resultado = "";
        int contador = 0;
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getPromedio() >= 4){
                resultado += estudiante;
                contador++;
            } 
        }
        if(contador == 0){
            return "\nNo hay estudiantes con un promedio mayor a 4";
        }
        return resultado;
    }

    public String entre20y25(){
        if(vacia()){
            return "\nLa lista se encuentra vacia";
        }
        String resultado = "";
        int contador = 0;
        for (Estudiante estudiante : estudiantes) {
            if(estudiante.getEdad() >= 20 && estudiante.getEdad() <= 25){
                resultado += estudiante;
                contador++;
            }
        }
        if(contador == 0){
            return "\nNo hay estudiantes con un promedio mayor a 4";
        }
        return resultado;
    }
}
