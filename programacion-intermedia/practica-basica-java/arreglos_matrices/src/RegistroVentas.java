
import java.util.Scanner;

public class RegistroVentas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] sucursal = new int[4][3];
        int sumaFila1 = 0;
        int sumaFila2 = 0;
        int sumaFila3 = 0;
        int sumaFila4 = 0;

        int sumaCol1 = 0;
        int sumaCol2 = 0;
        int sumaCol3 = 0;

        for (int i = 0; i < sucursal.length; i++) {
            for (int j = 0; j < sucursal[i].length; j++) {
                System.out.print("Ingrese la venta del producto "+(j+1)+" en la sucursal "+(i+1)+": ");
                sucursal[i][j] = sc.nextInt();
            }
        }


        int mayor = sucursal[0][0];
        int columna = 0;
        int posicionF = 0;
        int posicionC = 0;
        for(int i = 0; i < sucursal.length; i++){
            for(int j = 0; j < sucursal[i].length; j++){
                if (i == 0) { 
                    sumaFila1 += sucursal[i][j];
                }else if(i == 1){
                    sumaFila2 += sucursal[i][j];
                }else if(i == 2){
                    sumaFila3 += sucursal[i][j];
                }else if(i == 3){
                    sumaFila4 += sucursal[i][j];
                }else if(i == 4){
                    sumaFila4 += sucursal[i][j];
                }
                
                if(mayor < sucursal[i][j]){
                    mayor = sucursal[i][j];
                    posicionF = i;
                    posicionC = j;
                }
                
            }
            if(columna == 0){
                sumaCol1 += sucursal[i][columna];
            }else if(columna == 1){
                sumaCol2 += sucursal[i][columna];
            }else if(columna == 2){
                sumaCol3 += sucursal[i][columna];
            }

            if(columna == 2){
                columna = 0;
            }
            columna++;
        }

        
        System.out.println("--- Ventas por sucursal ---");
        System.out.println("Sucursal 1: $ "+sumaFila1);
        System.out.println("Sucursal 2: $ "+sumaFila2);
        System.out.println("Sucursal 3: $ "+sumaFila3);
        System.out.println("Sucursal 4: $ "+sumaFila4);
        System.out.println("\n");
        System.out.println("--- Ventas por producto ---");
        System.out.println("Producto 1: $ "+sumaCol1);
        System.out.println("Producto 2: $ "+sumaCol2);
        System.out.println("Producto 3: $ "+sumaCol3);
        System.out.println("\n");
        System.out.printf("Venta mas alta: $ %d (Sucursal %d, Producto %d)",mayor,posicionF,posicionC);

        // Estuvo confuso, pero se logró jajaj


    }
}