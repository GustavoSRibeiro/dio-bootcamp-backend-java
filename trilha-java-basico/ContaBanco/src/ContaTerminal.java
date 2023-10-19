import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Conta!");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agencia!");
        agencia = scanner.next();
        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = scanner.next();
        System.out.println("Por favor, digite o saldo da conta!");
        saldo = scanner.nextDouble();

        ContaBanco conta = new ContaBanco(numero, agencia, nomeCliente, saldo);

        System.out.println(conta);
        scanner.close();
    }
}
