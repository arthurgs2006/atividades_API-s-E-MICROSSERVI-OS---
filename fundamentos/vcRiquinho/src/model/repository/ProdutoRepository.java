package repository;

import model.investimento.ProdutoInvestimento;
import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    private List<ProdutoInvestimento> produtos = new ArrayList<>();
    private int contador = 1;

    public void salvar(ProdutoInvestimento produto) {
        produtos.add(produto);
    }

    public int gerarId() {
        return contador++;
    }

    public List<ProdutoInvestimento> listar() {
        return produtos;
    }
}