package com.company.aula02.exercicio;

import java.util.List;

public interface ITabuleiro {
    void inserirDeck(Deck deck);
    void verificaCarta(CartaAtaque cartaAtaque, Jogador jogador);
    void encerrarPartida(List<Jogador> jogadores);
}
