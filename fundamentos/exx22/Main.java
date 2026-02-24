package ex22;

public class Main {
    public static void main(String[] args) {

        NotasAlunos notas = new NotasAlunos();

        notas.adicionar("Carlos", 7.5);
        notas.adicionar("Ana", 9.0);
        notas.adicionar("Bruno", 6.8);
        notas.adicionar("Daniel", 8.2);
        notas.adicionar("Eduardo", 5.9);

        notas.listar();
    }
}