package com.company.aula01.jogo;

public interface IMerchant {

    String sell(String item);
    String buy(String item);
    String talk(int iterations);
    String leave();
}
