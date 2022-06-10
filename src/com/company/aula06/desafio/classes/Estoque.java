package com.company.aula06.desafio.classes;

import com.company.aula06.desafio.interfaces.IEstoque;
import com.company.aula06.desafio.interfaces.IProduto;

import java.util.List;

public class Estoque implements IEstoque {

    private List<IProduto> produtos;

    public List<IProduto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<IProduto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public void listarItens() {
        for(IProduto produto : produtos){
            System.out.println(produto.toString());
        }
    }

    @Override
    public void contarItens() {
        int contador = 0;
        for(IProduto produto : this.produtos){
            contador += produto.getQuantidade();
        }
        System.out.println("Total: " + contador);
    }
}
