package com.company.aula06.desafio.classes;

import java.util.Arrays;

public class Livro extends Produto{

    private String[] generos;
    private String escritor;
    private String editora;

    public Livro() {
    }

    public Livro(String nome, double preco, int quantidade, String[] generos, String escritor, String editora) {
        super(nome, preco, quantidade);
        this.generos = generos;
        this.escritor = escritor;
        this.editora = editora;
    }

    public Livro(String nome, double preco, int quantidade, String escritor, String editora) {
        super(nome, preco, quantidade);
        this.escritor = escritor;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id= " + this.getId() +
                ", nome= '" + this.getNome() + '\'' +
                ", preço= R$" + this.getPreco() +
                ", quantidade= " + this.getQuantidade() +
                ", generos=" + Arrays.toString(generos) +
                ", escritor= '" + escritor + '\'' +
                ", editora= '" + editora + '\'' +
                '}';
    }
}
