package edu.universidad.estructuradatos.pilas.stack;

public class Main {
    public static void main(String[] args) {
        Laboratorio laboratorio = new Laboratorio();
        laboratorio.agregarEstudiante();
        System.out.println();
        laboratorio.mostrarEstudiantes();
        System.out.println();
        laboratorio.mostrarMujeres();
        System.out.println();
        laboratorio.mostrarHombres20y25();
        System.out.println();
        laboratorio.mejoresSueldos();
        System.out.println();
        laboratorio.eliminarEstudiantePorCedula();
        System.out.println();
        laboratorio.mostrarEstudiantes();
    }
}
