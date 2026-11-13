package edu.universidad.programacionintermedia.poo.abstracta;
public class Cuadrado extends Figura{
    private int lado;
    public Cuadrado(String tipo, int lado){
        super(tipo);
        setLado(lado);
    }
    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override 
    public double area(){
        return (double) lado * lado;
    }
}