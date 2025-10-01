import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o saldo inicial: R$ ");
        double saldo = scanner.nextDouble();

        int opcao = 0;

        while (opcao != 4){
            System.out.println("Escolha uma opcao: \n 1 - Ver saldo \n 2 - Depositar \n 3 - Sacar \n 4 - Sair");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Seu saldo atual é: R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Insira o valor a ser depositado: R$ ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor inválido!");
                    }
                    break;

                case 3:
                    System.out.print("Insira o valor a sacar: R$ ");
                    double saque = scanner.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saque inválido! Saldo insuficiente ou valor negativo.");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando... Obrigado por usar o sistema!");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
        scanner.close();
    }
}