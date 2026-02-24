package ex12;

import java.util.ArrayList;

public class BuscaCidade {

    private ArrayList<String> cidades = new ArrayList<>();

    public BuscaCidade() {
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");
        cidades.add("Curitiba");
        cidades.add("Salvador");
    }

    public void buscar(String nome) {
        if (cidades.contains(nome)) {
            int indice = cidades.indexOf(nome);
            System.out.println("Cidade encontrada no índice: " + indice);
        } else {
            System.out.println("Cidade não encontrada.");
        }
    }
}