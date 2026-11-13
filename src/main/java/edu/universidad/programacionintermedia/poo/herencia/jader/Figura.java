package edu.universidad.programacionintermedia.poo.herencia.jader;

public class Figura{
    private String color;

    public Figura(){}

    public Figura(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void mostrarInfo(){
        System.out.println( "\nColor: " + color);
    }

    public void calcularArea(){
        System.out.println("Área no definida para esta figura.");
    }

    public void calcularPerimetro(){
        System.out.println("Perímetro no definido para esta figura.");
    }
}