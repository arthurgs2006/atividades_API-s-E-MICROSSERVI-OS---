package fundamentos.ex02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Tabuada t1 = new Tabuada();

        System.out.println("Digite um número");
        t1.setNumero(leitor.nextInt());
        t1.calcular();
    }
}