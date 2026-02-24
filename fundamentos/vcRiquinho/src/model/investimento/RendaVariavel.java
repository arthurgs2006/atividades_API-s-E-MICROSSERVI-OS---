package model.investimento;

public class RendaVariavel extends ProdutoInvestimento {

    public RendaVariavel(int id, String nome, String desc, double rendimento) {
        super(id, nome, desc, rendimento);
    }

    @Override
    public double calcularRendimento(double valor, int dias) {
        double taxaDiaria = rendimentoMensal / 100 / 30;
        return valor * taxaDiaria * dias;
    }
}