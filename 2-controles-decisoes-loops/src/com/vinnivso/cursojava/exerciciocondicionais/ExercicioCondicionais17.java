package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //17. Ano bissexto ou não?
        System.out.println("Informe o ano que deseja saber se é bissexto");
        long anoInformado = input.nextLong();
        if ((anoInformado % 4 == 0 && anoInformado % 100 != 0) || (anoInformado % 400 == 0)) {
            System.out.println("O ano inserido é bissexto.");
        } else {
            System.out.println("O ano inserido não é bissexto.");
        }
    }
}
