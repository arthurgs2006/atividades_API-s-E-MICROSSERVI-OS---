package ex08;

public class Main {
    public static void main(String[] args) {

        Bank conta = new Bank(100);

        try {
            conta.sacar(200);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}