package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //11. Altera o programa 10 para mostrar no final a soma dos números.
        System.out.println("Entre com o primeiro número inteiro");
        int primeiroNumeroParaSomar = input.nextInt();
        System.out.println("Entre com o segundo número inteiro");
        int segundoNumeroParaSomar = input.nextInt();
        int soma = 0;
        for (int i = primeiroNumeroParaSomar; i < segundoNumeroParaSomar; soma += i++) {
            System.out.println("Soma atual: " + soma);
        }
        System.out.println("Soma total: " + soma);
    }
}
