package com.company.aula06.desafio.classes;

import java.util.Arrays;

public class Filme extends Produto{
    private String estudio;
    private String[] diretores;
    private String[] generos;
    private String[] produtores;

    public Filme() {
    }

    public Filme(String nome, double preco, int quantidade, String estudio, String[] diretores, String[] generos, String[] produtores) {
        super(nome, preco, quantidade);
        this.estudio = estudio;
        this.diretores = diretores;
        this.generos = generos;
        this.produtores = produtores;
    }

    public Filme(String nome, double preco, int quantidade, String estudio) {
        super(nome, preco, quantidade);
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "id= " + this.getId() +
                ", nome= '" + this.getNome() + '\'' +
                ", preço= R$" + this.getPreco() +
                ", quantidade= " + this.getQuantidade() +
                ", estúdio= '" + estudio + '\'' +
                ", diretores=" + Arrays.toString(diretores) +
                ", gêneros=" + Arrays.toString(generos) +
                ", produtores=" + Arrays.toString(produtores) +
                '}';
    }
}
