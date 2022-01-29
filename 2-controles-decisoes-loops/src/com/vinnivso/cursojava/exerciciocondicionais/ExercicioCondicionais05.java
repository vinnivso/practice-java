package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //5. Programa para ler duas notas parciais de um aluno.
        System.out.println("Informe a primeira nota");
        double primeiraNota = input.nextDouble();
        System.out.println("Informe a segunda nota");
        double segundaNota = input.nextDouble();
        double mediaDoAluno = (primeiraNota + segundaNota) / 2;
        if (mediaDoAluno >= 7 && mediaDoAluno < 10) {
            System.out.println("Aprovado");
        } else if (mediaDoAluno == 10) {
            System.out.println("Aprovado com distinção");
        } else if (mediaDoAluno > 10) {
            System.out.println("A nota máxima possível é 10");
        } else if (mediaDoAluno < 0) {
            System.out.println("A nota mínima possível é 0");
        } else {
            System.out.println("Reprovado");
        }
    }
}
