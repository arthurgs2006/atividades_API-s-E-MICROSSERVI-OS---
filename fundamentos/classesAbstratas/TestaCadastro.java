public class TestaCadastro {
    public static void main(String[] args) {

        CadastroPessoas cadastro = new CadastroPessoas(10);

        Cliente cliente = new Cliente(
                "João Silva",
                new Data(10, 5, 1995),
                101);

        Funcionario funcionario = new Funcionario(
                "Maria Souza",
                new Data(20, 3, 1988),
                3000f);

        Gerente gerente = new Gerente(
                "Carlos Oliveira",
                new Data(15, 8, 1980),
                8000f,
                "TI");

        cadastro.cadastraPessoa(cliente);
        cadastro.cadastraPessoa(funcionario);
        cadastro.cadastraPessoa(gerente);

        cadastro.imprimeCadastro();
    }
}