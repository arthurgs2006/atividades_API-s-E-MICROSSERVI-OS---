package ex16;

import java.util.TreeSet;

public class NomesOrdenados {

    private TreeSet<String> nomes = new TreeSet<>();

    public void adicionar(String nome) {
        nomes.add(nome);
    }

    public void mostrar() {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}