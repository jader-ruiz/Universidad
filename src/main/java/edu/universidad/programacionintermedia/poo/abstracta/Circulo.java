package edu.universidad.programacionintermedia.poo.abstracta;
public class Circulo extends Figura{
    private double radio;
    public Circulo(String tipo, double radio){
        super(tipo);
        setRadio(radio);
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override 
    public double area(){
        return Math.PI * (radio*radio);    
    }
}