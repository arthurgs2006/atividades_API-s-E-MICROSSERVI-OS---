package ex21;

public class Main {
    public static void main(String[] args) {

        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.adicionar(101, "Notebook");
        cadastro.adicionar(102, "Mouse");
        cadastro.adicionar(103, "Teclado");
        cadastro.adicionar(104, "Monitor");
        cadastro.adicionar(105, "Impressora");

        cadastro.listar();
    }
}