import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o saldo inicial: ");
        int saldo = scanner.nextInt();

        int opcao = 0;

        while (opcao != 4){
            System.out.println("Escolha uma opcao: \n 1 - Ver saldo \n 2 - Depositar \n 3 - Sacar \n 4 - Sair");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println(saldo);
                    break;

                case 2:
                    System.out.println("Insira o valor a ser depositado: ");
                    saldo += scanner.nextInt();
                    break;

                case 3:
                    System.out.println("Insira o valor a sacar: ");
                    saldo -= scanner.nextInt();
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Insira uma opcao valida");
            }
        }
    }
}