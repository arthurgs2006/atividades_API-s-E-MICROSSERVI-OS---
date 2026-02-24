package ex09;

import java.util.ArrayList;

public class Arraylist {

    private ArrayList<String> tarefas = new ArrayList<>();

    public void adicionar(String tarefa) {
        tarefas.add(tarefa);
    }

    public void remover(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
        }
    }

    public void listar() {
        System.out.println(tarefas);
    }
}