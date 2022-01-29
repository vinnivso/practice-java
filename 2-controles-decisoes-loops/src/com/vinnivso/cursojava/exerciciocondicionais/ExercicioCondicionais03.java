package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //3. Programa que verifica "M" ou "F"
        System.out.println("Informe seu sexo M para Masculino ou F para Feminino");
        String stringInformada = input.nextLine();
        switch (stringInformada) {
            case "M" -> System.out.println(stringInformada + " - Masculino");
            case "F" -> System.out.println(stringInformada + " - Feminino");
            default -> System.out.println(stringInformada + " Representa um sexo inválido");
        }
    }
}
