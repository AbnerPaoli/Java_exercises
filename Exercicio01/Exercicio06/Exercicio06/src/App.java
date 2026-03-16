//Nome: Abner Juan de Paiva Oliveira
//Matricula: 12619466
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        double distancia;
        double combustivel;
        double consumo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância percorrida (em km)");
        distancia = scanner.nextDouble();

        System.out.println("Digite a quantidade de combustível gasto (em litros)");
        combustivel = scanner.nextDouble();

        consumo = distancia / combustivel;

        System.out.println("Consumo médio do veículo: " + consumo + " km/l");

        scanner.close();
    }
}
