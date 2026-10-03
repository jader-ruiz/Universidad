package PROGRAMACION_INTERMEDIA.POO.src;
public class Punto {
    private int x,y;

    public Punto(int x, int y){
        this.setX(x);
        this.setY(y);
    }
    public Punto(int xy){
        this(xy, xy);
    }
    public Punto(){
        this(0,0);
    }

    public double modulo(){
        return Math.sqrt((x*x)+(y*y));
    }

    public double fase(){
        double aux = (double) (this.y) / (this.x);
        return Math.atan(aux);
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
