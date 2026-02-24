import java.time.LocalDate;

public class Lanche extends Prato {
    private String tipoPao;
    private String recheio;
    private String molho;

    public Lanche(double precoVenda, LocalDate dataValidade, double peso,
                  String tipoPao, String recheio, String molho) {
        super(precoVenda, dataValidade, peso);
        this.tipoPao = tipoPao;
        this.recheio = recheio;
        this.molho = molho;
    }

    @Override
    public double calcularPreco() {
        return precoVenda;
    }

    @Override
    public String descricao() {
        return "Lanche [Pão: " + tipoPao + ", Recheio: " + recheio + ", Molho: " + molho + "]";
    }

    public String getTipoPao() { return tipoPao; }
    public String getRecheio() { return recheio; }
    public String getMolho() { return molho; }
}
