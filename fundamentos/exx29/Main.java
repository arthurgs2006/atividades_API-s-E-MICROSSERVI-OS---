package ex29;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Ana", 8.5));
        alunos.add(new Aluno("Carlos", 6.0));
        alunos.add(new Aluno("Bruno", 4.5));
        alunos.add(new Aluno("Daniel", 7.2));

        AgrupadorAlunos agrupador = new AgrupadorAlunos();
        Map<String, List<Aluno>> resultado = agrupador.agrupar(alunos);

        for (String chave : resultado.keySet()) {
            System.out.println(chave + ": " + resultado.get(chave));
        }
    }
}