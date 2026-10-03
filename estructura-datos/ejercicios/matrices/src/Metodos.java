import java.util.Scanner;

public class Metodos {
    int[][] matriz;
    Scanner sc;
    
    public Metodos(){
        matriz = new int[5][5];
    }

    public void leerNumeros(){
        sc = new Scanner(System.in);
        System.out.println("Digite los numeros de la matriz: ");

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print("Fila "+(i+1)+". "+"Columna "+(j+1)+": ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public void mostrarMatriz(){
        System.out.println("\n");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void mostrarNumeroMenor(){
        int menor = matriz[0][0];
        int fila = 0;
        int columna = 0;
        System.out.println("\n");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(menor > matriz[i][j]){
                    menor = matriz[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        System.out.println("El numero menor encontrado en la matriz es: "+menor+" encontrado en la fila: "+(fila+1)+". Columna: "+ (columna+1));
    }

    public void mostrarDiagonal(){
        int apoyoFila = 0;
        int apoyoColumna = 0;
        System.out.println("\n");
        System.out.println("Numeros de la diagonal principal: ");
        for(int i = 0; i < matriz.length; i++){
            System.out.print(matriz[apoyoFila][apoyoColumna]+" ");
            apoyoFila++;
            apoyoColumna++;
        }
        System.out.println();

        
    }

    public void ordenarMatriz(){
        int[][] matrizOrdenada = new int[5][5];

        int[] plano = new int[matrizOrdenada.length * matrizOrdenada[0].length];

        int indice = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                plano[indice] = matriz[i][j];
                indice++;
            }
        }

        for (int i = 0; i < plano.length - 1; i++) {
            for (int j = 0; j < plano.length - 1 - i; j++) {
                if (plano[j] > plano[j + 1]) {
                    int auxiliar = plano[j];
                    plano[j] = plano[j + 1];
                    plano[j + 1] = auxiliar;
                }
            }
        }

        indice = 0;
        for (int i = 0; i < matrizOrdenada.length; i++) {
            for (int j = 0; j < matrizOrdenada[i].length; j++) {
                matrizOrdenada[i][j] = plano[indice];
                indice++;
            }
        }

        System.out.println("\n");
        for(int i = 0; i < matrizOrdenada.length; i++){
            for(int j = 0; j < matrizOrdenada[i].length; j++){
                System.out.print(matrizOrdenada[i][j]+" \t");
            }
            System.out.println();
        }
    }

    public void graficarAsteriscos() {
        int n = 7; 
        char[][] matriz = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = ' ';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || (i <= n / 2 && (i == j || j == n - 1 - i))) {
                    matriz[i][j] = '*';
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
    }
    
}
