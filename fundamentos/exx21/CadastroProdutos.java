package ex21;

import java.util.LinkedHashMap;
import java.util.Map;

public class CadastroProdutos {

    private LinkedHashMap<Integer, String> produtos = new LinkedHashMap<>();

    public void adicionar(int codigo, String nome) {
        produtos.put(codigo, nome);
    }

    public void listar() {
        for (Map.Entry<Integer, String> entry : produtos.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}