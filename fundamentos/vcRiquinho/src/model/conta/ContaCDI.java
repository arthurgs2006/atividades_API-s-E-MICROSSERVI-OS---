package model.conta;

public class ContaCDI extends Conta {

    private static final double TAXA_SERVICO = 0.0007;
    private static final double CDI_MENSAL = 0.01;

    public ContaCDI() {
        this.tipo = "Conta CDI";
    }

    @Override
    public double calcularRendimento(int dias) {
        double taxaDiaria = CDI_MENSAL / 30;
        return saldo * taxaDiaria * dias;
    }

    @Override
    public double calcularServico(double rendimento) {
        return rendimento * TAXA_SERVICO;
    }
}