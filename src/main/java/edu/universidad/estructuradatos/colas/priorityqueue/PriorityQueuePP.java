package edu.universidad.estructuradatos.colas.priorityqueue;
import java.util.PriorityQueue;
public class PriorityQueuePP{
    public static void main(String[] args) {
        PriorityQueue<Integer> num = new PriorityQueue<>();
        num.offer(30);
        num.offer(50);
        num.offer(10);
        num.offer(40);
        num.offer(20);
        System.out.println("Cola inicial: " + num);

        System.out.println("Elemento de Mayor prioridad: " + num.peek());
        System.out.println("Cola despues de Consultar: " + num);

        while (!num.isEmpty()) {
            System.out.println("Retirado: " + num.poll());
        }
        System.out.println("Cola vacia: " + num);
    }
}