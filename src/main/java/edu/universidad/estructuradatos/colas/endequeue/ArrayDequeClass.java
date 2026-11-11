package edu.universidad.estructuradatos.colas.endequeue;
import java.util.ArrayDeque;

// COLA DOBLE - BICOLA

public class ArrayDequeClass{
    public static void main(String[] args) {
        ArrayDeque<String> nombres = new ArrayDeque<>();

        nombres.addFirst("Jader");
        nombres.addLast("Pepe");
        nombres.addLast("Pedro");
        nombres.addFirst("Marcelo");
        nombres.addLast("Gerardo");

        System.out.println("\nCola inicial: " + nombres);
        System.out.println("Primer elemento: " + nombres.peekFirst());
        System.out.println("Ultimo elemento: " + nombres.peekLast());
        System.out.println("Cantidad de elementos: " + nombres.size());
        System.out.println("Elemento eliminado: " + nombres.pollFirst());
        System.out.println("Elemento eliminado (Ultimo): " + nombres.pollLast());
        System.out.println("Cola actual: " + nombres);
        System.out.println();
    }
}