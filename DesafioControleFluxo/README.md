# DesafioControleFluxo

## Visão Geral do Projeto

O projeto `DesafioControleFluxo` é uma aplicação Java simples que recebe dois números inteiros via terminal e realiza a impressão de números incrementados com base na diferença entre esses dois valores. Se o primeiro número for maior que o segundo, uma exceção personalizada é lançada.

### Funcionalidades

- Recebe dois parâmetros inteiros via terminal.
- Valida se o primeiro parâmetro é maior que o segundo.
- Lança uma exceção personalizada se a validação falhar.
- Imprime números incrementados com base na diferença entre os dois parâmetros.

### Exceções Personalizadas

O projeto define a seguinte exceção personalizada:

| Exceção                      | Descrição                                           |
|------------------------------|-----------------------------------------------------|
| `ParametrosInvalidosException` | Lançada quando o primeiro parâmetro é maior que o segundo. |

### Como Executar

1. Abra o projeto no seu IDE Java de preferência (por exemplo, IntelliJ IDEA ou Eclipse).
2. Verifique se você tem o Java Development Kit (JDK) instalado.
3. Compile os arquivos Java `Contador.java` e `ParametrosInvalidosException.java`.
4. Execute a classe `Contador` para iniciar a aplicação.

### Estrutura do Projeto

O projeto consiste em duas classes principais:

#### `ParametrosInvalidosException.java`

```java
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

```java
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}