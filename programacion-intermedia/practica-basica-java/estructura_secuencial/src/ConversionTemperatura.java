import java.util.*;
public class ConversionTemperatura{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca los grados celsius para pasarlos a F Y K: ");
        double c = sc.nextDouble();

        double f = (c * 9/5) + 32;
        double k = c + 273.15;

        System.out.println("Celsius: "+c+" °C");
        System.out.println("Fahrenheit: "+f+" °F");
        System.out.println("Kelvin: "+k+" K");
    }
}