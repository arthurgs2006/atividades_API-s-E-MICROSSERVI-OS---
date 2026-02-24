package model.conta;

public abstract class Conta {

    protected String tipo;
    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract double calcularRendimento(int dias);

    public abstract double calcularServico(double rendimento);
}