package edu.universidad.programacionintermedia.poo.herencia.mateo;
public class Persona {

    private String nombre;
    private String cedula;
    private int edad;
    public Persona() {
    }

    public Persona(String nombre, String cedula, int edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        setEdad(edad);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }
    public void saludar() {
        System.out.println("Hola, me llamo " + nombre +" y tengo " + edad + " años.");
    }
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
        System.out.println("Edad: " + edad);
    }
}
