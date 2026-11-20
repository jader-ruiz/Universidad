package edu.universidad.estructuradatos.listasenlazadas.taller;

public class Empleados {
    private String cedula;
    private String nombre;
    private double sueldo;
    private char sexo;
    private int edad;

    public Empleados(String cedula, String nombre, double sueldo, char sexo, int edad){
        setCedula(cedula);
        setNombre(nombre);
        setSueldo(sueldo);
        setSexo(sexo);
        setEdad(edad);
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCedula() {
        return cedula;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public char getSexo() {
        return sexo;
    }
    public double getSueldo() {
        return sueldo;
    }
}
