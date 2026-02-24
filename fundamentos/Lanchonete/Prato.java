import java.time.LocalDate;

public abstract class Prato {
    protected double precoVenda;
    protected LocalDate dataValidade;
    protected double peso;

    public Prato(double precoVenda, LocalDate dataValidade, double peso) {
        this.precoVenda = precoVenda;
        this.dataValidade = dataValidade;
        this.peso = peso;
    }

    public abstract double calcularPreco();

    public abstract String descricao();

    public double getPrecoVenda() { return precoVenda; }
    public LocalDate getDataValidade() { return dataValidade; }
    public double getPeso() { return peso; }

    @Override
    public String toString() {
        return descricao() + " - R$ " + String.format("%.2f", calcularPreco());
    }
}
