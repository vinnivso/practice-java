package com.vinnivso.cursojava.aulas;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //BREAK -> Muito utilizado para saída de Loops, pode ser utilizado junto com um rótulo (label).
        System.out.println("Entre com um número inteiro");
        int num = input.nextInt();
        System.out.println("Entre com um limite de valor inteiro");
        int max = input.nextInt();

        for (int i = num; i <= max; i++) {
            if (i % 7 == 0) {
                System.out.println("O valor de i é: " + i);
                break;
            }
        }


        //BREAK COM RÓTULOS - Ou GOTO em outras linguagens, muito pouco utilizado o BREAK COM RÓTULOS, Não é uma boa prática.
        for (int i = 0; i < 4; i++) {
            rotulo1: {
                rotulo2: {
                    rotulo3: {
                        if (i == 1) break rotulo1;
                        if (i == 2) break rotulo2;
                        if (i == 2) break rotulo3;
                        System.out.println("rotulo3");
                    }
                    System.out.println("rotulo2");
                }
                System.out.println("rotulo1");
            }
            System.out.println("valor de i: " + i);
        }
        System.out.println("Saiu do loop.");




        //CONTINUE -> Complementa o BREAK, continua o loop na próxima iteração.

        //No programa seguinte, estamos fazendo com que seja impresso no console todos os números que não são divísiveis por 7.
        System.out.println("Entre com um número inteiro");
        int numInput = input.nextInt();
        System.out.println("Entre com um limite de valor inteiro");
        int maxNumInput = input.nextInt();

        for (int i = numInput; i <= maxNumInput; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }
    }
}
