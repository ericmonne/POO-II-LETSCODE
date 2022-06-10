package com.company.aula06.desafio.classes;

public class Jogo extends Produto {
    private String distribuidora;
    private String genero;
    private String estudio;

    public Jogo() {
    }

    public Jogo(String nome, double preco, int quantidade, String distribuidora, String genero, String estudio) {
        super(nome, preco, quantidade);
        this.distribuidora = distribuidora;
        this.genero = genero;
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "id= " + this.getId() +
                ", nome= '" + this.getNome() + '\'' +
                ", preço= R$" + this.getPreco() +
                ", quantidade= " + this.getQuantidade() +
                ", distribuidora= '" + distribuidora + '\'' +
                ", gênero= '" + genero + '\'' +
                ", estúdio= '" + estudio + '\'' +
                '}';
    }
}
