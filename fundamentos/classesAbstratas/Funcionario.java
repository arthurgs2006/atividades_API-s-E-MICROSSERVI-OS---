public class Funcionario extends Pessoa {
    protected float salario;

    public Funcionario(String nome, Data nascimento, float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public float calculaImposto() {
        return salario * 0.03f; // 3%
    }

    @Override
    public void imprimeDados() {
        System.out.println("=== Funcionário ===");
        System.out.println("Nome: " + nome);
        System.out.println("Data Nascimento: " + nascimento);
        System.out.println("Salário: " + salario);
        System.out.println("Imposto (3%): " + calculaImposto());
        System.out.println();
    }
}