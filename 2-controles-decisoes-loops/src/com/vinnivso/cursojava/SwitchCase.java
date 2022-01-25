package com.vinnivso.cursojava;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Qual dia da semana?
        System.out.println("Informe um dia da semana (1-7).");
        int diaDaSemana = scan.nextInt();
        switch (diaDaSemana) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("O valor informado não corresponde um dia da semana válido");
        }

        //Dia de semana ou final de semana?
        System.out.println("Dia de semana ou fim de semana?");
        int diaInformado = scan.nextInt();
        switch (diaInformado) {
            case 2, 3, 4, 5, 6 -> System.out.println("Dia útil da semana");
            case 1, 7 -> System.out.println("Fim de semana");
            default -> System.out.println("Valor informado não corresponde um dia de semana válido");
        }

        //No SWITCH CASE a condição pode ser somente BYTE, SHORT, INT, CHAR, ENUM e STRING.
    }
}
