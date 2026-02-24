package ex26;

import java.util.*;

public class Sorteio {

    public void sortear(List<String> participantes) {

        Set<String> unicos = new HashSet<>(participantes);
        List<String> listaUnica = new ArrayList<>(unicos);

        Collections.shuffle(listaUnica);

        System.out.println("Ganhadores:");

        for (int i = 0; i < 3 && i < listaUnica.size(); i++) {
            System.out.println(listaUnica.get(i));
        }
    }
}