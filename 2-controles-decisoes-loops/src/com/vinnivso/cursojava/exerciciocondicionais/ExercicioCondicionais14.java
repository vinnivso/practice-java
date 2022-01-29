package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //14. Programa para ler notas e dizer APROVADO/REPROVADO
        System.out.println("Informe a nota da P1");
        double notaP1 = input.nextDouble();
        System.out.println("Informe a nota da P2");
        double notaP2 = input.nextDouble();

        double mediaProvas = (notaP1 + notaP2) / 2;
        String conceito = null;
        if (mediaProvas <= 10 && mediaProvas > 9) {
            conceito = "A";
        } else if (mediaProvas <= 9 && mediaProvas > 7.5) {
            conceito = "B";
        } else if (mediaProvas <= 7.5 && mediaProvas > 6.0) {
            conceito = "C";
        } else if (mediaProvas <= 6.0 && mediaProvas > 4.0) {
            conceito = "D";
        } else if (mediaProvas <= 4.0 && mediaProvas >= 0) {
            conceito = "E";
        } else {
            conceito = "Inválido";
        }
        System.out.println("Nota da P1: " + notaP1);
        System.out.println("Nota da P2: " + notaP2);
        System.out.println("Média das Notas: " + decimalFormat.format(mediaProvas));
        System.out.println("O conceito do aluno é: " + conceito);

        switch (conceito) {
            case "A", "B", "C" -> System.out.println("APROVADO");
            case "D", "E" -> System.out.println("REPROVADO");
            default -> System.out.println("INVÁLIDO");
        }
    }
}
