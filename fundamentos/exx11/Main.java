package ex11;

public class Main {
    public static void main(String[] args) {

        FilaAtendimento fila = new FilaAtendimento();

        fila.adicionar("Ana");
        fila.adicionar("Carlos");
        fila.adicionar("Bruno");
        fila.adicionar("Marcos");
        fila.adicionar("Julia");

        fila.atender();
        fila.atender();

        fila.adicionarPrioritario("Prioritario1");
        fila.adicionarPrioritario("Prioritario2");

        fila.mostrar();
    }
}