package ex10;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenar {

    private ArrayList<Integer> numeros = new ArrayList<>();

    public void adicionar(int n) {
        numeros.add(n);
    }

    public void ordenar() {
        Collections.sort(numeros);
    }

    public void mostrar() {
        System.out.println(numeros);
    }
}