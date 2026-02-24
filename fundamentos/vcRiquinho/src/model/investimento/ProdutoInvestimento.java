package model.investimento;

public abstract class ProdutoInvestimento {

    protected int id;
    protected String nome;
    protected String descricao;
    protected double rendimentoMensal;

    public ProdutoInvestimento(int id, String nome, String descricao, double rendimentoMensal) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.rendimentoMensal = rendimentoMensal;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }

    public abstract double calcularRendimento(double valor, int dias);

    @Override
    public String toString() {
        return id + " - " + nome + " | " + rendimentoMensal + "%";
    }
}