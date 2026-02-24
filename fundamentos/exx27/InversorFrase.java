package ex27;

import java.util.ArrayDeque;
import java.util.Deque;

public class InversorFrase {

    public String inverter(String frase) {

        Deque<String> pilha = new ArrayDeque<>();
        String[] palavras = frase.split(" ");

        for (String palavra : palavras) {
            pilha.push(palavra);
        }

        StringBuilder resultado = new StringBuilder();

        while (!pilha.isEmpty()) {
            resultado.append(pilha.pop()).append(" ");
        }

        return resultado.toString().trim();
    }
}