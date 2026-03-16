import java.util.Scanner; 

public class App {
    public static void main(String[] args) {

        double celsius;
        double fahrenheit;
        double kelvin;
     
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius:");
        celsius = scanner.nextDouble();

        fahrenheit = (celsius * 9/5) + 32;
        kelvin = celsius + 273.15;

        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        System.out.println("Temperatura em Kelvin: " + kelvin);
        
        scanner.close();
    }
}