package PROGRAMACION_INTERMEDIA.POO.src;
public class Punto {
    private int x,y;

    public Punto(int x, int y){
        this.setX(3);
        this.setY(5);
    }

    public double modulo(){
        return Math.sqrt((x*x)+(y*y));
    }

    public double fase(){
        double valor = 0;
        return valor;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

}
