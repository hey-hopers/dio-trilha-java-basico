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
