package edu.universidad.programacionintermedia.poo.abstracta;
public class App{
    public static void main(String[] args) {
        polimorfismo(new Circulo("Circulo",3));
        polimorfismo(new Cuadrado("Cuadrado", 4));
        polimorfismo(new Triangulo("Triangulo",4,7));
    }
    public static void polimorfismo(Figura una){
        System.out.println(una.getTipo());
        System.out.println(una.area());
    }
}