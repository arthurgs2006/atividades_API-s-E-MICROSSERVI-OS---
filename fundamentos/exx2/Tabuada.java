package fundamentos.ex02;

public class Tabuada {
    private int numero;

    public void calcular(){
        System.out.println("Calculando a tabuada do "+ this.getNumero());
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.getNumero() + "x" + i + "=" + this.getNumero() * i);
        }
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
}