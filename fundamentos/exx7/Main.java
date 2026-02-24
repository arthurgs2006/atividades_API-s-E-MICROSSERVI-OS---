package ex07;

class Carro extends Veiculo {

    private int numeroDePortas;

    public Carro(String marca, String modelo, int portas) {
        super(marca, modelo);
        this.numeroDePortas = portas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Portas: " + numeroDePortas;
    }
}

class Moto extends Veiculo {

    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindradas: " + cilindradas;
    }
}

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Ford", "Focus", 4);
        Moto moto = new Moto("Honda", "CB500", 500);

        System.out.println(carro);
        System.out.println(moto);
    }
}