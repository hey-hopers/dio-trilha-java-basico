import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        
        Cliente cliente = new Cliente();
        cliente.setNome(nomeCliente);
        
        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        System.out.print("Digite o valor para depósito na conta corrente: ");
        double valorDeposito = scanner.nextDouble();
        cc.depositar(valorDeposito);

        System.out.print("Digite o valor para transferência da conta corrente para a poupança: ");
        double valorTransferencia = scanner.nextDouble();
        cc.transferir(valorTransferencia, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        scanner.close();
    }
}