
package fundamentos.ex03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Advinha teste = new Advinha();

        System.out.println("Advinhe o número de 1 a 100");
        teste.setChute(leitor.nextInt());
        teste.calculaChute();
    }
}