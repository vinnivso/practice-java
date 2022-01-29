package com.vinnivso.cursojava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //5. Programa que refatore o EX.4, usuário passando os parâmetros dos países.
        boolean validaInputDoUsuario = false;
        int popAUser;
        int popBUser;
        double crescimentoA;
        double crescimentoB;
        int i = 0;

        do {
            System.out.println("Informe a população do país A");
            popAUser = input.nextInt();
            if (!(popAUser >= 0)) {
                System.out.println("O valor da população deve ser maior que ZERO");
            } else {
                validaInputDoUsuario = true;
                System.out.println("Informação da população A: " + popAUser);
            }
        } while (!validaInputDoUsuario);

        validaInputDoUsuario = false;
        do {
            System.out.println("Informe a população do país B");
            popBUser = input.nextInt();
            if (!(popBUser >= 0)) {
                System.out.println("O valor da população deve ser maior que ZERO");
            } else {
                validaInputDoUsuario = true;
                System.out.println("Informação da população B: " + popBUser);
            }
        } while (!validaInputDoUsuario);

        validaInputDoUsuario = false;
        do {
            System.out.println("Informe a taxa de crescimento do país A");
            crescimentoA = input.nextInt();
            if (!(crescimentoA >= 0)) {
                System.out.println("O valor da taxa de crescimento deve ser maior que ZERO");
            } else {
                validaInputDoUsuario = true;
                System.out.println("Taxa de crescimento da população A: " + crescimentoA + "%");
            }
        } while (!validaInputDoUsuario);

        validaInputDoUsuario = false;
        do {
            System.out.println("Informe a taxa de crescimento do país B");
            crescimentoB = input.nextInt();
            if (!(crescimentoB >= 0)) {
                System.out.println("O valor da taxa de crescimento deve ser maior que ZERO");
            } else {
                validaInputDoUsuario = true;
                System.out.println("Taxa de crescimento da população B: " + crescimentoB + "%");
            }
        } while (!validaInputDoUsuario);

        while (popAUser <= popBUser) {
            popAUser += popAUser * (crescimentoA / 100);
            popBUser += popBUser * (crescimentoB / 100);
            i++;
        }
        System.out.println("População do País A: " + popAUser);
        System.out.println("População do País B: " + popBUser);
        System.out.println("Para o país A ultrapassar ou igualar com a população do país B, vão demorar " + i + " anos");
    }

}
