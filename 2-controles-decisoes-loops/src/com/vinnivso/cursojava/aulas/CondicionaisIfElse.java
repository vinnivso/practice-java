package com.vinnivso.cursojava.aulas;

import java.util.Scanner;

public class CondicionaisIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Programa para verificar maioridade.
        System.out.println("Informe sua idade.");
        long idade = scan.nextLong();
        if (idade >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }


        //Programa para verificar a possibilidade da compra.
        System.out.println("Entre com o preço do item.");
        double valor = scan.nextDouble();
        if (valor <= 10) {
            System.out.println("Está barato , pode comprar.");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Pode pedir desconto.");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pesquise por preços melhores.");
        } else {
            System.out.println("Muito caro!");
        }
    }
}
