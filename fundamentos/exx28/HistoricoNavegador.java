package ex28;

import java.util.LinkedList;

public class HistoricoNavegador {

    private LinkedList<String> historico = new LinkedList<>();
    private int indiceAtual = -1;

    public void visitar(String url) {
        while (historico.size() > indiceAtual + 1) {
            historico.removeLast();
        }

        historico.add(url);
        indiceAtual++;
    }

    public void voltar() {
        if (indiceAtual > 0) {
            indiceAtual--;
            System.out.println("Voltando para: " + historico.get(indiceAtual));
        } else {
            System.out.println("Não há página anterior.");
        }
    }

    public void avancar() {
        if (indiceAtual < historico.size() - 1) {
            indiceAtual++;
            System.out.println("Avançando para: " + historico.get(indiceAtual));
        } else {
            System.out.println("Não há próxima página.");
        }
    }
}