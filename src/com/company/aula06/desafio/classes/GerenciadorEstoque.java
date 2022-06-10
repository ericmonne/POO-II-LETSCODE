package com.company.aula06.desafio.classes;

import com.company.aula06.desafio.interfaces.IEstoque;
import com.company.aula06.desafio.interfaces.IGerenciadorEstoque;
import com.company.aula06.desafio.interfaces.IProduto;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEstoque implements IGerenciadorEstoque {

    List<IEstoque> estoqueGeral = new ArrayList<>();

    @Override
    public void listarTudo(){
        for(IEstoque estoque : estoqueGeral){
            estoque.listarItens();
        }
    }

    @Override
    public void setEstoqueGeral(IEstoque estoqueGeral) {
        this.estoqueGeral.add(estoqueGeral);
    }

    @Override
    public void adicionarProduto(List<IProduto> produtos, Produto produto) {
        produtos.add(produto);
    }

    @Override
    public void alterar(IProduto produto, String nome, double preco) {
        produto.setNome(nome);
        produto.setPreco(preco);
    }

    @Override
    public void adicionarQuantidade(IProduto produto, int quantidade) {
        produto.setQuantidade(produto.getQuantidade() + quantidade);
    }

    @Override
    public void remover(List<IProduto> produtos, Produto produto) {
       produtos.remove(produto);
    }
}
