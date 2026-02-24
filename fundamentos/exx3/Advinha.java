package fundamentos.ex03;
import java.util.Scanner;

public class Advinha {
    private int numeroCerto;
    private int chute;
    private int tentativas = 0;

    public Advinha(){
        geraAleatorio();
    }
    public void geraAleatorio(){
        // função Math.random gera um numero aleatorio de 0.0 a 0.999
        // a funçao pega esse numero por ex: 99.999 e transforma em int, dai fica so 99
        // depois adicinoa 1, dai inclui o 100, e também nunca será 0
        this.numeroCerto = (int)(Math.random()*100) + 1;
    }

    public void calculaChute(){
        Scanner leitor = new Scanner(System.in);

        if(this.chute < 0 || this.chute > 100){
            System.out.println("você sabe ler?");
        }else {
            while (this.chute != this.numeroCerto) {
                if (this.chute > this.numeroCerto) {
                    System.out.println("menos");
                } else {
                    System.out.println("mais");
                }
                tentativas++;
                System.out.println("tente de novo: ");
                this.chute = leitor.nextInt();
            }
            System.out.println("Acertou! O número era: " + this.numeroCerto);
            System.out.println("total de tentativas: " + tentativas);
        }
    }


    public int getNumeroCerto() {
        return numeroCerto;
    }
    public void setChute(int chute) {
        this.chute = chute;
    }
    public int getChute() {
        return chute;
    }
}