
import java.util.Scanner;

public class EstadisticasGrupo{
    public static void main(String[] args) {
        double[] grupo = new double[10];
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        double mayor = 0;
        int posicionAlta = 0;
        

        double menor = 0;
        int posicionBaja = 0;

        int aprobaron = 0;

        for (int i = 0; i < grupo.length; i++) {
            double verificacion;
            boolean condicion = false;

            while(!condicion){
                System.out.print("Ingrese la nota del estudiante "+(i+1)+": ");
                verificacion = sc.nextDouble();
                if(verificacion > 5.0 || verificacion < 0.0){
                    System.out.println("Numero incorrecto. ");
                    
                }else{
                    grupo[i] = verificacion;
                    suma += grupo[i];
                    condicion = true;
                }
            }
            
        }
        double promedio = suma/grupo.length;

        mayor = grupo[0];
        menor = grupo[0];
        for (int i = 0; i < grupo.length-1; i++) {
            if(mayor < grupo[i+1]){
                mayor = grupo[i+1];
                posicionAlta = i+1;
            }

            if(menor > grupo[i+1]){
                menor = grupo[i+1];
                posicionBaja = i+1;
            }
            if(grupo[i] >= 3.0){
                aprobaron++;
            }
        }

        System.out.println("El promedio del grupo: "+promedio);
        System.out.println("La nota más alta es: "+mayor+" en la posicion: "+(posicionAlta+1));
        System.out.println("La nota más baja es: "+menor+" en la posicion: "+(posicionBaja+1));
        System.out.println(aprobaron+" estudiantes aprobaron la materia y "+(grupo.length-aprobaron)+" reprobaron");

    }
}