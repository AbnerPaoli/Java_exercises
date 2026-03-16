import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        double nota1;
        double nota2;
        double nota3;
        double media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2: ");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a nota 3: ");
        nota3 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Média: %.2f",media);

        scanner.close();
        
    }
}
