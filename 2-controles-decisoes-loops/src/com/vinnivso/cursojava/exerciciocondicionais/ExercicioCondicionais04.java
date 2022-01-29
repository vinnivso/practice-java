package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //4. Programa que verifique vogal ou consoante.
        System.out.println("Digite qualquer letra para verificar se é vogal ou consoante");
        String stringVogalConsoante = input.nextLine();
        switch (stringVogalConsoante.toUpperCase()) {
            case "A","E","I","O","U" -> System.out.println("Caracter informado corresponde uma " +
                    "vogal");
            default -> System.out.println("Caracter informado corresponde uma consoante");
        }
    }
}
