public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void ligar(String numero) {
        System.out.printf("Ligando para %s", numero);
    }

    @Override
    public void atender(String numero) {
        System.out.printf("Atendendo %s", numero);
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.printf("Exibindo página na url: [%s]", url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina(String url) {
        System.out.printf("Atualizando a página...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando!!!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando!!!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música -> []");
    }
}
