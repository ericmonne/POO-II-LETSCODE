package com.company.aula06.desafio.classes;

import java.util.Arrays;

public class AlbumMusical extends Produto {
    private String[] musicosOuBandas;
    private String[] generos;
    private String[] selos;

    public AlbumMusical() {
    }

    public AlbumMusical(String nome, double preco, int quantidade, String[] musicosOuBandas, String[] generos, String[] selos) {
        super(nome, preco, quantidade);
        this.musicosOuBandas = musicosOuBandas;
        this.generos = generos;
        this.selos = selos;
    }

    public AlbumMusical(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public String toString() {
        return "Álbum Musical{" +
                "id= " + this.getId() +
                ", nome= '" + this.getNome() + '\'' +
                ", preço= R$" + this.getPreco() +
                ", quantidade= " + this.getQuantidade() +
                ", músicos ou bandas=" + Arrays.toString(musicosOuBandas) +
                ", gêneros=" + Arrays.toString(generos) +
                ", selos=" + Arrays.toString(selos) +
                '}';
    }

    public String[] getMusicosOuBandas() {
        return musicosOuBandas;
    }

    public void setMusicosOuBandas(String[] musicosOuBandas) {
        this.musicosOuBandas = musicosOuBandas;
    }

    public String[] getGeneros() {
        return generos;
    }

    public void setGeneros(String[] generos) {
        this.generos = generos;
    }

    public String[] getSelos() {
        return selos;
    }

    public void setSelos(String[] selos) {
        this.selos = selos;
    }
}
