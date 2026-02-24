package model.cliente;

public class PJ extends Cliente {

    private String cnpj;

    public PJ(String nome, String cnpj, String email) {
        super(nome, email);
        this.cnpj = cnpj;
    }

    @Override
    public String getDocumento() {
        return cnpj;
    }
}