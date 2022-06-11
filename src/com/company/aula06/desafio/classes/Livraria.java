package com.company.aula06.desafio.classes;

import com.company.aula06.desafio.interfaces.*;

public class Livraria implements ILivraria {

    private Caixa caixa;
    private Estoque estoque;
    private final double DESCONTO_LIVROS = 0.15;

    private boolean autorizaVenda(IProduto produto, ICliente cliente) {
        if (produto.isRestrito()) {
            if (cliente.getIdade() >= 18) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    private boolean verificaQuantidade(IProduto produto, int quantidadeVendida) {
        if (quantidadeVendida <= produto.getQuantidade()) {
            return true;
        } else {
            return false;
        }
    }

    private double verificarParaDescontoLivros(double valorLivros) {
        if (valorLivros > 200) {
            double valorFinal = valorLivros - (valorLivros * DESCONTO_LIVROS);
            return valorFinal;
        } else{
            return valorLivros;
        }
    }

    @Override
    public void operarVenda(IProduto produto, ICliente cliente, int quantidadeVendida) {
        double valorVenda = 0;
        if (!autorizaVenda(produto, cliente)) {
            System.out.printf("Venda do produto %s proibida para menores de idade.\n", produto.getNome());
        } else {
            if (!verificaQuantidade(produto, quantidadeVendida)) {
                System.out.printf("Não há %d itens de %s em estoque\n", quantidadeVendida, produto.getNome());
            } else {
                produto.setQuantidade(produto.getQuantidade() - quantidadeVendida);
                valorVenda = produto.getPreco() * quantidadeVendida;
                System.out.printf("VENDA \nNome - Quantidade - Preço - Valor Total\n%s - %s - R$%.2f - R$%.2f \n", produto.getNome(), quantidadeVendida, produto.getPreco(), valorVenda);

                double valorFinal = 0;
                if(produto instanceof Livro){
                    valorFinal = verificarParaDescontoLivros(valorVenda);
                }else{
                    valorFinal = valorVenda;
                }
                caixa.setVerba(caixa.getVerba() + valorFinal);
                System.out.printf("Valor total da compra: R$%.2f\n", valorFinal);
            }
        }
    }

    @Override
    public Caixa getCaixa() {
        return caixa;
    }

    @Override
    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }
}
