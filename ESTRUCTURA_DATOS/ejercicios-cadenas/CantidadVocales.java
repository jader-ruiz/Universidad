import java.util.Scanner;

public class CantidadVocales {
    String frase = "";


    public void leerFrase(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba: ");
        frase = sc.nextLine();
    }

    public int contarVocales(){
        int contador = 0;
        for(int i = 0;i < frase.length(); i++){
            if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u'){
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        CantidadVocales op = new CantidadVocales();

        op.leerFrase();
        int a = op.contarVocales();
        
        
        if(a == 0){
            System.out.println("No hubo vocales");
        }else{
            System.out.println("Hubo "+a+" vocales");
        }
    }
}
