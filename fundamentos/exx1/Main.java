package fundamentos.ex01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Aluno gustavo = new Aluno();

        System.out.println("Digite a primeira nota:");
        gustavo.setNota1(leitor.nextDouble());

        System.out.println("Digite a segunda nota:");
        gustavo.setNota2(leitor.nextDouble());

        System.out.println("Digite a terceira nota:");
        gustavo.setNota3(leitor.nextDouble());

        System.out.println("A média do aluno foi: " + gustavo.calcularMedia());
        gustavo.aprovacao();
        leitor.close();
    }
}