package ex19;

import java.util.HashMap;

public class ContadorPalavras {

    public void contar(String texto) {

        HashMap<String, Integer> mapa = new HashMap<>();

        String[] palavras = texto.toLowerCase().split("\\s+");

        for (String palavra : palavras) {
            mapa.put(palavra, mapa.getOrDefault(palavra, 0) + 1);
        }

        for (String chave : mapa.keySet()) {
            System.out.println(chave + " = " + mapa.get(chave));
        }
    }
}