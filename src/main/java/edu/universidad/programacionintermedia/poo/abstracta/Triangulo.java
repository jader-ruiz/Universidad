package edu.universidad.programacionintermedia.poo.abstracta;
public class Triangulo extends Figura{
    private int base, altura;
    public Triangulo(String tipo, int base, int altura){
        super(tipo);
        setBase(base);
        setAltura(altura);
    }

    public void setBase(int base) {
        this.base = base;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }
    public int getBase() {
        return base;
    }
    
    @Override 
    public double area(){
        return (double) (base * altura)/2;
    }
}