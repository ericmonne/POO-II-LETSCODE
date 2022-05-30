package com.company.aula02.exercicio;

import java.util.ArrayList;
import java.util.List;

public class TabuleiroParty implements ITabuleiro{

    boolean partidaEmAndamento;
    List<CartaAtaque> cartasAtaqueEmCampo;

    public void iniciarJogo(DeckParty deckParty1, DeckParty deckParty2, DeckParty deckParty3, DeckParty deckParty4, DeckParty deckParty5){
        inserirDeck(deckParty1);
        inserirDeck(deckParty2);
        inserirDeck(deckParty3);
        inserirDeck(deckParty4);
        inserirDeck(deckParty5);
        cartasAtaqueEmCampo = new ArrayList<>();
    }

    @Override
    public void inserirDeck(Deck deckParty) {
        deckParty = new DeckParty();
    }

    @Override
    public void verificaCarta(CartaAtaque cartaAtaque, Jogador jogador) {
        if(cartasAtaqueEmCampo.size() >= 34){
            System.out.println("Limite de cartas em campo atingido (34 cartas)");
        } else {
            cartasAtaqueEmCampo.add(cartaAtaque);
        }
    }

    @Override
    public void encerrarPartida(List<Jogador> jogadores) {
        this.partidaEmAndamento = false;
        System.out.println("Partida encerrada.");
        for(Jogador jogador : jogadores){
            if(jogador.vivo){
                System.out.println("Jogador vencedor: " + jogador.nome);
            }
        }
    }

    public void verificaVida(List<Jogador> jogadores){
        for(Jogador jogador: jogadores){
            if(jogador.HP <=0){
                jogador.vivo = false;
                jogadores.remove(jogador);
                if(jogadores.size()==1){
                    encerrarPartida(jogadores);
                }
            } else {
                jogador.vivo = true;
            }
        }
    }


}
