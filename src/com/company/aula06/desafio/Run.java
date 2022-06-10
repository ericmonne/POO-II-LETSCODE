package com.company.aula06.desafio;

import com.company.aula06.desafio.classes.*;
import com.company.aula06.desafio.interfaces.IProduto;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        AlbumMusical album01 = new AlbumMusical("Disco da Madonna", 10, 50);
        String genero01 = "pop";
        String musico01 = "Madonna";
        String selo01 = "RCA";
        String[] generos = new String[1];
        generos[0] = genero01;
        String[] musicos = new String[1];
        musicos[0] = musico01;
        String[] selos = new String[1];
        selos[0] = selo01;

        album01.setGeneros(generos);
        album01.setMusicosOuBandas(musicos);
        album01.setSelos(selos);

        Estoque estoqueAlbunsMusicais = new Estoque();
        List<IProduto> albuns = new ArrayList<>();
        GerenciadorEstoque gerenciadorEstoque = new GerenciadorEstoque();
        gerenciadorEstoque.adicionarProduto(albuns, album01);
        estoqueAlbunsMusicais.setProdutos(albuns);
//        estoqueAlbunsMusicais.contarItens();
//        Caixa caixa = new Caixa();
//        caixa.setVerba(15);
//        caixa.exibirVerba();
//        gerenciadorEstoque.adicionarQuantidade(album01, 5);
//        gerenciadorEstoque.alterar(album01, "Like a Virgin", 18.5);
//
//        estoqueAlbunsMusicais.listarItens();
//        estoqueAlbunsMusicais.contarItens();
//        gerenciadorEstoque.remover(albuns, album01);
//        estoqueAlbunsMusicais.listarItens();
//        estoqueAlbunsMusicais.contarItens();

//        Brinquedo brinquedo01 = new Brinquedo("Power Ranger", 10, 10, "figura de ação");
//        System.out.println(brinquedo01.toString());
//        Brinquedo brinquedo02 = new Brinquedo("Barbie", 12, 12, "boneca");
//        System.out.println(brinquedo02.toString());
//        Filme filme01 = new Filme("Gladiador", 15, 15, "Universal");

        Livro livro01 = new Livro("Dracula", 20, 12, new String[]{"terror", "drama"}, "Bram Stoker", "Martin Claret");
        System.out.println(livro01.toString());
        Livraria livraria = new Livraria();
        Estoque estoqueLivros = new Estoque();
        GerenciadorEstoque gerenciador = new GerenciadorEstoque();
        List<IProduto> livros = new ArrayList<>();
        livros.add(livro01);
        gerenciador.adicionarProduto(livros, livro01);
        Cliente cliente = new Cliente();
        cliente.setIdade(15);
        Caixa caixa = new Caixa();
        caixa.setVerba(15);
        livraria.setCaixa(caixa);
        livraria.operarVenda(livro01, cliente, 5);
        System.out.println(caixa.getVerba());

        album01.setRestrito(true);
        livraria.operarVenda(album01, cliente, 30);


//        Estoque estoqueBrinquedos = new Estoque();
//        List<IProduto> brinquedos = new ArrayList<>();
//        brinquedos.add(brinquedo01);
//        brinquedos.add(brinquedo02);
//        estoqueBrinquedos.setProdutos(brinquedos);
//
//        gerenciadorEstoque.setEstoqueGeral(estoqueAlbunsMusicais);
//        gerenciadorEstoque.setEstoqueGeral(estoqueBrinquedos);
//        gerenciadorEstoque.listarTudo();

    }
}
