package ex08;

public class Bank {

    private double saldo;

    public Bank(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente!");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}