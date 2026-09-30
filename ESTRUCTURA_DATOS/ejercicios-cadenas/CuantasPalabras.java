import java.util.Scanner;

class CuantasPalabras{
    String frase = "";
    int contador = 0;

    public void leerFrase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su frase: ");
        frase = sc.nextLine().strip();
    }

    public int contarPalabras(){
        
        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == ' '){
                contador++;
            }
            if(i == frase.length()-1){
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        CuantasPalabras op = new CuantasPalabras();

        op.leerFrase();
        int contador = op.contarPalabras();

        if(contador == 0){
            System.out.println("No se encontro ninguna palabra");
        }else if(contador == 1){
            System.out.println("Hubo "+contador+" palabra");
        }else{
            System.out.println("Hubo "+contador+" palabras");
        }
    }
}