package ex15;

public class Main {
    public static void main(String[] args) {

        DiasSemana dias = new DiasSemana();

        dias.adicionar("Quarta");
        dias.adicionar("Segunda");
        dias.adicionar("Sexta");
        dias.adicionar("Domingo");

        dias.mostrar();
    }
}