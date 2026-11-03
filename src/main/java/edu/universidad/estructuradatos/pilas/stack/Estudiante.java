package edu.universidad.estructuradatos.pilas.stack;

public class Estudiante {
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    private int sueldo;

    public Estudiante(String cedula, String nombre, String apellido, int edad, char sexo, int sueldo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.sueldo = sueldo;
    }

    public String getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public char getSexo() {
        return sexo;
    }
    public int getSueldo() {
        return sueldo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F') {
            this.sexo = sexo;
        }
    }
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }
    public void setSueldo(int sueldo) {
        if (sueldo >= 0) {
            this.sueldo = sueldo;
        }
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ", Edad: " + edad + ", Sexo: " + sexo + ", Sueldo: " + sueldo;
    }
}
