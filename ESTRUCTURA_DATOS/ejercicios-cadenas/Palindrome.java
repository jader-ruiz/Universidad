
import java.util.Scanner;


public class Palindrome {
    
    public String invertirCadena(String palabra){
        String invertida = "";
        for(int i = palabra.length()-1; i >= 0; i--){
            invertida += palabra.charAt(i);
        }
        return invertida;
    }

    public boolean esPalindrome(String palabra,String invertida){
        if(palabra.equalsIgnoreCase(invertida)){
            return true;
        }else
            return false;
    }

    public static void main(String[] args) {
        Palindrome op = new Palindrome();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite palabra: ");
        String palabra = sc.nextLine();
        String invertida = op.invertirCadena(palabra);
        op.invertirCadena(palabra);
        op.esPalindrome(palabra, invertida);

        if (op.esPalindrome(palabra, invertida)) {
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }

        sc.close();

    }



}
