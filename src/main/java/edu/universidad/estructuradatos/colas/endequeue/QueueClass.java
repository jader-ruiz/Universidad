package edu.universidad.estructuradatos.colas.endequeue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueClass{
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        cola.add("Gabriela");
        cola.add("Jader");
        cola.add("Juan");

        System.out.println("Cola inicial: " + cola);

        cola.offer("Luis");
        cola.offer("Pepe");

        System.out.println("Cola inicial: " + cola);

        // Consultar el primer elemento
        System.out.println("Primer elemento: " + cola.peek());
        
        // Retirar el primer elemento
        System.out.println("Elemento eliminado: " + cola.poll());

        // Cola actualizada
        System.out.println("Cola actual: " + cola);

        
    }
}