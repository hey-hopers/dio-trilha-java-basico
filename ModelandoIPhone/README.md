# Projeto iPhone

## Visão Geral do Projeto

O projeto `iPhone` em Java simula um conjunto de funcionalidades encontradas em um iPhone, utilizando classes e métodos para representar operações típicas de um dispositivo móvel. O objetivo é demonstrar a implementação de funcionalidades como reprodução de música, navegação na internet e operações telefônicas básicas.

### Funcionalidades

- Reproduzir música
- Pausar música
- Selecionar música para reprodução
- Exibir páginas na internet
- Adicionar novas abas no navegador
- Atualizar páginas no navegador
- Ligar o dispositivo
- Atender chamadas telefônicas
- Iniciar correio de voz

## Classes Implementadas

- **iPhone**: Implementa todas as funcionalidades principais do dispositivo.
- **AparelhoTelefonico**: Representa funcionalidades relacionadas a operações telefônicas.
- **NavegadorInternet**: Fornece métodos para navegar na internet.
- **ReprodutorMusical**: Permite a reprodução, pausa e seleção de músicas.

## Como Executar

Para executar o projeto `iPhone`:

1. Abra o projeto no seu ambiente de desenvolvimento Java.
2. Certifique-se de ter o Java Development Kit (JDK) instalado.
3. Compile o projeto para garantir que todas as classes estejam compiladas corretamente.
4. Execute a classe `Main` para testar as funcionalidades implementadas.

##


# Diagrama:

### iPhone

- tocar()
- pausar()
- selecionarMusica()
- ligar()
- atender()
- iniciarCorreioVoz()
- exibirPagina()
- adicionarNovaAba()
- atualizarPagina()

##

### AparelhoTelefonico

- ligar()
- atender()
- iniciarCorreioVoz()

##

### NavegadorInternet

- exibirPagina()
- adicionarNovaAba()
- atualizarPagina()

##

### ReprodutorMusical

- tocar()           
- pausar()          
- selecionarMusica()

##

### Conexões

- iPhone -> AparelhoTelefonico
- iPhone -> ReprodutorMusical
- iPhone -> NavegadorInternet

##