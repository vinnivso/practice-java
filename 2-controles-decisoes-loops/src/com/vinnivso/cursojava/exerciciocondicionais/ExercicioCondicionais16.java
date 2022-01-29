package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //16. Faça um programa que calcule as raízes da equação de segundo grau. ax² + bx + c.
        System.out.println("Informe os valores de a, b e c. Cada valor separado por SPACE ou ENTER");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double delta = Math.pow(b, 2) - (4 * a * c);
        if (a == 0) {
            double x = -c / b;
            System.out.println("Os parâmetros inseridos são de uma equação do primeiro grau, logo: x = " + decimalFormat.format(x));
        } else {
            if (delta < 0) {
                System.out.println("O resultado de Delta é < 0, sendo assim a equação não possui raízes reais.");
            } else {
                System.out.println("O valor de delta, corresponde: " + decimalFormat.format(delta));
                double x1 = (-b + Math.sqrt(delta)) / 2 * a;
                double x2 = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.println("x1 = " + decimalFormat.format(x1));
                System.out.println("x2 = " + decimalFormat.format(x2));
            }
        }
    }
}
