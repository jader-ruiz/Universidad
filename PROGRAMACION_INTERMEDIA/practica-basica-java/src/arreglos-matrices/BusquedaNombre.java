
import java.util.Scanner;

public class BusquedaNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nombresPacientes = new String[8];
        int posicion = 0;
        boolean encontrado = false;

        for (int i = 0; i < nombresPacientes.length; i++) {
            System.out.print((i+1)+". Introduzca el nombre: ");
            nombresPacientes[i] = sc.nextLine();
        }

        System.out.println("A que paciente desea encontrar: ");
        String nombre = sc.nextLine();

        for(int i = 0; i < nombresPacientes.length; i++){
            if(nombresPacientes[i].equalsIgnoreCase(nombre)) {
                posicion = i;
                encontrado = true;    
                break;
            }
        }

        if(encontrado){
            System.out.println(nombre+" Fue encontrado en la posicion: "+(posicion+1));
        }else{
            System.out.println(nombre+" no fue encontrado");
        }
    }
}
