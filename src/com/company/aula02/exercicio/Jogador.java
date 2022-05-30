package com.company.aula02.exercicio;

import java.util.List;

public class Jogador {
    protected int HP;
    protected boolean vivo;
    protected String nome;
    protected List<CartaAtaque> cartasAtaqueEmCampo;
    protected List<CartaAtaquesEspeciais> cartasAtaquesEspeciaisEmCampo;
    protected Deck deck;
}
