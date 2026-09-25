package ESTRUCTURA_DATOS.cadenas;

public class EjeInvetirCadena {
    public static void main(String[] args) {
        String cad1, cad2 = "";
        int i, longitud;
        cad1 = "Estructuras de Datos";
        longitud = cad1.length();

        for(i = longitud-1; i>=0; i--){
            cad2 += cad1.charAt(i);

        }

        System.out.println("Cadena Original: "+cad1);
        System.out.println("Cadena Resultante: "+cad2);
    }
}
