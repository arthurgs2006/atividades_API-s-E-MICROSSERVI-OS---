package ex13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(4);

        RemoverDuplicatas rd = new RemoverDuplicatas();

        System.out.println("Lista sem duplicatas: " + rd.remover(lista));
    }
}