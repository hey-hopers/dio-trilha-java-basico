public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet navegador = new NavegadorInternet();
        ReprodutorMusical reprodutor = new ReprodutorMusical();

        // Testando funcionalidades do iPhone
        iphone.ligar();
        iphone.atender();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.iniciarCorreioVoz();

        // Conexões conforme indicado no diagrama
        System.out.println("\nConexões do iPhone:");
        telefone.ligar();
        iphone.atender();
        reprodutor.tocar();
        navegador.exibirPagina();
    }
}
