package ex06;

public class Circulo {

    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public void setRaio(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio inválido!");
        }
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}