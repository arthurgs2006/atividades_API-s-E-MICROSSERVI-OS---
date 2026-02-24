package ex18;

import java.util.HashMap;

public class Dicionario {

    private HashMap<String, String> mapa = new HashMap<>();

    public Dicionario() {
        mapa.put("casa", "house");
        mapa.put("carro", "car");
        mapa.put("livro", "book");
        mapa.put("mesa", "table");
        mapa.put("porta", "door");
    }

    public void traduzir(String palavra) {
        if (mapa.containsKey(palavra)) {
            System.out.println("Tradução: " + mapa.get(palavra));
        } else {
            System.out.println("Palavra não encontrada.");
        }
    }
}