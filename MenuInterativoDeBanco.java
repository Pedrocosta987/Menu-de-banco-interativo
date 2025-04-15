import java.util.Scanner;

public class MenuInterativoDeBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        double saldo = 2000.0;

        do {
            System.out.println("***** Menu interativo *****");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atual é de: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite um valor para ser depositado: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado!");
                    System.out.println("Seu saldo atual é de: " + saldo);
                    break;
                case 3:
                    System.out.println("Digite um valor a ser sacado: ");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado!");
                        System.out.println("O seu saldo atual é de: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do menu...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
        scanner.close();
    }
}