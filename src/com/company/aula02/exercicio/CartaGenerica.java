package com.company.aula02.exercicio;

public abstract class CartaGenerica implements ICarta {
    private String nome;
    private TipoCarta tipoCarta;
    private int custo;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public TipoCarta getTipoCarta() {
        return tipoCarta;
    }

    @Override
    public int getCusto() {
        return custo;
    }
}
