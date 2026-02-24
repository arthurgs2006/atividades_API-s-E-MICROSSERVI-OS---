package ex11;

import java.util.LinkedList;

public class FilaAtendimento {

    private LinkedList<String> fila = new LinkedList<>();

    public void adicionar(String nome) {
        fila.addLast(nome);
    }

    public void atender() {
        if (!fila.isEmpty()) {
            fila.removeFirst();
        }
    }

    public void adicionarPrioritario(String nome) {
        fila.addFirst(nome);
    }

    public void mostrar() {
        System.out.println(fila);
    }
}