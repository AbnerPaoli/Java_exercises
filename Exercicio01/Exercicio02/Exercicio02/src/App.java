//Nome: Abner Juan de Paiva Oliveira
//Matricula: 12619466
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int X;
        int Y;

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Digite X:");
        X = Scanner.nextInt();

        System.out.println("Digite Y:");
        Y = Scanner.nextInt();

        System.out.println("O resto da divisão de " + X + " por " + Y + " é: " + (X % Y));

        Scanner.close();
    }
}
