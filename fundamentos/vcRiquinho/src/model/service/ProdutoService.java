package service;

import model.investimento.*;
import repository.ProdutoRepository;

public class ProdutoService {

    private ProdutoRepository repository = new ProdutoRepository();

    public void cadastrarRendaFixa(String nome, String desc, double rendimento, int carencia) {
        int id = repository.gerarId();
        repository.salvar(new RendaFixa(id, nome, desc, rendimento, carencia));
    }

    public void cadastrarRendaVariavel(String nome, String desc, double rendimento) {
        int id = repository.gerarId();
        repository.salvar(new RendaVariavel(id, nome, desc, rendimento));
    }

    public void listar() {
        repository.listar().forEach(System.out::println);
    }

    public ProdutoRepository getRepository() {
        return repository;
    }
}