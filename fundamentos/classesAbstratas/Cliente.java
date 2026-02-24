public class Cliente extends Pessoa {
    private int codigo;

    public Cliente(String nome, Data nascimento, int codigo) {
        super(nome, nascimento);
        this.codigo = codigo;
    }

    @Override
    public void imprimeDados() {
        System.out.println("=== Cliente ===");
        System.out.println("Nome: " + nome);
        System.out.println("Data Nascimento: " + nascimento);
        System.out.println("Código: " + codigo);
        System.out.println();
    }
}