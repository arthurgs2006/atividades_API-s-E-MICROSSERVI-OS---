package model.conta;

public class ContaInvestimentoAutomatico extends Conta {

    private double taxaServico;

    public ContaInvestimentoAutomatico(double taxaServico) {
        this.tipo = "Conta Investimento Automático";
        this.taxaServico = taxaServico;
    }

    @Override
    public double calcularRendimento(int dias) {
        double taxa = 0.015 / 30;
        return saldo * taxa * dias;
    }

    @Override
    public double calcularServico(double rendimento) {
        return rendimento * taxaServico;
    }
}