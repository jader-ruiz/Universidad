package edu.universidad.programacionintermedia.poo.herencia.mateo;
public class Estudiante extends Persona{
    private String codigoEstudiantil;
    private double promedio;

    public Estudiante(){

    }
    public Estudiante(String nombre, String cedula, int edad, String codigoEstudiatil, double promedio ){
        super(nombre, cedula, edad);
        this.codigoEstudiantil = codigoEstudiatil;
        this.promedio = promedio;
    }

    public String getCodigoEstudiantil() {
        return codigoEstudiantil;
    }
    public void setCodigoEstudiantil(String codigoEstudiantil) {
        this.codigoEstudiantil = codigoEstudiantil;
    }
    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}

