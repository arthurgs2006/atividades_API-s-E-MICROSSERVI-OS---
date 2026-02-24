package fundamentos.ex04;

public class Calculadora {
    private int resultado;
    private int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public Calculadora(){
        this.calculaImpar(this.numeros);
    }

    public void calculaImpar(int[] numeros){
        for (int numero : numeros){
            if(numero % 2 == 1){
                resultado = resultado + numero;
            }
        }
        System.out.println("A soma dos numeros impares é: " + resultado);
    }

}