package com.vinnivso.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        /*
         * 14. Parâmetro arquivo para download em MB e velocidade de um link na Internet em Mbps. t em minutos.
         */
        System.out.println("Tamanho do arquivo em MB.");
        double arquivo = scan.nextDouble();
        System.out.println("Velocidade de conexão da internet");
        double velocidade = scan.nextDouble();
        double tempo = arquivo / velocidade;

        System.out.println("Tempo de download é "+decimalFormat.format(tempo));
    }
}
