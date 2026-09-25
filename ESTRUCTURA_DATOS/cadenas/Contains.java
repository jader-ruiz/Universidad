package ESTRUCTURA_DATOS.cadenas;

public class Contains {
    public static void main(String[] args) {
        String cad1 = "Hermoso";
        String cad2 = "oso";

        String correo = "asmendez@libertadores.edu.co";
        System.out.println(correo.contains("@"));
        

        System.out.println(cad1.contains(cad2));
    }
}

// contains()
//  Se utiliza para verificar si una secuencia especifica de caracteres se encuentra dentro de otra cadena
//      Sintaxis: boolean res = cad1.contains(cad2);
