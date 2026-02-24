package ex16;

public class Main {
    public static void main(String[] args) {

        NomesOrdenados nomes = new NomesOrdenados();

        nomes.adicionar("Carlos");
        nomes.adicionar("Ana");
        nomes.adicionar("Bruno");
        nomes.adicionar("Daniel");
        nomes.adicionar("Eduardo");

        nomes.mostrar();
    }
}