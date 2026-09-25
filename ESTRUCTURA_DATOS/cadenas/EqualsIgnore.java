package ESTRUCTURA_DATOS.cadenas;

public class EqualsIgnore {
    public static void main(String[] args) {
        String cad1 = "Sistemas";
        String cad2 = "SISTEMAS";
        String cad3 = "sistemas";
        String cad4 = "S1stemas";

        boolean opc1, opc2, opc3;
        opc1 = cad1.equalsIgnoreCase(cad2);
        opc2 = cad1.equalsIgnoreCase(cad3);
        opc3 = cad1.equalsIgnoreCase(cad4);
        System.out.println("Respuesta = "+opc1);
        System.out.println("Respuesta = "+opc2);
        System.out.println("Respuesta = "+opc3);
        
    }
}

// equalsIgnoreCase()
//  Se utiliza para comparar el contenido de 2 cadenas ignorando las mayusculas de las minusculas.
//      Sintaxis: boolean igual = cadena1.equalsIgnoreCase(cadeana2)
