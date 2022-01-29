package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //6. Programa para ler três números e mostrar o maior deles.
        System.out.println("Informe três números, separados por SPACE ou dando ENTER para cada valor inserido");
        double primeiroNumeroInformado = input.nextDouble();
        double segundoNumeroInformado = input.nextDouble();
        double terceiroNumeroInformado = input.nextDouble();
        double maxPrimeiroSegundo = Math.max(primeiroNumeroInformado, segundoNumeroInformado);
        if (maxPrimeiroSegundo > terceiroNumeroInformado) {
            System.out.println("O valor máximo dentre os números informados é: " + maxPrimeiroSegundo);
        } else if (maxPrimeiroSegundo == terceiroNumeroInformado) {
            System.out.println("Os valores valores informados são equivalentes dentre si");
        } else {
            System.out.println("O valor máximo dentre os números informados é: " + terceiroNumeroInformado);
        }
    }
}
