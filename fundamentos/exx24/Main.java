package ex24;

public class Main {
    public static void main(String[] args) {

        PilhaLivros pilha = new PilhaLivros();

        pilha.empilhar("Livro A");
        pilha.empilhar("Livro B");
        pilha.empilhar("Livro C");

        pilha.desempilhar();
        pilha.espiar();
    }
}