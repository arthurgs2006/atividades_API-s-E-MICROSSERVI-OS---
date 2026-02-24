package ex20;

import java.util.HashMap;
import java.util.Map;

public class Agenda {

    private HashMap<String, String> contatos = new HashMap<>();

    public void adicionar(String nome, String telefone) {
        contatos.put(nome, telefone);
    }

    public void buscar(String nome) {
        if (contatos.containsKey(nome)) {
            System.out.println("Telefone: " + contatos.get(nome));
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public void listar() {
        for (Map.Entry<String, String> entry : contatos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void verificar(String nome, String telefone) {
        System.out.println("Nome existe? " + contatos.containsKey(nome));
        System.out.println("Telefone existe? " + contatos.containsValue(telefone));
    }
}