package com.company.aula06.desafio.futuriveis;

import com.company.aula06.desafio.interfaces.IProduto;

public interface IAtribuidorDesconto {
    double verificarParaDesconto(double valor);

    double atribuirDesconto(double valorVenda, IProduto produto);
}
