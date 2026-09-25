package ESTRUCTURA_DATOS.cadenas;

public class ToUpperLower {
    public static void main(String[] args) {
        String cad1 = "programacion en java";
        String cad2 = "ESTRUCTURAS DE DATOS";

        String texto1 = cad1.toUpperCase();
        String texto2 = cad2.toLowerCase();

        System.out.println(cad1+" = "+texto1+"\n");
        System.out.println(cad2+" = "+texto2);
    }
}

// toUpperCase();
//  Se utiliza para convertir los caracteres que están en minuscula a mayuscula de una cadena a mayusculas.
//      Sintaxis: String texto1 = cadena.toUpperCase();

// toLowerCase();
//  Se utiliza para convertir los caracteres que están en mayuscula a minuscula de una cadena minuscula.
//      Sitaxis: String texto1 = cadena.toLowerCase();

