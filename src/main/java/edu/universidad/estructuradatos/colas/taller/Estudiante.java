package edu.universidad.estructuradatos.colas.taller;

public class Estudiante {
    private String codigo;
    private String nombre;
    private int edad;
    private char sexo;
    private double promedio;

    public Estudiante(String codigo, String nombre, int edad, char sexo, double promedio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.promedio = promedio;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        if(promedio > 0){
            this.promedio = promedio;
        }
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F') {
            this.sexo = sexo;
        }
    }

    @Override 
    public String toString(){
        return "\n"+ codigo + " | " + nombre + " | Edad: " + edad + " | Sexo: " + sexo + " | Promedio: " + promedio;
    }
}