package fundamentos.ex01;
public class Aluno{
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;

    public double calcularMedia(){
        media = (nota1 + nota2 + nota3) / 3;
        return media;
    }

    public void aprovacao(){
        if(media >= 7){
            System.out.println("Aprovado");
        }else if(media < 5){
            System.out.println("Reprovado");
        }else{
            System.out.println("Recuperação");
        }
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota1(){
        return nota1;
    }
    public double getNota2(){
        return nota2;
    }
    public double getNota3(){
        return nota3;
    }
}