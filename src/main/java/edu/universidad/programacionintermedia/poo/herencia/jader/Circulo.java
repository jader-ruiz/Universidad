package edu.universidad.programacionintermedia.poo.herencia.jader;

public class Circulo extends Figura{
    private double radio;

    public Circulo(String color, double radio){
        super(color);
        setRadio(radio);
    }

    public void setRadio(double radio) {
       if(radio > 0) this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override 
    public void calcularArea(){
        System.out.println("Area: " + (Math.PI * radio * radio));
    }

    @Override 
    public void calcularPerimetro(){
        System.out.println("Perimetro: " + (2 * Math.PI * radio));
    }

    @Override 
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Radio: " + radio);
        calcularArea();
        calcularPerimetro();
    }
}