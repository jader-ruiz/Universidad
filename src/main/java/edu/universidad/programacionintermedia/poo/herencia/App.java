package edu.universidad.programacionintermedia.poo.herencia;

public class App{
    public static void main(String[] args) {
        Figura fg = new Figura("Rojo");
        fg.calcularArea();
        fg.calcularPerimetro();
        fg.mostrarInfo();

        Rectangulo rc = new Rectangulo("Amarillo",5.1,2.7);
        rc.mostrarInfo();

        Circulo cr = new Circulo("Negro", 6.77);
        cr.mostrarInfo();

        Figura[] fgArr = new Figura[3];
        fgArr[0] = rc;
        fgArr[1] = cr;
        fgArr[2] = new Rectangulo("Azul", 4.22, 5.5);

        for (Figura figura : fgArr) {
            figura.mostrarInfo();
        }
    }
}