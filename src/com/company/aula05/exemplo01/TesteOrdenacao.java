package com.company.aula05.exemplo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteOrdenacao {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno(5.0));
        alunos.add(new Aluno(6.0));
        alunos.add(new Aluno(4.5));

        Collections.sort(alunos);

        for(Aluno aluno : alunos){
            System.out.println(aluno.getNota());
        }

    }
}
