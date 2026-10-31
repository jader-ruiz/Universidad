package edu.universidad.estructuradatos.pilas;

public class Estudiante {
    private String codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private double promedio;

    public Estudiante(String codigo, String nombre, String apellido, int edad, double promedio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.promedio = promedio;
    }

    public void setEdad(int edad) {
        if(edad > 0 ) this.edad = edad;
    }
    public void setPromedio(double promedio) {
        if(promedio > 0) this.promedio = promedio;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
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
    public double getPromedio() {
        return promedio;
    }
}
