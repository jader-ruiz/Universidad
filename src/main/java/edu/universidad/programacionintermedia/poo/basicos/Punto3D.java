package edu.universidad.programacionintermedia.poo.basicos;

public class Punto3D extends PuntoTiempo{
    private int z;
    public Punto3D(int x, int y, int z, int t){
        super(x, y, t);
        setZ(z);
    }

    public int getZ() {
        return z;
    }

    public final void setZ(int z) {
        this.z = z;
    }

    @Override 
    public double modulo(){
        return Math.sqrt((getX()*getX()) + (getY()*getY()) + (z*z));
    }
}