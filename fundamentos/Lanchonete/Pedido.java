import java.util.ArrayList;

public class Pedido {
    private String nomeCliente;
    private double taxaServico; // percentual, ex: 0.10 para 10%
    private ArrayList<Prato> itensConsumidos;

    public Pedido(String nomeCliente, double taxaServico) {
        this.nomeCliente = nomeCliente;
        this.taxaServico = taxaServico;
        this.itensConsumidos = new ArrayList<>();
    }

    public void adicionarItem(Prato prato) {
        itensConsumidos.add(prato);
    }

    public double calcularTotal() {
        double subtotal = 0;
        for (Prato prato : itensConsumidos) {
            subtotal += prato.calcularPreco();
        }
        return subtotal + (subtotal * taxaServico);
    }

    public void mostrarFatura() {
        System.out.println("========================================");
        System.out.println("         NOTA FISCAL - Quase Três Lanches");
        System.out.println("========================================");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("----------------------------------------");
        System.out.println("Itens consumidos:");

        double subtotal = 0;
        for (Prato prato : itensConsumidos) {
            System.out.println("  - " + prato.toString());
            subtotal += prato.calcularPreco();
        }

        System.out.println("----------------------------------------");
        System.out.printf("Subtotal:       R$ %.2f%n", subtotal);
        System.out.printf("Taxa de serviço (%.0f%%): R$ %.2f%n", taxaServico * 100, subtotal * taxaServico);
        System.out.printf("TOTAL:          R$ %.2f%n", calcularTotal());
        System.out.println("========================================");
    }

    public double calcularTroco(double valorRecebido) {
        double total = calcularTotal();
        if (valorRecebido < total) {
            System.out.printf("Valor insuficiente! Faltam R$ %.2f%n", total - valorRecebido);
            return -1;
        }
        double troco = valorRecebido - total;
        System.out.printf("Valor recebido: R$ %.2f%n", valorRecebido);
        System.out.printf("Troco:          R$ %.2f%n", troco);
        return troco;
    }

    public String getNomeCliente() { return nomeCliente; }
    public double getTaxaServico() { return taxaServico; }
    public ArrayList<Prato> getItensConsumidos() { return itensConsumidos; }
}
