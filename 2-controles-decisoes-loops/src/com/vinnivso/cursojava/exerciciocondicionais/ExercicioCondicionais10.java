package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //10. Programa M-Matutino, V-Vespertino e N-Noturno, sendo assim, "Bom dia", "Boa tarde", "Boa Noite" ou
        // "Valor Indálido!".
        System.out.println("Informe seu turno de estudo, como 'M-Matutino','V-Vespertino' e 'N-Noturno'");
        String periodoInformado = input.nextLine();
        switch (periodoInformado.toUpperCase()) {
            case "M" -> System.out.println("Matutino");
            case "V" -> System.out.println("Vespertino");
            case "N" -> System.out.println("Noturno");
            default -> System.out.println("Valor Inválido!");
        }
    }
}
