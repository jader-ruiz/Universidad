public class Condicional{
    public static void main(String[] args) {
        int nota = 75;
        if(nota >= 90){
            System.out.println("Excelente");
        }else if(nota >= 70){
            System.out.println("Bueno");
        }else if(nota >= 60){
            System.out.println("Apropado");
        }else{
            System.out.println("Reprobado");
        }

        int edad = 18;
        if (edad >= 18){
            System.out.println("Mayor de edad");
        }
        String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad"; // If ternario
    }
}