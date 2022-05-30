package com.company.aula02.exercicio;

import java.util.ArrayList;
import java.util.List;

public class DeckVersus extends Deck {
    List<CartaAtaque> cartasAtaque= new ArrayList<>(20);
    List<CartaComum> cartasComuns = new ArrayList<>(22);
    List<CartaAtaquesEspeciais> cartasAtaquesEspeciais = new ArrayList<>(8);
}
