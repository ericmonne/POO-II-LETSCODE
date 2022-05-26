package com.company.aula02.funcionarios;

public class Funcionario {
    private String nome;
    private String telefone;

    public Funcionario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
