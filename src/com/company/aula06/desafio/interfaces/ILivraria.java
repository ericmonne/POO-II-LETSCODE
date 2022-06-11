package com.company.aula06.desafio.interfaces;


import com.company.aula06.desafio.classes.Caixa;

public interface ILivraria {


    void operarVenda(IProduto produto, ICliente cliente, int quantidadeVendida);

    Caixa getCaixa();

    void setCaixa(Caixa caixa);
}
