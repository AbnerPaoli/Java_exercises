//Nome: Abner Juan de Paiva Oliveira
//Matricula: 1261946673
import java.util.Scanner;

public class App {
   public static void main(String[] args){

    double dolar;
    double real;

    final double cotacao = 4.95;
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor em dolar: ");
    dolar = scanner.nextDouble();
    
    real = dolar * cotacao;

    System.out.println("O valor convertido em real é: " + real);

    scanner.close();

   }
}
