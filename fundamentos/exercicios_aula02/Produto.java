
public class Produto {

    private String nome;
    private String preco;
    private String categoria;

    public Produto(String nome, double preco, String categoria){
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;

    }
    public String getName (){
        return nome;
    }
    public double getPrice (){
        return preco;
    }
    public String getCategory{
        return categoria;
    }

    @Override
    public String toString(){
        return nome + "  - " + categoria + " - R$ " + preco;
    }
}