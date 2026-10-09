import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Programa {
    ArrayList<Estudiante> estudiantes;
    Scanner sc;

    public Programa(){
        estudiantes = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public void obtenerDatos(){
        int cantidad = 10;

        for(int i = 0; i < cantidad; i++){
            System.out.println("\n"+(i+1)+". Estudiante");
            System.out.print("Ingrese el nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese la edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese el codigo: ");
            String codigo = sc.nextLine();
            System.out.print("Ingrese el promedio: ");
            double promedio = sc.nextDouble();
            sc.nextLine();

            estudiantes.add(new Estudiante(codigo, nombre, edad, promedio));

        }
    }

    public void mostrarDatos(){
        System.out.println();
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: "+estudiante.getNombre());
            System.out.println("Edad: "+estudiante.getEdad());
            System.out.println("Codigo: "+estudiante.getCodigo());
            System.out.println("Promedio: "+estudiante.getPromedio());
            System.out.println();
        }
    }

    public void primerUltimoEstudiante(){
        System.out.println("");
        System.out.println("Primer Estudiante: "+estudiantes.get(0).getNombre());
        System.out.println("Ultimo Estudiante: "+estudiantes.get(estudiantes.size()-1).getNombre());
    }

    public void eliminarEstudiante(){
        System.out.println();
        System.out.print("Ingrese el codigo del estudiante que desea eliminar: ");
        String codigo = sc.nextLine();
        boolean encontrado = false;
        for (Estudiante estudiante2 : estudiantes) {
            if(estudiante2.getCodigo().equals(codigo)){
                String nombre = estudiante2.getNombre();
                System.out.println("Se elimino a "+nombre);
                encontrado = true;
            }
        }
        if(!encontrado) System.out.println("No se encontró al estudiante ingresado por codigo.");
        estudiantes.removeIf(estudiante -> estudiante.getCodigo().equalsIgnoreCase(codigo));
    }

    public void ordenamiento(){
        System.out.println();
        System.out.println("Se ordenaran los datos por el promedio asignado.");
        estudiantes.sort(Comparator.comparingDouble(Estudiante::getPromedio).reversed());
        System.out.println();
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Estudiante: "+estudiante.getNombre());
            System.out.println("Promedio: "+estudiante.getPromedio());
            System.out.println("Edad: "+estudiante.getEdad());
            System.out.println("Codigo: "+estudiante.getCodigo());
            System.out.println();
        }
    }


}
