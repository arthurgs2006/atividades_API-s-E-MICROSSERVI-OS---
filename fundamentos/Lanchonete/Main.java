import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pizza pizzaMargherita = new Pizza(
            35.00,
            LocalDate.of(2026, 3, 1),
            0.5,
            "Queijo e Tomate",
            "recheada",   
            "Tomate"
        );

        Pizza pizzaPepperoni = new Pizza(
            40.00,
            LocalDate.of(2026, 3, 1),
            0.6,
            "Pepperoni",
            "simples",
            "Tomate"
        );

        Lanche xBurguer = new Lanche(
            22.50,
            LocalDate.of(2026, 2, 25),
            0.3,
            "Brioche",
            "Hambúrguer com queijo",
            "Maionese especial"
        );

        Lanche xSalada = new Lanche(
            18.00,
            LocalDate.of(2026, 2, 25),
            0.28,
            "Integral",
            "Frango grelhado",
            "Mostarda"
        );

        Salgadinho coxinha = new Salgadinho(
            6.00,
            LocalDate.of(2026, 2, 23),
            0.1,
            "frito",
            "Trigo",
            "Frango com catupiry"
        );

        Salgadinho enroladinho = new Salgadinho(
            5.00,
            LocalDate.of(2026, 2, 23),
            0.08,
            "assado",
            "Folhada",
            "Presunto e queijo"
        );

        System.out.println("\n====== PEDIDO 1 ======");
        Pedido pedido1 = new Pedido("João Silva", 0.10); 
        pedido1.adicionarItem(pizzaMargherita);
        pedido1.adicionarItem(coxinha);
        pedido1.adicionarItem(coxinha);

        pedido1.mostrarFatura();
        pedido1.calcularTroco(100.00);

        System.out.println("\n====== PEDIDO 2 ======");
        Pedido pedido2 = new Pedido("Maria Oliveira", 0.10);
        pedido2.adicionarItem(xBurguer);
        pedido2.adicionarItem(xSalada);
        pedido2.adicionarItem(enroladinho);
        pedido2.adicionarItem(pizzaPepperoni);

        pedido2.mostrarFatura();
        pedido2.calcularTroco(150.00);

        System.out.println("\n====== CARDÁPIO COMPLETO (Polimorfismo) ======");
        Prato[] cardapio = { pizzaMargherita, pizzaPepperoni, xBurguer, xSalada, coxinha, enroladinho };
        for (Prato prato : cardapio) {
            System.out.println(prato.toString()); 
        }
    }
}
