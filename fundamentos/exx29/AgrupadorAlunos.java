package ex29;

import java.util.*;

class Aluno {
    String nome;
    double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome + " - " + nota;
    }
}

public class AgrupadorAlunos {

    public Map<String, List<Aluno>> agrupar(List<Aluno> alunos) {

        Map<String, List<Aluno>> grupos = new HashMap<>();

        for (Aluno aluno : alunos) {

            String categoria;

            if (aluno.nota >= 7)
                categoria = "Aprovados";
            else if (aluno.nota >= 5)
                categoria = "Recuperação";
            else
                categoria = "Reprovados";

            grupos.computeIfAbsent(categoria, k -> new ArrayList<>()).add(aluno);
        }

        return grupos;
    }
}