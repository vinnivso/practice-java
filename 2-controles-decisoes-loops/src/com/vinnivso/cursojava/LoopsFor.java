package com.vinnivso.cursojava;

public class LoopsFor {
    public static void main (String[] args) {

        //FOR COM UMA VARIÁVEL
        for (int i = 0; i < 5; i++) {
            System.out.println("i tem valor: " + i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println("i tem o valor: " + i);
        }


        //FOR COM MAIS DE UMA VARIÁVEL
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i tem valor: " + i + " e j tem valor: " + j);
        }

        for (int i = 0, j = 0; i < 5 && j < 5; i++, j++) {
            System.out.println("i tem valor: " + i + " e j tem valor: " + j);
        }


        //FOR COM PARTES AUSENTES
        int i = 0;
        for (; i <10;) {
            System.out.println("i tem valor: " + i);
            i += 2;
        }


        //FOR SEM CORPO
        int soma = 0;
        for ( i = 1; i < 5; soma += i++) {
            System.out.println("O valor da soma é: " + soma);
        }

        //NÃO RECOMENDADO ESSA UTILIZAÇÃO, POIS NÃO POSSUI A ESTRUTURA DE DEFINIÇÃO DO ESCOPO.
        for ( i = 1; i < 5; soma += i++)
            System.out.println("O valor da soma é: " + soma);
    }
}
