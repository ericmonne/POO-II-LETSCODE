package com.company.aula01.exercicio;

import java.util.Scanner;

public class Divisao implements ICalculo{

    private double resultado;

    @Override
    public double calcular(double numero1, double numero2) {
        if(numero2 != 0) {
            resultado = numero1 / numero2;
            return resultado;
        } else{
            System.err.println("Erro: não é possível dividir por 0");
            return resultado;
        }
    }

    @Override
    public void exibirResultado(double numero1, double numero2) {
        calcular(numero1, numero2);
        if(resultado != 0) {
            System.out.println(numero1 + " dividido por " + numero2 + " é igual a " + resultado);
        }
    }

    @Override
    public void realizarOperacao(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        double numero1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Informe o segundo número: ");
        double numero2 = Double.parseDouble(scanner.nextLine());
        exibirResultado(numero1, numero2);
    }

    public double getResultado() {
        return resultado;
    }
}
