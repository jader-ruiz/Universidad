import java.util.Scanner;
public class Array {
    Scanner sc = new Scanner(System.in);

    public void arrayIntroduccion(){
        int[] notas = new int[5];

        notas[0] = 85;
        notas[1] = 90;
        notas[2] = 78;
        notas[3] = 92;
        notas[4] = 88;

        int[] edades = {18, 20, 22, 19, 21};

        System.out.println(notas[0]);

        for(int i = 0; i < notas.length; i++){
            System.out.println("Nota "+ (i+1)+ ": "+ notas[i]);
        }

        System.out.println("");

        for(int nota : notas){
            System.out.print(nota+ " ");
        }
    }

    public void promedioGrupo(){
        System.out.print("Cuántos estudiantes hay? ");
        int n = sc.nextInt();

        double[] notas = new double[n];
        double suma = 0;

        for(int i = 0; i < n; i++){
            System.out.println("Nota del estudiante: "+ (i+1)+ ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }

        double promedio = suma/n;
        System.out.println("El promedio del grupo: " + promedio);

        sc.close();

    }

    public static void main(String[] args) {
        Array op = new Array();
        op.promedioGrupo();
    }
}
