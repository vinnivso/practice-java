package com.vinnivso.cursojava.aulas;

import java.util.Scanner;

public class MatrizesIrregulares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o número de pessoas que serão entrevistadas: ");
        int entrevistados = input.nextInt();

        String[][] nomesFilhos = new String[entrevistados][];
        int quantidadeFilhos;

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Entre com a quantidade de filhos");
            quantidadeFilhos = input.nextInt();
            nomesFilhos[i] = new String[quantidadeFilhos];

            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println("Digite o nome do filho " + (j + 1));
                nomesFilhos[i][j] = input.next();
            }
        }
        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Pessoa " + i + " tem " + nomesFilhos[i].length + " filhos");
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println(nomesFilhos[i][j]);
            }
        }
    }
}
