package ESTRUCTURA_DATOS.cadenas;

public class Replace {

    public static void main(String[] args) {
        String frase = "Programar en Java es muy potente";
        String frase1 = frase.replace("Java", "Python");
        
        System.out.println(frase1);

        String textoconGuiones = frase.replace(' ', '_');
        System.out.println(textoconGuiones);
    }
}

// replace()
//  Sirve para reemplazar todas las apariciones de un caracter o una secuencia de caracteres especifica dentro de un texto
//      Sintaxis: String nuevo = cadena.replace(char textoAntiguo, char textoNuevo);