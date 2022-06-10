package com.company.aula06.desafio.futuriveis;

import com.company.aula06.desafio.futuriveis.IAtribuidorDesconto;
import com.company.aula06.desafio.interfaces.IProduto;

public abstract class AtribuidorDesconto implements IAtribuidorDesconto {

    @Override
    public double verificarParaDesconto(double valor) {
       return valor;
    }

    @Override
    public double atribuirDesconto(double valorVenda, IProduto produto){
        return valorVenda;
    }
}
