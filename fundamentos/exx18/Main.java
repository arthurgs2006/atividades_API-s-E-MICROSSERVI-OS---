package ex18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Dicionario dic = new Dicionario();

        System.out.print("Digite uma palavra em português: ");
        String palavra = sc.nextLine();

        dic.traduzir(palavra);

        sc.close();
    }
}