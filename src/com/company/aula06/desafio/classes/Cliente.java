package com.company.aula06.desafio.classes;

import com.company.aula06.desafio.interfaces.ICliente;

public class Cliente implements ICliente {
    private String nome;
    private int idade;
    private String dataNascimento;
    private String RG;
    private String CPF;

    public Cliente() {
    }

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Cliente(String nome, int idade, String dataNascimento, String RG, String CPF) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.RG = RG;
        this.CPF = CPF;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String getRG() {
        return RG;
    }

    @Override
    public void setRG(String RG) {
        this.RG = RG;
    }

    @Override
    public String getCPF() {
        return CPF;
    }

    @Override
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
