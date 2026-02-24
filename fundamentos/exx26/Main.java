package ex26;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> participantes = new ArrayList<>();
        participantes.add("Ana");
        participantes.add("Carlos");
        participantes.add("Ana");
        participantes.add("Bruno");
        participantes.add("Carlos");
        participantes.add("Daniel");

        Sorteio sorteio = new Sorteio();
        sorteio.sortear(participantes);
    }
}