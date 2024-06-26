# ContaBanco

## Visão Geral do Projeto

O projeto `ContaBanco` é uma aplicação Java simples que simula o processo de criação de uma conta bancária, coletando entradas do usuário através do terminal. O usuário é solicitado a inserir detalhes da conta, como número da conta, agência, nome e saldo. Uma vez inseridos todos os detalhes, a aplicação exibe uma mensagem de boas-vindas formatada com as informações da conta do usuário.

### Funcionalidades

- Coleta entrada do usuário para detalhes da conta
- Valida a entrada do usuário para garantir sua corretude
- Exibe uma mensagem de boas-vindas formatada com os detalhes da conta do usuário

### Atributos

O projeto utiliza os seguintes atributos para a conta bancária:

| Atributo      | Tipo    | Exemplo      |
|---------------|---------|--------------|
| Numero        | Inteiro | 1021         |
| Agencia       | String  | 067-8        |
| Nome Cliente  | String  | MARIO ANDRADE |
| Saldo         | Decimal | 237.48       |

### Como Executar

1. Abra o projeto no Visual Studio Code.
2. Verifique se você tem o Java Development Kit (JDK) instalado.
3. Abra o terminal no VS Code.
4. Navegue até a pasta `src`.
5. Compile o arquivo `ContaTerminal.java` usando o comando:
   ```bash
   javac ContaTerminal.java

