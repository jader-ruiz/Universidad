package edu.universidad.programacionintermedia.poo.composicion;

public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private int capacidadMaxima;
    private Asiento[] asiento;

    public Vuelo() {
    }

    public Vuelo(String numero, String origen, String destino) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
    }

    public Vuelo(String numero, String origen, String destino, int capacidadMaxima) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.capacidadMaxima = capacidadMaxima;
        this.asiento = new Asiento[capacidadMaxima];
        for(int i = 0; i < capacidadMaxima; i++) {
            String codigoAsiento = "A" + (i + 1);
            asiento[i] = new Asiento(codigoAsiento);
        }
    }

    public String getNumero() {
        return numero;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public void mostrarInfo(){
        System.out.println("Información del vuelo " + numero);
        System.out.println(origen + " -> " + destino);
        System.out.println("Capacidad máxima: " + capacidadMaxima);
    }

    public void mostrarAsientos(){
        for(int i = 0; i < capacidadMaxima; i++) {
            asiento[i].mostrarEstado();
        }
    }

    public void embarcar(String codigoAsiento){
        for(int i = 0; i < capacidadMaxima; i++) {
            if(asiento[i].getCodigo().equals(codigoAsiento)) {
                asiento[i].ocupar();
                return;
            }
        }
        System.out.println("El asiento " + codigoAsiento + " no existe en este vuelo.");
    }

    public void desembarcar(String codigoAsiento){
        for(int i = 0; i < capacidadMaxima; i++) {
            if(asiento[i].getCodigo().equals(codigoAsiento)) {
                asiento[i].liberar();
                return;
            }
        }
        System.out.println("El asiento " + codigoAsiento + " no existe en este vuelo.");
    }
}
