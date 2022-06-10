package com.company.aula06.desafio.classes;

import com.company.aula06.desafio.interfaces.IProduto;

public abstract class Produto implements IProduto {
    private int id;
    private String nome;
    private double preco;
    private static int contadorId = 0;
    private int quantidade;
    private boolean restrito;

    private int gerarId(){
        contadorId++;
        this.id = contadorId;
        return this.id;
    }

    public Produto() {
        gerarId();
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        gerarId();
    }

    public Produto(String nome, double preco, int quantidade, boolean restrito) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.restrito = restrito;
        gerarId();
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean isRestrito() {
        return restrito;
    }

    @Override
    public void setRestrito(boolean restrito) {
        this.restrito = restrito;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id= " + id +
                ", nome='" + nome + '\'' +
                ", preço= R$" + preco +
                ", quantidade= " + quantidade +
                '}';
    }
}
