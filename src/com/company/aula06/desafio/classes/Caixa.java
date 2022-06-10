package com.company.aula06.desafio.classes;

import com.company.aula06.desafio.interfaces.ICaixa;

public class Caixa implements ICaixa {

    private double verba;

    @Override
    public void exibirVerba() {
        System.out.printf("Dinheiro em caixa: R$%.2f\n", this.verba);
    }

    @Override
    public double getVerba() {
        return verba;
    }

    @Override
    public void setVerba(double verba) {
        this.verba = verba;
    }
}
