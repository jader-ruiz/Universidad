package edu.universidad.programacionintermedia.poo.herencia.mateo;
public class App {
    public static void main(String[] args) {

        Persona p = new Persona("Teo", "1053337731", 17);
        System.out.println(" PERSONA ");
        p.mostrarInfo();
        p.saludar();

        Estudiante e = new Estudiante("Laura", "1020253033", 18, "23", 4.5);
        System.out.println("\n ESTUDIANTE ");
        e.mostrarInfo();
        e.saludar();

        Profesor r = new Profesor("Norbey", "54321", 27,"Ingenieria", 3500000);
        System.out.println("\n PROFESOR ");
        r.mostrarInfo();
        r.saludar();

        System.out.println("\n ARREGLO DE PERSONAS ");
        Persona[] personas = {p, e, r};
        for (Persona persona : personas) {
            System.out.println("------------------");
            persona.mostrarInfo();
        }
    }
}
