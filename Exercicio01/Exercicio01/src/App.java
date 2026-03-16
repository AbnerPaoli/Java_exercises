//Nome: Abner Juan de Paiva Oliveira
//Matricula: 1261946673
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double numero1;
        double numero2;

        Scanner scanner = new Scanner(System.in);

       System.out.println( "Digite o primeiro número:");
       numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        numero2 = scanner.nextDouble();

        System.out.println("Adição: "+(numero1 + numero2));
        System.out.println("Subtração: "+(numero1 - numero2));
        System.out.println("Multiplicação: "+(numero1 * numero2));
        System.out.println("Divisão: "+(numero1 / numero2));

        scanner.close();




    }
}
