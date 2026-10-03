class App{

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setTitulo("Cien años de soledad.");
        libro1.setAutor("Marquez");
        libro1.mostrarInfo();
        libro1.prestar();
        libro1.devolver();

        System.out.println("\n");
        Libro libro2 = new Libro();
        libro2.setAutor("Jader");
        libro2.setTitulo("La odisea");
        libro2.mostrarInfo();
        libro2.prestar();
        libro2.devolver();

        System.out.println();
        Vuelo vuelo1 = new Vuelo();
        vuelo1.setNumero("AV9401");
        vuelo1.setOrigen("Bogota");
        vuelo1.setDestino("Cartagena");
        vuelo1.setCapacidadMaxima(200);
        vuelo1.setOcupacion(152);
        vuelo1.mostrarInfo();
        vuelo1.embarcar(57);
        vuelo1.desembarcar(151);

        System.out.println();
        Vuelo vuelo2 = new Vuelo();
        vuelo2.setNumero("AV9402");
        vuelo2.setOrigen("Bogota");
        vuelo2.setDestino("Medellin");
        vuelo2.setCapacidadMaxima(200);
        vuelo2.setOcupacion(152);
        vuelo2.mostrarInfo();
        vuelo2.embarcar(21);
        vuelo2.desembarcar(42);


        System.out.println("\nTanque principal: ");
        DepositoAgua tanquePrincipal = new DepositoAgua();
        DepositoAgua tanqueSecundario = new DepositoAgua();

        tanquePrincipal.setDepositoDesborde(tanqueSecundario);

        tanquePrincipal.setCapacidad(120.5);
        tanquePrincipal.setVolumenActual(56.21);
        tanquePrincipal.mostrarEstado();

        tanqueSecundario.setCapacidad(89.6);
        tanqueSecundario.setVolumenActual(2.1);

        System.out.println("\nTanque principal:");

        tanquePrincipal.agregarAgua(94.55);
        tanquePrincipal.mostrarEstado();

        System.out.println("\nTanque secundario:");
        
        tanqueSecundario.mostrarEstado();

        System.out.println("\nTanque Principal:");

        tanquePrincipal.quitarAgua(12.9);
        tanquePrincipal.mostrarEstado();    
        
        


    }
}
