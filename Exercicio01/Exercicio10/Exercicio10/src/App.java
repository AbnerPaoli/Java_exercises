import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double distancia;
        double velocidade;
        double tempoHoras;

        int horas;
        int minutos;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Distância (km):");
        distancia = scanner.nextDouble();

        System.out.println("Velocidade média (km/h):");
        velocidade = scanner.nextDouble();

        tempoHoras = distancia / velocidade;

        horas = (int) tempoHoras;
        minutos = (int) ((tempoHoras - horas) * 60);

        System.out.println("Tempo estimado: " + horas + " horas e " + minutos + " minutos");

        scanner.close();
    }
}