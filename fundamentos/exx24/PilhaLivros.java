package ex24;

import java.util.ArrayDeque;
import java.util.Deque;

public class PilhaLivros {

    private Deque<String> pilha = new ArrayDeque<>();

    public void empilhar(String livro) {
        pilha.push(livro);
    }

    public void desempilhar() {
        if (!pilha.isEmpty()) {
            System.out.println("Livro removido: " + pilha.pop());
        }
    }

    public void espiar() {
        if (!pilha.isEmpty()) {
            System.out.println("Topo da pilha: " + pilha.peek());
        }
    }
}