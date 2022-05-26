package com.company.aula02.funcionarios;

import java.util.List;

public class GerenciadorFuncionarios {
    public void admitirNovosFuncionarios(){
      List<Funcionario> novosFuncionarios = new LeitorArquivoTexto().recuperarDadosNovosFuncionarios();
      for(Funcionario funcionario : novosFuncionarios){
          System.out.println("Bem-vindo à empresa: " + funcionario);
      }
    }
}
