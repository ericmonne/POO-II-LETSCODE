package com.company.aula06.desafio.classes;

public class Brinquedo extends Produto{
    private String tipo;

    public Brinquedo(){

    }

    public Brinquedo(String nome, double preco, int quantidade, String tipo) {
        super(nome, preco, quantidade);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Brinquedo{" +
                "id= " + this.getId() +
                ", nome= '" + this.getNome() + '\'' +
                ", preço= R$" + this.getPreco() +
                ", quantidade= " + this.getQuantidade() +
                ", tipo= '" + this.getTipo() + '\'' +
                '}';
    }
}
