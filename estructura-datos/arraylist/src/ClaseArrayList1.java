import java.util.ArrayList;
public class ClaseArrayList1{
    public static void main(String[]args){
        ArrayList <String> nombre = new ArrayList<>();
        nombre.add("Mateo");
        nombre.add("Laura");
        nombre.add("Viviana");
        nombre.add("Sara");
        nombre.add("Mariam");
        nombre.add("Valeria");
        nombre.add("Mariana");
        nombre.add("Isabella");
        nombre.add("Salome");
        nombre.add("Alexandra");
        //Mostrar la lista de nombres
        System.out.println("Lista de personas");
        for (String nom:nombre){
            System.out.println(nom);
        }
        int tam = nombre.size();
        System.out.println("Tamaño de lista: " + tam);
        boolean esVacia = nombre.isEmpty();
        System.out.println("La lista esta vacia: " + esVacia);
        String dato = nombre.get(0);
        System.out.println("Nombre: " + dato);
        dato = nombre.get(5);
        System.out.println("Nombre: " + dato);
        nombre.set(3, "Melany");
        System.out.println("Lista modificada de Personas");
        for ( String nom : nombre){
            System.out.println(nom);
        }
        nombre.remove(4);
        System.out.println("Lista nueva de personas");
        for (String nom : nombre){
            System.out.println(nom);
        }
    }
}
