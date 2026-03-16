

import java.util.Scanner;

public class App {
    pu200blic static void main(String[] args) throws Exception {
    
    double salario;
    double novoSalario;
    double reajuste;
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o salário do funcionário: ");
    salario = scanner.nextDouble();

    reajuste = salario * 0.07;
    novoSalario = salario + reajuste;

    System.out.println("Salario antes do reajuste: " + salario);
    System.out.println("Valor do reajuste: " + reajuste);
    System.out.println("Salário após o reajuste: " + novoSalario);

    scanner.close();
    }
}
