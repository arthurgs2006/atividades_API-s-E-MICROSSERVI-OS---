package model.cliente;

public class PF extends Cliente {

    private String cpf;

    public PF(String nome, String cpf, String email) {
        super(nome, email);
        this.cpf = cpf;
    }

    @Override
    public String getDocumento() {
        return cpf;
    }
}