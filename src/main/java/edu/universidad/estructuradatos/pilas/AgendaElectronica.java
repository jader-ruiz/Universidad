package edu.universidad.estructuradatos.pilas;

import java.util.Scanner;

public class AgendaElectronica{
    private Estudiante[] agendaE;
    private final int tope = 10;
    private int cima;
    private static final Scanner sc = new Scanner(System.in);

    public AgendaElectronica(){
        this.cima = -1;
        agendaE = new Estudiante[tope];
    }

    public void menu(){
        int bp = 0;
        
        do{
            System.out.println("1. Apilar Usuario");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Desapilar");
            System.out.println("4. Buscar usuario por codigo");
            System.out.println("5. Modificar usuario por codigo");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            bp = sc.nextInt();

            switch (bp) {
                case 1:
                    System.out.print("\nCodigo: ");
                    String a = sc.nextLine();
                    String codigo = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    System.out.print("Promedio: ");
                    double promedio = sc.nextDouble();
                    
                    Estudiante nuevoEstudiante = new Estudiante(codigo, nombre, apellido, edad, promedio);

                    apilarEstudiante(nuevoEstudiante);

                    break;
                case 2: 
                    mostrar();
                    break;
                case 3:
                    desapilar();
                    break;
                case 4:
                    System.out.print("\nIngrese el codigo del usuario que desea buscar: ");
                    a = sc.nextLine();
                    String codigoBuscar = sc.nextLine();
                    busqueda(codigoBuscar);
                    break;
                case 5:
                    System.out.print("\nIngrese el codigo del estudiante que desea modificar la informacion: ");
                    a = sc.nextLine();
                    codigoBuscar = sc.nextLine();
                    modificarEstudiante(codigoBuscar);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Numero invalido!");
                    break;
            }
        }while(bp != 0);
        
    }

    public void apilarEstudiante(Estudiante a){
        if(!(llena())){
            if(cima == -1){
                cima = 0;
                agendaE[cima] = a;
                System.out.println("\nSe apilo correctamente!\n");
            }else if(cima >= 0){
                cima++;
                agendaE[cima] = a;
                System.out.println("\nSe apilo correctamente!\n");
            }
        }else System.out.println("\nPila llena!\n");
    }

    public boolean llena(){
        if(cima == agendaE.length -1){
            return true;
        } else
            return false;
    }

    public void mostrar(){
        if(cima == -1){
            System.out.println("\nLa pila esta vacia...\n");
        }else{
            for (int i = agendaE.length-1; i >= 0; i--) {
                if(agendaE[i] == null){
                System.out.println("\nvacio");
                }else{
                    System.out.println();
                    System.out.println("Codigo: " + agendaE[i].getCodigo());
                    System.out.println("Nombre: " + agendaE[i].getNombre());
                    System.out.println("Apellido: " + agendaE[i].getApellido());
                    System.out.println("Edad: " + agendaE[i].getEdad());
                    System.out.println("Promedio: " + agendaE[i].getPromedio());
                    System.out.println();
                }
                
            }
        }
    }

    public void desapilar(){
        if(!(cima == -1)){
            agendaE[cima] = null;
            cima--;
            System.out.println("\nSe desapilo correctamente!\n");
        } else System.out.println("\nLa pila se encuentra vacia\n");
    }

    public void busqueda(String codigo){
        boolean encontrado = false;
        for(int i = agendaE.length-1; i >= 0; i--){
            if(!(agendaE[i] == null)){
                if(agendaE[i].getCodigo().equalsIgnoreCase(codigo)){
                    encontrado = true;
                    break;
                }
            }
        }
        if(encontrado) System.out.println("\nEl usuario con el codigo "+ codigo.toLowerCase()+" se encuentra registrado en el grupo...\n");
            else System.out.println("No se encontro al usuario!"); 
        
    }

    public void modificarEstudiante(String codigo){

        boolean encontrado = false;
        for(int i = agendaE.length-1; i >= 0; i--){
            if(!(agendaE[i] == null)){
                if(agendaE[i].getCodigo().equalsIgnoreCase(codigo)){
                    int bp = 0;
                    encontrado = true;
                    do { 
                        System.out.println("\nQue informacion desea modificar del estudiante?");
                        System.out.println("1. Codigo"); 
                        System.out.println("2. Nombre");
                        System.out.println("3. Apellido");
                        System.out.println("4. Edad");
                        System.out.println("5. Promedio");
                        System.out.println("0. Salir");
                        bp = sc.nextInt();

                        String cambioStr;
                        int cambioEntero;
                        double cambioReal;

                        switch (bp) {
                            case 1:
                                System.out.print("\nCodigo nuevo: ");
                                String a = sc.nextLine();
                                cambioStr = sc.nextLine();
                                agendaE[i].setCodigo(cambioStr);
                                break;
                            case 2:
                                System.out.print("\nNombre nuevo: ");
                                a = sc.nextLine();
                                cambioStr = sc.nextLine();
                                agendaE[i].setNombre(cambioStr);
                                break;
                            case 3:
                                System.out.print("\nApellido nuevo: ");
                                a = sc.nextLine();
                                cambioStr = sc.nextLine();
                                agendaE[i].setApellido(cambioStr);
                                break;
                            case 4:
                                System.out.print("\nEdad nueva: ");
                                a = sc.nextLine();
                                cambioEntero = sc.nextInt();
                                agendaE[i].setEdad(cambioEntero);
                                break;
                            case 5:
                                System.out.println("\nPromedio nuevo: ");
                                a = sc.nextLine();
                                cambioReal = sc.nextDouble();
                                agendaE[i].setPromedio(cambioReal);
                                break;
                            default:
                                if(bp != 0) System.out.println("\nNumero invalido!");
                                break;
                        }

                    } while (bp != 0);
                    break;
                }
                
            }
        }
        if(!encontrado) System.out.println("No se encontro al estudiante por el codigo...");
    }

}