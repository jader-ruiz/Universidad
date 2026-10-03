
import java.util.*;

public class EstaturaEstudiantes {
    int[] w;
    final int tam = 20;
    Scanner sc;
    int promedio;

    public EstaturaEstudiantes(){
        w = new int[tam];
    }

    public void leerEstatura(){
        System.out.println("Ingresa la estatura de cada estudiante (cm): ");
        sc = new Scanner(System.in);
        for(int i = 0; i < w.length; i++){
            System.out.print((i+1)+": ");
            w[i] = sc.nextInt();
        }
    }

    public void mostrarEstaturas(){
        System.out.println("Cada estatura: ");
        for(int i = 0; i < w.length; i++){
            System.out.println(i+": "+w[i]+"cm");
        }
    }

    public void promedioEstaturas(){
        int sumatoria = 0;
        for(int i = 0; i < w.length; i++){
            sumatoria += w[i];
        }
        promedio = sumatoria/w.length;

        System.out.println("El promedio de las estaturas ingresadas es de: "+promedio+"cm");
    }

    public void mayorPromedio(){
        int contador = 0;
        for(int i = 0; i < w.length; i++){
            if(w[i] > promedio){
                contador++;
            }
        }
        System.out.println("Cantidad de estaturas mayores al promedio: " + contador);
    }

    public void menorPromedio(){
        int contador = 0;
        for(int i = 0; i < w.length; i++){
            if(w[i] < promedio){
                contador++;
            }
        }
        System.out.println("Cantidad de estaturas menores al promedio: " + contador);
    }

    public static void main(String[] args) {
        EstaturaEstudiantes op = new EstaturaEstudiantes();
        op.leerEstatura();
        op.mostrarEstaturas();
        op.promedioEstaturas();
        op.mayorPromedio();
        op.menorPromedio();
    }
}
