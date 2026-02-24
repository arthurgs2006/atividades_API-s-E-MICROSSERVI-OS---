package ex25;

public class Main {
    public static void main(String[] args) {

        Catalogo catalogo = new Catalogo();

        catalogo.adicionarProduto("Eletrônicos", new Produto("Notebook", 4500));
        catalogo.adicionarProduto("Eletrônicos", new Produto("Mouse", 150));
        catalogo.adicionarProduto("Roupas", new Produto("Camisa", 90));

        catalogo.listarPorCategoria("Eletrônicos");
    }
}