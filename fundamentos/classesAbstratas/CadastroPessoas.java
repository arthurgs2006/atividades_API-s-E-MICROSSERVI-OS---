public class CadastroPessoas {
    private Pessoa[] pessoas;
    private int qtdAtual;

    public CadastroPessoas(int tamanho) {
        pessoas = new Pessoa[tamanho];
        qtdAtual = 0;
    }

    public void cadastraPessoa(Pessoa pess) {
        if (qtdAtual < pessoas.length) {
            pessoas[qtdAtual] = pess;
            qtdAtual++;
        } else {
            System.out.println("Cadastro cheio!");
        }
    }

    public void imprimeCadastro() {
        System.out.println("===== LISTA DE CADASTRO =====");
        for (int i = 0; i < qtdAtual; i++) {
            pessoas[i].imprimeDados();
        }
    }
}