package model.conta;

public class ContaCorrente extends Conta {

    public ContaCorrente() {
        this.tipo = "Conta Corrente";
    }

    @Override
    public double calcularRendimento(int dias) {
        return 0;
    }

    @Override
    public double calcularServico(double rendimento) {
        return 0;
    }
}