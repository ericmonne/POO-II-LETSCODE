package com.company.aula02.exercicio;

import java.util.ArrayList;
import java.util.List;

public class TabuleiroVersus implements ITabuleiro {

    protected boolean partidaEmAndamento;


    public void iniciarJogo() {
        Jogador anfitriao = new Jogador();
        Jogador desafiante = new Jogador();
        inserirDeck(anfitriao.deck);
        inserirDeck(desafiante.deck);
        anfitriao.cartasAtaqueEmCampo = new ArrayList<>();
        desafiante.cartasAtaqueEmCampo = new ArrayList<>();
        anfitriao.cartasAtaquesEspeciaisEmCampo = new ArrayList<>();
        desafiante.cartasAtaquesEspeciaisEmCampo = new ArrayList<>();
    }

    @Override
    public void inserirDeck(Deck deckVersus) {
        deckVersus = new DeckVersus();
    }

    @Override
    public void verificaCarta(CartaAtaque cartaAtaque, Jogador jogador) {
        if (cartaAtaque instanceof CartaAtaquesEspeciais) {
            CartaAtaquesEspeciais cartaAtaquesEspeciais = (CartaAtaquesEspeciais) cartaAtaque;
            if (jogador.cartasAtaquesEspeciaisEmCampo.size() >= 2) {
                System.out.println("Limite de cartas de ataque especiais em campo atingido (2 cartas)");
            } else {
                jogador.cartasAtaquesEspeciaisEmCampo.add(cartaAtaquesEspeciais);
            }
        } else if (jogador.cartasAtaqueEmCampo.size() >= 5) {
            System.out.println("Limite de cartas de ataque em campo atingido (5 cartas)");
        } else {
            jogador.cartasAtaqueEmCampo.add(cartaAtaque);
        }
    }

    @Override
    public void encerrarPartida(List<Jogador> jogadores) {
        this.partidaEmAndamento = false;
        System.out.println("Partida encerrada.");
        for (Jogador jogador : jogadores) {
            if (jogador.vivo) {
                System.out.println("Jogador vencedor: " + jogador.nome);
            } else {
                System.out.println("Jogador perdedor: " + jogador.nome);
            }
        }
    }

    public void verificaVida(List<Jogador> jogadores) {
        for (Jogador jogador : jogadores) {
            if (jogador.HP <= 0) {
                jogador.vivo = false;
                encerrarPartida(jogadores);
            } else {
                jogador.vivo = true;
            }
        }
    }
}
