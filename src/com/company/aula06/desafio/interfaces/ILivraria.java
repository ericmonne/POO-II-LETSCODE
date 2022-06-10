package com.company.aula06.desafio.interfaces;


public interface ILivraria {

    boolean autorizaVenda(IProduto produto, ICliente cliente);

    boolean verificaQuantidade(IProduto produto, int quantidadeVendida);

    double verificarParaDescontoLivros(double valorLivros);

    void operarVenda(IProduto produto, ICliente cliente, int quantidadeVendida);
}
