package ESTRUCTURA_DATOS.cadenas;

public class Equals {
    public static void main(String[] args) {
        String cad1 = "Hola";
        String cad2 = "hola";
        String cad3 = "hola";

        System.out.println(cad1.equals(cad2));
        System.out.println(cad2.equals(cad3));
        System.out.println(cad1 == cad2);
        System.out.println(cad2 == cad3);
    }
}

// Comparar 2 cadenas
//  Comparar el contenido exacto de 2 cadenas de texto, evaluando si poseen las mismas secuencias de caracteres
//      Sintaxis: boolean igual = cad1.equals(cad2);
//      Sintaxis: cad1 == cad2;
