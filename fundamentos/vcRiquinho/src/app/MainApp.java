package app;

import service.*;
import java.util.Scanner;

public class MainApp {

    private static final Scanner in = new Scanner(System.in);
    private static final ClienteService clienteService = new ClienteService();
    private static final ProdutoService produtoService = new ProdutoService();
    private static final SimulacaoService simulacaoService =
            new SimulacaoService(clienteService, produtoService);

    public static void main(String[] args) {

        boolean sair = false;

        while (!sair) {
            System.out.println("\n=== VCrquinh0 ===");
            System.out.println("1 - Cadastrar Cliente PF");
            System.out.println("2 - Cadastrar Cliente PJ");
            System.out.println("3 - Listar Clientes");
            System.out.println("4 - Cadastrar Produto");
            System.out.println("5 - Listar Produtos");
            System.out.println("6 - Simular");
            System.out.println("0 - Sair");

            int op = Integer.parseInt(in.nextLine());

            switch (op) {
                case 1 -> cadastrarPF();
                case 2 -> cadastrarPJ();
                case 3 -> clienteService.listar();
                case 4 -> cadastrarProduto();
                case 5 -> produtoService.listar();
                case 6 -> simular();
                case 0 -> sair = true;
            }
        }
    }

    private static void cadastrarPF() {
        System.out.print("Nome: ");
        String nome = in.nextLine();
        System.out.print("CPF: ");
        String cpf = in.nextLine();
        System.out.print("Email: ");
        String email = in.nextLine();

        clienteService.cadastrarPF(nome, cpf, email);
    }

    private static void cadastrarPJ() {
        System.out.print("Nome: ");
        String nome = in.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = in.nextLine();
        System.out.print("Email: ");
        String email = in.nextLine();

        clienteService.cadastrarPJ(nome, cnpj, email);
    }

    private static void cadastrarProduto() {
        System.out.print("Tipo (1-Fixa / 2-Variavel): ");
        int tipo = Integer.parseInt(in.nextLine());

        System.out.print("Nome: ");
        String nome = in.nextLine();
        System.out.print("Descricao: ");
        String desc = in.nextLine();
        System.out.print("Rendimento mensal (%): ");
        double rendimento = Double.parseDouble(in.nextLine());

        if (tipo == 1) {
            System.out.print("Carencia dias: ");
            int carencia = Integer.parseInt(in.nextLine());
            produtoService.cadastrarRendaFixa(nome, desc, rendimento, carencia);
        } else {
            produtoService.cadastrarRendaVariavel(nome, desc, rendimento);
        }
    }

    private static void simular() {
        System.out.print("Documento do cliente: ");
        String doc = in.nextLine();

        System.out.print("Dias: ");
        int dias = Integer.parseInt(in.nextLine());

        simulacaoService.simular(doc, dias);
    }
}