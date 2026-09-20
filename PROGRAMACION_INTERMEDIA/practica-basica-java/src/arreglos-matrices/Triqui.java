
import java.util.Scanner;

public class Triqui{
    public static void main(String[] args) {
        char[][] triqui = new char[3][3];
        Scanner sc = new Scanner(System.in);
        int fila = 0;
        int columna = 0;
        int jugador = 1;
        boolean seguir = true;
        boolean casillaOcupada = true;

        for (int i = 0; i < triqui.length; i++) {
            for (int j = 0; j < triqui[i].length; j++) {
                triqui[i][j] = ' ';
            }
        }

        while (seguir) { 
            if(jugador == 1){
                while(casillaOcupada){

                    System.out.println("(FILA 0 - 2) Jugador "+jugador+":  ");
                    fila = sc.nextInt();
                    while(fila > 2 || fila < 0){
                        System.out.println("(FILA) Jugador "+jugador+":  ");
                        fila = sc.nextInt();
                    }

                    System.out.println("(COLUMNA 0 - 2) Jugador "+jugador+":  ");
                    columna = sc.nextInt();
                    while(columna > 2 || columna < 0){
                        System.out.println("(COLUMNA) Jugador "+jugador+":  ");
                        columna = sc.nextInt();
                    }

                    if(triqui[fila][columna] != ' '){
                        System.out.println("Casilla ocupada.");
                        continue;
                    }else{
                        triqui[fila][columna] = 'X';
                        casillaOcupada = false;
                    }
                }

                System.out.println("\n");
                for (int i = 0; i < triqui.length; i++) {
                    for (int j = 0; j < triqui[i].length; j++) {
                        if(j == triqui.length-1){
                            System.out.print(triqui[i][j]);
                        }else{
                            System.out.print(triqui[i][j]+" | ");
                        }
                        
                    }
                    System.out.println();
                    System.out.println("---------");
                }
                System.out.println("\n");

                // Si jugador == 1 le pasa 'X', de lo contrario le pasa 'O'
                char ficha = (jugador == 1) ? 'X' : 'O';

                if(hayGanador(triqui, ficha)){
                    System.out.println("Jugador "+jugador+" ganó la partida de triqui");
                    seguir = false;
                    continue;
                }

                if(tableroLleno(triqui)){
                    System.out.println("Empate.");
                    seguir = false;
                    continue;
                }

                jugador++;
                casillaOcupada = true;
    
            }else{
                while(casillaOcupada){

                    System.out.println("(FILA 0 - 2) Jugador "+jugador+":  ");
                    fila = sc.nextInt();
                    while(fila > 2 || fila < 0){
                        System.out.println("(FILA) Jugador "+jugador+":  ");
                        fila = sc.nextInt();
                    }

                    System.out.println("(COLUMNA 0 - 2) Jugador "+jugador+":  ");
                    columna = sc.nextInt();
                    while(columna > 2 || columna < 0){
                        System.out.println("(COLUMNA) Jugador "+jugador+":  ");
                        columna = sc.nextInt();
                    }

                    if(triqui[fila][columna] != ' '){
                        System.out.println("Casilla ocupada.");
                        continue;
                    }else{
                        triqui[fila][columna] = 'O';
                        casillaOcupada = false;
                    }
                }
                System.out.println("\n");
                for (int i = 0; i < triqui.length; i++) {
                    for (int j = 0; j < triqui[i].length; j++) {
                        if(j == triqui.length-1){
                            System.out.print(triqui[i][j]);
                        }else{
                            System.out.print(triqui[i][j]+" | ");
                        }
                    }
                    System.out.println();
                    System.out.println("---------");
                }
                System.out.println("\n");
                char ficha = (jugador == 1) ? 'X' : 'O';

                if(hayGanador(triqui, ficha)){
                    System.out.println("Jugador "+jugador+" ganó la partida de triqui");
                    seguir = false;
                    continue;
                }
                
                jugador--;
                casillaOcupada = true;
            }


        }
            

    }


    public static boolean hayGanador(char[][] matriz, char jugador) { // AYUDA DE LA IA
        // 1. Verificar Filas y Columnas
        for (int i = 0; i < 3; i++) {
            // Comprobar Fila i completa
            if (matriz[i][0] == jugador && matriz[i][1] == jugador && matriz[i][2] == jugador) {
                return true;
            }
            // Comprobar Columna i completa
            if (matriz[0][i] == jugador && matriz[1][i] == jugador && matriz[2][i] == jugador) {
                return true;
            }
        }

        // 2. Comprobar Diagonal Principal (\)
        if (matriz[0][0] == jugador && matriz[1][1] == jugador && matriz[2][2] == jugador) {
            return true;
        }

        // 3. Comprobar Diagonal Inversa (/)
        if (matriz[0][2] == jugador && matriz[1][1] == jugador && matriz[2][0] == jugador) {
            return true;
        }

        return false;
    }

    public static boolean tableroLleno(char[][] matriz) { // AYUDA DE LA IA
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == ' ') {
                    return false; // Encontró al menos una casilla libre
                }
            }
        }
        return true; // No hay casillas vacías
    }
}

// Muy facil...