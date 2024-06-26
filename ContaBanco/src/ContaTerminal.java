import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        String nomeCliente;
        int Numero;
        String Agencia;
        double Saldo;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Olá Cliente, insira seu nome: ");
            nomeCliente = scanner.nextLine().trim();
            if (nomeCliente.matches("[a-zA-Z\\s]+") && !nomeCliente.isEmpty()) {
                break;
            } else {
                System.out.println("Entrada inválida. Por favor, digite seu nome corretamente (somente letras e espaços).");
            }
        }

        while (true) {
            try {
                System.out.print("Digite o número da conta: ");
                Numero = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite números inteiros.");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Digite a agência: ");
            Agencia = scanner.nextLine().trim();
            if (!Agencia.isEmpty()) {
                break;
            } else {
                System.out.println("Entrada inválida. Por favor, inserir novamente.");
            }
        }

        while (true) {
            try {
                System.out.print("Digite o saldo: ");
                Saldo = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite apenas números decimais.");
                scanner.next();
            }
        }

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                           + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");
    }
}
