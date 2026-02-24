package ex12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BuscaCidade busca = new BuscaCidade();

        System.out.print("Digite o nome da cidade: ");
        String nome = sc.nextLine();

        busca.buscar(nome);

        sc.close();
    }
}