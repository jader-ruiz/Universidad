package edu.universidad.programacionintermedia.poo.abstracta;
public class Rectangulo extends Figura{
    private int base;
    private int altura;

    public Rectangulo(String tipo, int base, int altura){
        super(tipo);
        setAltura(altura);
        setBase(base);
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public double area(){
        return (double) base * altura;
    }
}