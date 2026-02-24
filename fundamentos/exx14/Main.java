package ex15;

import java.util.LinkedHashSet;

public class DiasSemana {

    private LinkedHashSet<String> dias = new LinkedHashSet<>();

    public void adicionar(String dia) {
        dias.add(dia);
    }

    public void mostrar() {
        for (String d : dias) {
            System.out.println(d);
        }
    }
}