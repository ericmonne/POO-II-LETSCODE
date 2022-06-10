package com.company.aula06.desafio.interfaces;

import com.company.aula06.desafio.classes.Cliente;

public interface IProduto {
    String getNome();
    int getId();
    double getPreco();
    void setNome(String nome);
    void setPreco(double preco);
    int getQuantidade();
    void setQuantidade(int quantidade);

    boolean isRestrito();

    void setRestrito(boolean restrito);

    String toString();

}
