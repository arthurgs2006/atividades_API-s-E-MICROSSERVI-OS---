import java.time.LocalDate;

public class Salgadinho extends Prato {
    private String tipo; // frito ou assado
    private String massa;
    private String recheio;

    public Salgadinho(double precoVenda, LocalDate dataValidade, double peso,
                      String tipo, String massa, String recheio) {
        super(precoVenda, dataValidade, peso);
        this.tipo = tipo;
        this.massa = massa;
        this.recheio = recheio;
    }

    @Override
    public double calcularPreco() {
        return precoVenda;
    }

    @Override
    public String descricao() {
        return "Salgadinho [Tipo: " + tipo + ", Massa: " + massa + ", Recheio: " + recheio + "]";
    }

    public String getTipo() { return tipo; }
    public String getMassa() { return massa; }
    public String getRecheio() { return recheio; }
}
