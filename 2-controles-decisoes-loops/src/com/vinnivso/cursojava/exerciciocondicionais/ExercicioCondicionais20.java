package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //20. Programa para fazer perguntas para suspeitas de um crime.
        System.out.println("Telefonou para vítima? Responder 's' ou 'n' ");
        String primeiraResposta = input.next();
        System.out.println("Esteve no local do crime? Responder 's' ou 'n' ");
        String segundaResposta = input.next();
        System.out.println("Mora perto da vítima? Responder 's' ou 'n' ");
        String terceiraResposta = input.next();
        System.out.println("Devia para a vítima? Responder 's' ou 'n' ");
        String quartaResposta = input.next();
        System.out.println("Já trabalhou com a vítima?");
        String quintaResposta = input.next();

        int contador = 0;
        if (primeiraResposta.equalsIgnoreCase("S")) {
            contador ++;
        }
        if (segundaResposta.equalsIgnoreCase("S")) {
            contador ++;
        }
        if (terceiraResposta.equalsIgnoreCase("S")) {
            contador ++;
        }
        if (quartaResposta.equalsIgnoreCase("S")) {
            contador ++;
        }
        if (quintaResposta.equalsIgnoreCase("S")) {
            contador ++;
        }

        if (contador == 2) {
            System.out.println("Suspeito");
        } else if (contador == 3 || contador == 4) {
            System.out.println("Cúmplice");
        } else if (contador == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}
