package edu.universidad.programacionintermedia.poo.composicion;

public class Asiento {
    private String codigo;
    private boolean ocupado;

    public Asiento(String codigo) {
        this.codigo = codigo;
        this.ocupado = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void ocupar() {
        if(!ocupado) {
            this.ocupado = true;
        }else {
            System.out.println("El asiento " + codigo + " ya está ocupado.");
        }

    }

    public void liberar() {
        if(ocupado) {
            this.ocupado = false;
        }else{
            System.out.println("El asiento " + codigo + " ya está libre.");
        }
    }

    public void mostrarEstado(){
        System.out.print("Estado del asiento " + codigo + ":");
        if(ocupado) {
            System.out.println(" Está ocupado.");
        } else {
            System.out.println(" Está libre.");
        }
    }
}
