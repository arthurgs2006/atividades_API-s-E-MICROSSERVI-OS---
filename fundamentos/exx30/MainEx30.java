import java.util.Scanner;

public class MainEx30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir? ");
        int tamanho = sc.nextInt();

        int[] numeros = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int[] ordenado = Ex30_OrdenarVetor.ordenarVetor(numeros);

        System.out.println("\nVetor ordenado:");
        for (int num : ordenado) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}