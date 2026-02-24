package ex10;

public class Main {
    public static void main(String[] args) {

        Ordenar o = new Ordenar();

        o.adicionar(5);
        o.adicionar(9);
        o.adicionar(1);
        o.adicionar(3);
        o.adicionar(7);

        o.ordenar();
        o.mostrar();
    }
}