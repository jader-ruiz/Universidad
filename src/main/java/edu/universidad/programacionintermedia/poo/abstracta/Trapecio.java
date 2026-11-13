package edu.universidad.programacionintermedia.poo.abstracta;
public class Trapecio extends Figura{
    int baseMayor, baseMenor, altura;
    public Trapecio(String tipo, int baseMayor, int baseMenor, int altura){
        super(tipo);
        setAltura(altura);
        setBaseMayor(baseMayor);
        setBaseMenor(baseMenor);
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void setBaseMayor(int baseMayor) {
        this.baseMayor = baseMayor;
    }
    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    @Override
    public double area(){
        return (double) ((baseMayor+baseMenor)*altura)/2;
    }
}