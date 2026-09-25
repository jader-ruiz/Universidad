package ESTRUCTURA_DATOS.cadenas;

public class ConcatenacionCadenas {
    public static void main(String[] args) {
        String nombre = "Jader";
        String apellido = "Ruiz";
        int edad = 18;

        System.out.println(nombre+" "+apellido+" Tiene "+edad+" años.");

        String completo;
        completo = nombre.concat(" ").concat(apellido);
        System.out.println(completo);
    }
}

// Concatenacion de cadenas
//  Consiste en unir dos o más secuencias de caracteres para formar una nueva.
//      Sintaxis: cad1 + cad2 + cad3 + ...;
//      Sintaxis: cadena.conect(cadena1);