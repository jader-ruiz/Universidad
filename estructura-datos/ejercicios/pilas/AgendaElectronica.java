import java.util.Scanner;

class Estudiante {
    private String codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private double promedio;

    public Estudiante(String codigo, String nombre, String apellido, int edad, double promedio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.promedio = promedio;
    }
    
    public void setEdad(int edad) {
        if(edad > 0 ) this.edad = edad;
    }
    public void setPromedio(double promedio) {
       if(promedio > 0) this.promedio = promedio;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public double getPromedio() {
        return promedio;
    }
    
}

public class AgendaElectronica{
    private Estudiante[] agendaE;
    private final int tope = 10;
    private int cima;

    public AgendaElectronica(){
        this.cima = -1;
        this.agendaE = new Estudiante[tope];
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        int bp = 0;
        
        do{
            System.out.println("1. Agregar Usuario");
            System.out.println("2. Mostrar lista");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            bp = sc.nextInt();

            switch (bp) {
                case 1:
                    System.out.print("Codigo: ");
                    String a = sc.nextLine();
                    String codigo = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    System.out.print("Promedio: ");
                    double promedio = sc.nextDouble();
                    
                    Estudiante nuevoEstudiante = new Estudiante(codigo, nombre, apellido, edad, promedio);

                    apilarEstudiante(nuevoEstudiante);

                    break;
                case 2: 
                    mostrar();
                    break;
                default:
                    break;
            }
        }while(bp != 0);
        sc.close();
    }

    public void apilarEstudiante(Estudiante a){
        if(!(llena())){
            if(cima == -1){
                cima = 0;
                agendaE[cima] = a;
                System.out.println("Se apilo correctamente!\n");
            }else if(cima >= 0){
                cima++;
                agendaE[cima] = a;
                System.out.println("Se apilo correctamente!\n");
            }
        }else System.out.println("Pila llena!");
    }

    public boolean llena(){
        if(cima == agendaE.length -1){
            return true;
        } else
            return false;
    }

    public void mostrar(){
        for (int i = 0; i >= 0; i--) {
            System.out.println("Codigo: ");
        }
    }

}