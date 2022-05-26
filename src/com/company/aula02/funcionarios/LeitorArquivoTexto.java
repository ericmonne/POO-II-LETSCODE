package com.company.aula02.funcionarios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeitorArquivoTexto implements IIntegradorNovosFuncionarios{

    @Override
    public List<Funcionario> recuperarDadosNovosFuncionarios() {

        try {
            List<Funcionario> funcionarios = new ArrayList<>();
            Path filePath = Paths.get("C:/Users/ericm/IdeaProjects/poo-ii-letscode/src/com/company/aula02/funcionarios/arquivo.txt");
            List<String> dadosFuncionarios = Files.readAllLines(filePath);
            for(String informacaoFuncionario : dadosFuncionarios){
                String[] dadosSeparados = informacaoFuncionario.split(" ");
                funcionarios.add(new Funcionario(dadosSeparados[0], dadosSeparados[1]));
            }
            return funcionarios;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Collections.emptyList();
    }

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new LeitorArquivoTexto().recuperarDadosNovosFuncionarios();
        for(Funcionario funcionario : funcionarios){
            System.out.println(funcionario);
        }
    }

}
