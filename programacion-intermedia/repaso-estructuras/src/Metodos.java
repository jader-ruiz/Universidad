public class Metodos {
    public static void saludar(){
        System.out.println("Holas");
    }
    public static void saludarA(String nombre){
        System.out.println("Hola "+ nombre);
    }

    public static double calcularArea(double base, double altura){
        return base * altura;
    }

    public static void main(String[] args){
        saludar();
        saludarA("Jader");
        double area = calcularArea(3.5, 5.1);
        System.out.println("Area: "+ area);
    }
}
