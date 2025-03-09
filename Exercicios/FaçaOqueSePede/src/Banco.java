import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numConta, opcao;
        String nomeTitular;
        double saldo, real;

        System.out.println("Bem-vindo ao sistema bancário!");
        System.out.print("Digite o nome to titular: ");

        nomeTitular = scanner.nextLine();
        numConta = (int) (Math.random() * 10000);
        saldo = 0.0;

        System.out.println("Conta criada com sucesso!");
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Número da conta: " + numConta);
        System.out.println("Saldo: " + saldo);

        System.out.println("Deseja Relizar uma ação bancaria?");
        System.out.println("1 - Sim | 2 - Não");
        opcao = scanner.nextInt();
        if(opcao == 1){
            do {
                System.out.println("------------------");
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Consultar Saldo");
                System.out.println("4 - Sair");
                System.out.println("------------------");
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o valor a ser Depositado: R$");
                        real = scanner.nextDouble();
                        if (real > 0){
                            saldo += real;
                            System.out.println("Depósito realizado com sucesso!");
                            System.out.println("Novo saldo: R$" + saldo);
                        } else {
                            System.out.println("Valor inválido!");
                        }
                        break;
                    case 2:
                        System.out.print("Digite o valor a ser Sacado: R$");
                        real = scanner.nextDouble();
                        if (real > 0 && real <= saldo){
                            saldo -= real;
                            System.out.println("Saque realizado com sucesso!");
                            System.out.println("Novo saldo: R$" + saldo);
                        } else if(real < 0){
                            System.out.println("Valor inválido!");
                        } else {
                            System.out.println("Saldo insuficiente!");
                        }
                        break;
                    case 3:
                        System.out.println("Saldo atual: R$" + saldo);
                        break;
                    case 4:
                        System.out.println("Obrigado por usar o sistema bancário. Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } while (opcao != 4);
        } else {
            System.out.println("Obrigado por usar o sistema bancário. Até logo!");
        }
        scanner.close();
    }
}