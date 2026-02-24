package ex28;

public class Main {
    public static void main(String[] args) {

        HistoricoNavegador navegador = new HistoricoNavegador();

        navegador.visitar("google.com");
        navegador.visitar("youtube.com");
        navegador.visitar("github.com");

        navegador.voltar();
        navegador.voltar();
        navegador.avancar();
    }
}