package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //15. Programa verifica se é um triângulo e qual característica do mesmo, escaleno, isósceles ou equilátero.
        System.out.println("Entre com o valor do primeiro lado");
        double valorPrimeiroLado = input.nextDouble();
        System.out.println("Entre com o valor do segundo lado");
        double valorSegundoLado = input.nextDouble();
        System.out.println("Entre com o valor do terceiro lado");
        double valorTerceiroLado = input.nextDouble();

        if (((valorPrimeiroLado + valorSegundoLado) > valorTerceiroLado) || ((valorPrimeiroLado + valorTerceiroLado) > valorSegundoLado) || ((valorSegundoLado + valorTerceiroLado) > valorPrimeiroLado)) {
            if (valorPrimeiroLado == valorSegundoLado && valorPrimeiroLado == valorTerceiroLado) {
                System.out.println("Equilátero");
            } else if (valorPrimeiroLado == valorSegundoLado || valorPrimeiroLado == valorTerceiroLado || valorSegundoLado == valorTerceiroLado) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("Os valores informados não correspondem com um triângulo");
        }
    }
}
