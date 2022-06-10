package com.company.aula06.desafio.interfaces;

import com.company.aula06.desafio.classes.Produto;

import java.util.List;

public interface IGerenciadorEstoque {

    void listarTudo();
    void setEstoqueGeral(IEstoque estoqueGeral);
    void adicionarProduto(List<IProduto> produtos, Produto produto);
    void alterar(IProduto produto, String nome, double preco);
    void adicionarQuantidade(IProduto produto, int quantidade);
    void remover(List<IProduto> produtos, Produto produto);

}
