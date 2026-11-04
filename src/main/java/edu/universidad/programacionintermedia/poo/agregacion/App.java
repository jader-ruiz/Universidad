package edu.universidad.programacionintermedia.poo.agregacion;

public class App {
    public static void main(String[] args) throws Exception {

        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
        Libro libro3 = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón");

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        biblioteca.mostrarCatalogo();

        biblioteca.buscarAutor("Gabriel García Márquez");
        biblioteca.buscarAutor("J.K. Rowling");
    }
}