package ex19;

public class Main {
    public static void main(String[] args) {

        String texto = "java é poderoso e java é orientado a objetos";

        ContadorPalavras contador = new ContadorPalavras();
        contador.contar(texto);
    }
}