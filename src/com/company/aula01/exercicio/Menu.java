package com.company.aula01.exercicio;

import java.util.Scanner;

public class Menu {


    public void inicializar(){
        Soma soma = new Soma();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Subtracao subtracao = new Subtracao();

        Scanner scanner = new Scanner(System.in);
        System.out.println("***** CALCULADORA INICIALIZADA *****");
        int escolha;
        do{
            System.out.println("====================================");
            System.out.println("Escolha uma opção: \n 1-SOMA \n 2-SUBTRAÇÃO \n 3-MULTIPLICAÇÃO \n 4-DIVISÃO \n 5-SAIR");
            escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha){
                case 1:
                    soma.realizarOperacao();
                    break;
                case 2:
                    subtracao.realizarOperacao();
                    break;
                case 3:
                    multiplicacao.realizarOperacao();
                    break;
                case 4:
                    divisao.realizarOperacao();
                    break;
                case 5:
                    System.out.println("CALCULADORA ENCERRADA");
                    break;
                default:
                    System.err.println("Valor inválido. Tente novamente.");
                    break;
            }
        }while(escolha!=5);
    }
}
