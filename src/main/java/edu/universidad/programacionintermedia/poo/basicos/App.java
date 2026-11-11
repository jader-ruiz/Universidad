package edu.universidad.programacionintermedia.poo.basicos;


public class App {
    public static void main(String[] args) {
        /*Punto p1 = new Punto(3,4);
        Punto p2 = new Punto(5);
        Punto p3 = new Punto();

        System.out.println(p1.getX());
        System.out.println(p1.getY());

        System.out.println(p2.getX());
        System.out.println(p2.getY());

        System.out.println(p3.getX());
        System.out.println(p3.getY());

        System.out.println("Modulos: ");
        System.out.println(p1.modulo());
        System.out.println(p2.modulo());
        System.out.println(p3.modulo());

        System.out.println("Fases: ");
        System.out.println(p1.fase());
        System.out.println(p2.fase());
        System.out.println(p3.fase());*/

        PuntoTiempo pt1 = new PuntoTiempo();
        System.out.println(pt1.getX());
        System.out.println(pt1.getY());
        System.out.println(pt1.getT());
        
        System.out.println(pt1.modulo());
        System.out.println(pt1.velocidad());

        Punto3D p3D = new Punto3D(1,2,3,4);
        System.out.println(p3D.modulo());
        System.out.println(p3D.velocidad());
    }
}
