package edu.universidad.programacionintermedia.poo.composicion;

public class App {
    static void main() {
        Vuelo vuelo1 = new Vuelo("AV123", "Miami", "Honkong", 5);
        vuelo1.mostrarInfo();

        System.out.println("\nEmbarcando pasajeros...");
        vuelo1.embarcar("A1");
        vuelo1.embarcar("A3");
        vuelo1.embarcar("A5");
        vuelo1.embarcar("A3");

        System.out.println("\nEstado de los asientos después del embarque:");
        vuelo1.mostrarAsientos();

        System.out.println("\nLiberando algunos asientos...");
        vuelo1.desembarcar("A1");

        System.out.println("\nEstado de los asientos después de liberar algunos:");
        vuelo1.mostrarAsientos();
    }
}
