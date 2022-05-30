package com.company.aula02.exercicio;

public class CartaAtaque extends CartaGenerica {

    private String nome;

    private TipoCarta tipoCarta;

    private int custo;

    private int poder;

    private int resistencia;


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

    public int getPoder() {
        return poder;
    }

    public int getResistencia() {
        return resistencia;
    }
}
