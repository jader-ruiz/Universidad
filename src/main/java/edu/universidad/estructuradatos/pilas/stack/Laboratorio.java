package edu.universidad.estructuradatos.pilas.stack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class Laboratorio {
    private Stack<Estudiante> estudiantes;
    private final int MAX_ESTUDIANTES = 20;
    private final Scanner sc = new Scanner(System.in);

    public Laboratorio() {
        estudiantes = new Stack<>();
    }

    public void agregarEstudiante() {
        String cedula;
        String nombre;
        String apellido;
        int edad;
        char sexo;
        int salario;

        for(int i = 0; i < MAX_ESTUDIANTES; i++){

            System.out.println("Ingrese la cédula del estudiante " + (i + 1) + ": ");
            cedula = sc.nextLine();
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombre = sc.nextLine();
            System.out.println("Ingrese el apellido del estudiante " + (i + 1) + ": ");
            apellido = sc.nextLine();
            System.out.println("Ingrese la edad del estudiante " + (i + 1) + ": ");
            edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el sexo del estudiante " + (i + 1) + " (M/F): ");
            sexo = sc.nextLine().toUpperCase().charAt(0);
            System.out.println("Ingrese el salario del estudiante " + (i + 1) + ": ");
            salario = sc.nextInt();
            sc.nextLine();

            estudiantes.push(new Estudiante(cedula, nombre, apellido, edad, sexo, salario));

        }
    }

    public void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes en la pila.");
            return;
        }

        System.out.println("Estudiantes en la pila:");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i));
        }
    }

    public void mostrarMujeres(){
        int contador = 0;
        System.out.println("Mujeres en la pila:");
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante est = estudiantes.get(i);
            if (est.getSexo() == 'F') {
                System.out.println((i + 1) + ". " + est);
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No hay mujeres en la pila.");
        }
    }

    public void mostrarHombres20y25(){
        int contador = 0;
        System.out.println("Hombres entre 20 y 25 años en la pila:");
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante est = estudiantes.get(i);
            if (est.getSexo() == 'M' && est.getEdad() >= 20 && est.getEdad() <= 25) {
                System.out.println((i + 1) + ". " + est);
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No hay hombres entre 20 y 25 años en la pila.");
        }
    }

    public void mejoresSueldos(){
        Estudiante[] sueldos = new Estudiante[5];
        System.out.println("Estudiantes con los mejores sueldos en la pila:");
        for (int i = 0; i < 5; i++) {
            sueldos[i] = estudiantes.get(i);
        }
        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 5; j < estudiantes.size(); j++) {
                if(estudiantes.get(j).getSueldo() > sueldos[i].getSueldo()){
                    sueldos[i] = estudiantes.get(j);
                }
            }
        }
        Arrays.sort(sueldos, Comparator.comparingInt(Estudiante::getSueldo).reversed());
        for (Estudiante est : sueldos) {
            System.out.println(est);
        }
    }

    public void eliminarEstudiantePorCedula() {
        System.out.println("Ingrese la cédula del estudiante a eliminar: ");
        String cedula = sc.nextLine();
        Stack<Estudiante> tempStack = new Stack<>();
        boolean encontrado = false;

        while (!estudiantes.isEmpty()) {
            Estudiante est = estudiantes.pop();
            if (est.getCedula().equals(cedula)) {
                encontrado = true;
                System.out.println("Estudiante eliminado: " + est);
                break;
            } else {
                tempStack.push(est);
            }
        }

        while (!tempStack.isEmpty()) {
            estudiantes.push(tempStack.pop());
        }

        if (!encontrado) {
            System.out.println("No se encontró un estudiante con la cédula: " + cedula);
        }
    }
}
