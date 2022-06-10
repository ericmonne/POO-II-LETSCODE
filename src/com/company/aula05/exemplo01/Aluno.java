package com.company.aula05.exemplo01;

public class Aluno implements Comparable{

    private Double nota;

    public Aluno(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nota=" + nota +
                '}';
    }


    public Double getNota(){
        return this.nota;
    }

    public int compareTo(Aluno o) {
        return nota.compareTo(o.getNota());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
