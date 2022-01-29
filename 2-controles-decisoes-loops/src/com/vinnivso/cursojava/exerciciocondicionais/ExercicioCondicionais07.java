package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //7. Programa para ler três número e mostrar o maior e menor deles.
        System.out.println("Informe três números, separados por SPACE ou dando ENTER para cada valor inserido");
        double firstInputNumber = input.nextDouble();
        double secondInputNumber = input.nextDouble();
        double thirdInputNumber = input.nextDouble();
        double minFirstSecond = Math.min(firstInputNumber, secondInputNumber);
        double maxFirstSecond = Math.max(firstInputNumber, secondInputNumber);
        if (minFirstSecond < thirdInputNumber && maxFirstSecond < thirdInputNumber) {
            System.out.println("O mínimo valor é: " + minFirstSecond + " e o máximo valor é: " + thirdInputNumber);
        } else if (minFirstSecond > thirdInputNumber && maxFirstSecond > thirdInputNumber) {
            System.out.println("O mínimo valor é: " + thirdInputNumber + " e o máximo valor é: " + maxFirstSecond);
        } else {
            System.out.println("O valores são equivalentes entre seus máximos e mínimos");
        }
    }
}
