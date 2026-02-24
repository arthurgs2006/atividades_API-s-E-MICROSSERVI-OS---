package ex14;

import java.util.HashSet;

public class EmailSet {

    private HashSet<String> emails = new HashSet<>();

    public void adicionar(String email) {
        emails.add(email);
    }

    public void mostrarQuantidade() {
        System.out.println("Quantidade de e-mails únicos: " + emails.size());
    }
}