package model.investimento;

public class RendaFixa extends ProdutoInvestimento {

    private int carenciaDias;

    public RendaFixa(int id, String nome, String desc, double rendimento, int carencia) {
        super(id, nome, desc, rendimento);
        this.carenciaDias = carencia;
    }

    @Override
    public double calcularRendimento(double valor, int dias) {
        if (dias < carenciaDias) return 0;
        double taxaDiaria = rendimentoMensal / 100 / 30;
        return valor * taxaDiaria * dias;
    }
}