package ex20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcao;

        do {
            System.out.println("1-Adicionar 2-Buscar 3-Listar 4-Verificar 0-Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    String tel = sc.nextLine();
                    agenda.adicionar(nome, tel);
                    break;
                case 2:
                    System.out.print("Nome: ");
                    agenda.buscar(sc.nextLine());
                    break;
                case 3:
                    agenda.listar();
                    break;
                case 4:
                    System.out.print("Nome: ");
                    String n = sc.nextLine();
                    System.out.print("Telefone: ");
                    String t = sc.nextLine();
                    agenda.verificar(n, t);
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}