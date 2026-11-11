package edu.universidad.programacionintermedia.poo.herencia;

public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura){
        super(color);
        setAltura(altura);
        setBase(base);

    }

    public void setAltura(double altura) {
        if(altura > 0) this.altura = altura;
    }

    public void setBase(double base) {
       if(base > 0) this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    @Override 
    public void calcularArea(){
        System.out.println("Area: " + base*altura);
    }

    @Override 
    public void calcularPerimetro(){
        System.out.println("Perimetro: " + (2*(base+altura)));
    }

    @Override 
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        calcularArea();
        calcularPerimetro();
    }

}