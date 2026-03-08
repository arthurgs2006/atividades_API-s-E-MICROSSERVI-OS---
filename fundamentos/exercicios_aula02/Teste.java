import java.util.*;
import java.util.stream.Collectors;

class Produto {
    private String nome;
    private double preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public String getCategoria() { return categoria; }

    @Override
    public String toString() {
        return nome + " (R$ " + preco + ")";
    }
}

public class TestedoProduto {

    public static void main(String[] args){
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Laptop", 3500.00, "Hardware")); 
        produtos.add(new Produto("Livro Java", 120.0, "Livros"));
        produtos.add(new Produto("Livro Estruturas de Dados", 150.0, "Livros"));
        produtos.add(new Produto("Livro Clean Code", 200.0, "Livros"));
        produtos.add(new Produto("Tablet", 1200.0, "Eletrônicos"));

        System.out.println("Hardware:"); 
        produtos.forEach(e -> {
            String resultado = e.getCategoria().equals("Hardware") ? e.getNome() : "Outro";
            System.out.println(resultado);
        });

        System.out.println("\nProdutos Eletrônicos:"); 
        produtos.stream()
            .filter(p -> p.getCategoria().equals("Eletrônicos")) 
            .forEach(p -> System.out.println(p.getNome())); 


        List<Double> precos = produtos.stream()
            .filter(p -> p.getPreco() > 500.00)
            .map(p -> p.getPreco()) 
            .collect(Collectors.toList());
        System.out.println("\nPreços maiores que 500:");
        System.out.println(precos);

        double totalLivros = produtos.stream()
            .filter(p -> p.getCategoria().equals("Livros"))
            .mapToDouble(p -> p.getPreco())
            .sum();

        System.out.println("\nTotal estoque de livros: " + totalLivros);

      
        List<String> nomesLambda = produtos.stream()
            .map(p -> p.getNome())
            .collect(Collectors.toList());

        System.out.println("\nNomes (lambda): " + nomesLambda);

    
        List<String> nomesMethodRef = produtos.stream()
            .map(Produto::getNome)
            .collect(Collectors.toList());

        System.out.println("Nomes (method reference): " + nomesMethodRef);

        searchProductByName(produtos, "Laptop")
            .ifPresent(p -> System.out.println("\nProduto encontrado: " + p));

        try {
            searchProductByName(produtos, "Geladeira")
                .orElseThrow(() -> new RuntimeException("Produto não encontrado!"));
        } catch (RuntimeException e) {
            System.out.println("\nExceção intencional capturada: " + e.getMessage());
        }
    } 

    public static Optional<Produto> searchProductByName(List<Produto> produtos, String nome) {
        return produtos.stream()
            .filter(p -> p.getNome().equalsIgnoreCase(nome))
            .findFirst();
    }
}