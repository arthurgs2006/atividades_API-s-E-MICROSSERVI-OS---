import java.time.LocalDate;

public class Pizza extends Prato {
    private String recheio;
    private String borda;
    private String molho;

    public Pizza(double precoVenda, LocalDate dataValidade, double peso,
                 String recheio, String borda, String molho) {
        super(precoVenda, dataValidade, peso);
        this.recheio = recheio;
        this.borda = borda;
        this.molho = molho;
    }

    @Override
    public double calcularPreco() {
        double preco = precoVenda;
        // Borda recheada tem acréscimo de R$5,00
        if (!borda.equalsIgnoreCase("simples")) {
            preco += 5.00;
        }
        return preco;
    }

    @Override
    public String descricao() {
        return "Pizza [Recheio: " + recheio + ", Borda: " + borda + ", Molho: " + molho + "]";
    }

    public String getRecheio() { return recheio; }
    public String getBorda() { return borda; }
    public String getMolho() { return molho; }
}
