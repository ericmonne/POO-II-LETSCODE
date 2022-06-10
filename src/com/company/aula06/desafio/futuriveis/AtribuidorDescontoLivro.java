package com.company.aula06.desafio.futuriveis;

import com.company.aula06.desafio.classes.Livro;
import com.company.aula06.desafio.interfaces.IProduto;

public class AtribuidorDescontoLivro extends AtribuidorDesconto {

    private final double DESCONTO_LIVROS = 0.15;

    public double verificarParaDesconto(double valorLivros) {
        if (valorLivros > 200) {
            double valorFinal = valorLivros - (valorLivros * DESCONTO_LIVROS);
            return valorFinal;
        } else{
            return valorLivros;
        }
    }

    public double atribuirDesconto(double valorVenda, IProduto produto){
        if(produto instanceof Livro){
            double valorFinal = verificarParaDesconto(valorVenda);
            return valorFinal;
        }
        return valorVenda;
    }
}
