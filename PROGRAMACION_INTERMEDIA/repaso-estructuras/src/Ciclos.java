import java.util.Scanner;

public class Ciclos {
    Scanner sc = new Scanner(System.in);
    public void Menu(){
        int opcion;

        do{
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Farmear Aura");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("\nHola jejej");
            }else if(opcion == 2){
                System.out.println("\nChao jujuj");
            }else if(opcion == 3){
                System.out.println("\n+1000 Aura");
            }else{
                if(opcion == 0){
                    continue;
                }
                System.out.println("\nNumero incorrecto.");
            }
        }while(opcion != 0);
    }
    public static void main(String[] args){
        Ciclos op = new Ciclos();
        op.Menu();
    }
}
