package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ExercicioCondicionais09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //9. Programa que leia três números e mostre em ordem crescente. Resolvi com Array ao invés de IF/ ELSE.
        System.out.println("Digite três números, separados por SPACE ou por ENTER");
        double primeiroNumeroDigitado = input.nextDouble();
        double segundoNumeroDigitado = input.nextDouble();
        double terceiroNumeroDigitado = input.nextDouble();
        double[] array = new double[] {primeiroNumeroDigitado, segundoNumeroDigitado, terceiroNumeroDigitado};
        for (double i : array) {
            System.out.println(i+"");
        }
        Arrays.sort(array);
        System.out.println("\n Após aplicar a ordem crescente ...");
        for (double i : array) {
            System.out.println(i+"");
        }
    }
}
