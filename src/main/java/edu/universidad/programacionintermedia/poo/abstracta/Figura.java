package edu.universidad.programacionintermedia.poo.abstracta;
abstract public class Figura{
    private String tipo;
    public Figura(String tipo){
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public abstract double area();
}