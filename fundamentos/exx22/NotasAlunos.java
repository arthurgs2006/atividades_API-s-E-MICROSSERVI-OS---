package ex22;

import java.util.Map;
import java.util.TreeMap;

public class NotasAlunos {

    private TreeMap<String, Double> notas = new TreeMap<>();

    public void adicionar(String nome, double nota) {
        notas.put(nome, nota);
    }

    public void listar() {
        for (Map.Entry<String, Double> entry : notas.entrySet()) {
            System.out.println(entry.getKey() + " - Nota: " + entry.getValue());
        }
    }
}