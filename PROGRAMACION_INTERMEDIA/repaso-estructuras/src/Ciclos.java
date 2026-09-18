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
        sc.close();
    }

    public void forIntroduccion(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Iteracion: "+i);
        }
        sc.close();
    }

    public void tablaMultiplicar(){
        System.out.println("De qué número quieres la tabla?");
        int numero = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(numero+ " * "+ i+ " = "+ (numero*i));
        }
        sc.close();
    }

    public void matriz4x4(){
        for(int fila = 1; fila <= 4; fila++){
            for(int col = 1; col <= 4; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public void breakContinue(){
        for(int i = 1; i <= 10; i++){
            if(i == 5) break;
            System.out.print(i+" ");
        }
        System.out.println("\n");
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0) continue;
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args){
        Ciclos op = new Ciclos();
        op.breakContinue();
    }
}
