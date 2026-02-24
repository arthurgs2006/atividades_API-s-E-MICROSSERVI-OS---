package service;

import model.cliente.Cliente;
import model.conta.Conta;

public class SimulacaoService {

    private ClienteService clienteService;
    private ProdutoService produtoService;

    public SimulacaoService(ClienteService c, ProdutoService p) {
        this.clienteService = c;
        this.produtoService = p;
    }

    public void simular(String doc, int dias) {

        Cliente cliente = clienteService.buscar(doc);

        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        double totalRendimento = 0;
        double totalServico = 0;

        for (Conta conta : cliente.getContas()) {
            conta.depositar(1000); // valor base para simulação
            double rendimento = conta.calcularRendimento(dias);
            double servico = conta.calcularServico(rendimento);

            totalRendimento += rendimento;
            totalServico += servico;
        }

        System.out.println("Rendimento: " + totalRendimento);
        System.out.println("Taxas: " + totalServico);
        System.out.println("Lucro líquido: " + (totalRendimento - totalServico));
    }
}