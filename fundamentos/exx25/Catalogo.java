package ex25;

import java.util.*;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}

public class Catalogo {

    private Map<String, List<Produto>> categorias = new HashMap<>();

    public void adicionarProduto(String categoria, Produto produto) {
        categorias.computeIfAbsent(categoria, k -> new ArrayList<>()).add(produto);
    }

    public void listarPorCategoria(String categoria) {
        List<Produto> lista = categorias.get(categoria);

        if (lista != null) {
            for (Produto p : lista) {
                System.out.println(p);
            }
        } else {
            System.out.println("Categoria não encontrada.");
        }
    }
}