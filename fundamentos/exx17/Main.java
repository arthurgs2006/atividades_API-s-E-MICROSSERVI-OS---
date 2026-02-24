package ex17;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Produto> produtos = new TreeSet<>();

        produtos.add(new Produto("Notebook", 4500));
        produtos.add(new Produto("Mouse", 150));
        produtos.add(new Produto("Teclado", 300));
        produtos.add(new Produto("Monitor", 1200));

        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}