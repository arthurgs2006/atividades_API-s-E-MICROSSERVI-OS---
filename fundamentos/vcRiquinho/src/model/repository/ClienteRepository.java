package repository;

import model.cliente.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {

    private List<Cliente> clientes = new ArrayList<>();

    public void salvar(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscar(String doc) {
        return clientes.stream()
                .filter(c -> c.getDocumento().equals(doc))
                .findFirst()
                .orElse(null);
    }

    public List<Cliente> listar() {
        return clientes;
    }
}