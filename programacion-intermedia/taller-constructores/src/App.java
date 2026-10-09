class App{

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.mostrarInfo();

        System.out.println();
        Libro libro2 = new Libro("La odisea","Jader");
        libro2.mostrarInfo();
        

        System.out.println();
        Libro libro3 = new Libro("Cien años de soledad", "Marquez", true);
        libro3.mostrarInfo();

        System.out.println();
        Vuelo vuelo1 = new Vuelo();
        vuelo1.mostrarInfo();
        vuelo1.embarcar(54);
        vuelo1.desembarcar(23);

        System.out.println();
        Vuelo vuelo2 = new Vuelo("AV9401", "Bogotá", "Cartagena");
        vuelo2.mostrarInfo();
        vuelo2.embarcar(44);
        vuelo2.desembarcar(11);

        System.out.println();
        Vuelo vuelo3 = new Vuelo("SB2300","Miami","Ciudad de mexico", 200, 267);
        vuelo3.mostrarInfo();
        vuelo3.embarcar(67);
        vuelo3.desembarcar(12);


        DepositoAgua tanquePrincipal = new DepositoAgua(57.12, 13.67);
        DepositoAgua tanqueSecundario = new DepositoAgua(55.12, 1.2);

        tanquePrincipal.setDepositoDesborde(tanqueSecundario);

        System.out.println("\nTanque principal:");
        tanquePrincipal.agregarAgua(63.2677);
        System.out.println();
        tanquePrincipal.mostrarEstado();

        System.out.println("\nTanque secundario:");
        tanqueSecundario.mostrarEstado();

        System.out.println("\nTanque Principal:");
        tanquePrincipal.quitarAgua(34.5555);
        tanquePrincipal.mostrarEstado();
    }
}
