package PROGRAMACION_INTERMEDIA.POO.src;

public class App {
    public static void main(String[] args) {
        Punto p1 = new Punto(3,4);
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
        System.out.println(p3.fase());
    }
}
