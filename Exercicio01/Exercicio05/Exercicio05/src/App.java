import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        double base;
        double altura;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do retângulo (em cm)");
        base = scanner.nextDouble();

        System.out.println("Digite a altura do retângulo (em cm)");
        altura = scanner.nextDouble();

        area = base * altura;

        System.out.println("Área do retângulo:"+area+"cm²");

        scanner.close();
    
    }
}
