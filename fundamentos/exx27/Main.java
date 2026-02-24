package ex27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        InversorFrase inversor = new InversorFrase();

        System.out.println("Frase invertida: " + inversor.inverter(frase));

        sc.close();
    }
}