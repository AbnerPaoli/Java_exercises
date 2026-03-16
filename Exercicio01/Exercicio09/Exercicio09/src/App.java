import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        double preco;
        double valorPago;
        double troco;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        preco = scanner.nextDouble();

        System.out.println("Digite o valor pago: ");
        valorPago = scanner.nextDouble();

        troco = valorPago - preco;

        System.out.println("Valor do troco: " + troco);
        
        
        scanner.close();
    }
}
