public class Secuencial {
    public static void main(String[] args) {
        // Esto es un comentario
        /* 
        Esto es
        un comentario 
        de varias lineas 
        */

        int edad;
        edad = 18;

        int altura = 169;
        double peso = 61.2;
        char sexo = 'M';
        boolean reprobado = false;

        String nombre = "Jader Ruiz";
        String saludo = "Hola, " + nombre;

        // System.out.println(saludo);

        double precio = 9.99;
        int precioCortado = (int) precio;
        // System.out.println(precioCortado);

        int entero = 5;
        double decimal = entero;

        int a = 10, b = 3;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        int x = 10;

        x+= 10;
        x-= 4;
        x*= 3;
        x--;
        x/= 2;
        x++;

        System.out.println(x);

    }
}
