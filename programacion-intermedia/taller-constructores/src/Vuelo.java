public class Vuelo {

    private String numero;
    private String origen;
    private String destino;
    private int ocupacion;
    private int capacidadMaxima;

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public String getDestino() {
        return destino;
    }
    public String getNumero() {
        return numero;
    }
    public int getOcupacion() {
        return ocupacion;
    }
    public String getOrigen() {
        return origen;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        if(capacidadMaxima <= 0){
            System.out.println("Capacidad maxima invalida.");
        }else{
            this.capacidadMaxima = capacidadMaxima;
        }
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setOcupacion(int ocupacion) {
        if(ocupacion >= 0  && ocupacion <= capacidadMaxima){
            this.ocupacion = ocupacion;
        }else{
            System.out.println("Ocupacion invalida.");
        }
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void mostrarInfo(){
        System.out.println("El destino es: " + getDestino());
        System.out.println("El origen es: " + getOrigen());
        System.out.println("El numero de vuelo es: " + getNumero());
        System.out.println("Numero de pasajeros: "+ getOcupacion());
    }

    public void embarcar(int pasajeros){
        if((pasajeros + ocupacion) > capacidadMaxima){
            System.out.println("No hay cupo para embarcar "+pasajeros+" pasajeros.");
        }
        if((pasajeros + ocupacion) <= capacidadMaxima){
            System.out.println("Numero de pasajeros embarcados: " + pasajeros);
        }
    }

    public void desembarcar(int pasajeros){
        if(pasajeros < 0){
            System.out.println("El numero no puede ser negativo.");
        }
        if(pasajeros >= 0 && pasajeros <= getOcupacion()){
            System.out.println("Pasajeros desembarcados: " + pasajeros);
        }
    }

}
