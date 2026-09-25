package ESTRUCTURA_DATOS.cadenas;

public class CompareTo {
   public static void main(String[] args) {
    String cad1 = "Ana";
    String cad2 = "Ada";

    System.out.println(cad1.compareTo(cad2));
    System.out.println(cad2.compareTo(cad1));
   } 
}

// compareTo
//  Compara dos cadenas teniendo en cuenta el valor numeroico que aparece en el codigo ASCII
//      cad1 > cad2 -> cad1 es mayor que cad2
//      cad1 < cad2 -> cad2 es menor que cad1
//      cad1 = cad2 -> cad1 es igual a cad2

