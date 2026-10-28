import java.util.Scanner;
public class Pila1{
    static int TOPE = 10;
    int[] v;
    int cima;
    static Scanner sc = new Scanner(System.in);
    

    public Pila1(){
        v = new int[TOPE];
        cima = -1;
        
    }

    public static void main(String[] args) {
        int num;
        Pila1 ps = new Pila1();
        
        do{
            System.out.println("Menu principal");
            System.out.println("1. Ingresar Dato a la Pila");
            System.out.println("2. Eliminar Dato de la Pila");
            System.out.println("3. Mostrar Dato en la Pila");
            System.out.println("4. Salir");
            System.out.print("Digite una opción: ");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    ps.apilar();
                    break;
                case 2:
                    ps.desapilar();
                    break;
                case 3:
                    ps.imprimir();
                    break;
                case 4: 
                    System.exit(0);
                    break;
                default:
                    System.out.println("Numero incorrecto.");

                    break;
            }
        }while(num != 4);
    }

    public void apilar(){
        int dato;
        System.out.println("Elemento de la Pila: ");
        dato = sc.nextInt();
        if(llena()){
            System.out.println("La pila se encuentra llena");
        }else{
            if(cima == -1){
                cima = 0;
                v[cima] = dato;
                System.out.println("Se apilo correctamente!\n");
            }else{
                cima++;
                v[cima] = dato;
                System.out.println("Se apilo correctamente!\n");
            }
        }
    }

    public boolean llena(){
        if(cima == v.length -1){
            return true;
        } else
            return false;
    }


    public void desapilar(){
        if(!vacia()){
            
            v[cima] = 0;
            cima --;
            System.out.println("Se desapilo correctamente!\n");
        } else
            System.out.println("La pila se encuentra vacia");
    }

    public boolean vacia(){
        if(cima == 1){
            return true;
        } else
            return false;
    }

    public void imprimir(){
        String salida = "Elementos de salida:\n";
        for(int i = TOPE - 1; i > -1; i--){
            salida += v[i] + "\n";
        }
        System.out.println(salida);
    }
}
