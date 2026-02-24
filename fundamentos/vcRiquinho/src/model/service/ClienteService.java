package service;

import model.cliente.*;
import model.conta.*;
import repository.ClienteRepository;

public class ClienteService {

    private ClienteRepository repository = new ClienteRepository();

    public void cadastrarPF(String nome, String cpf, String email) {
        PF pf = new PF(nome, cpf, email);
        pf.adicionarConta(new ContaCDI());
        repository.salvar(pf);
    }

    public void cadastrarPJ(String nome, String cnpj, String email) {
        PJ pj = new PJ(nome, cnpj, email);
        pj.adicionarConta(new ContaInvestimentoAutomatico(0.0015));
        repository.salvar(pj);
    }

    public void listar() {
        repository.listar().forEach(System.out::println);
    }

    public Cliente buscar(String doc) {
        return repository.buscar(doc);
    }
}