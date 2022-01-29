package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //11. Salário Tabajara.
        System.out.println("Informe seu salário");
        double salarioInformado = input.nextDouble();
        double percentual = 0;
        if (salarioInformado <= 280) {
            percentual = 20;
        } else if (salarioInformado > 280 && salarioInformado < 700) {
            percentual = 15;
        } else if (salarioInformado >= 700 && salarioInformado < 1500) {
            percentual = 10;
        } else if (salarioInformado >= 1500) {
            percentual = 5;
        }
        double aumento = salarioInformado * (percentual / 100);
        double salarioAjustado = salarioInformado + aumento;
        System.out.println("Salário: " + salarioInformado);
        System.out.println("Percentual: " + percentual);
        System.out.println("Aumento: " + aumento);
        System.out.println("Salário ajustado: " + salarioAjustado);
    }
}
