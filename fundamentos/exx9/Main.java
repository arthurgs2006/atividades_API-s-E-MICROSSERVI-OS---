package ex09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Arraylist lista = new Arraylist();
        int opcao;

        do {
            System.out.println("1-Adicionar 2-Remover 3-Listar 0-Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Tarefa: ");
                    lista.adicionar(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Indice: ");
                    lista.remover(sc.nextInt());
                    break;
                case 3:
                    lista.listar();
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}