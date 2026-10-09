

public class Estudiante{
    private String codigo;
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(String codigo, String nombre, int edad, double promedio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public double getPromedio() {
        return promedio;
    }

    
}