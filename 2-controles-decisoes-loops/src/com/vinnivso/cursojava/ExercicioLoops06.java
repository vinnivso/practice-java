package com.vinnivso.cursojava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //6. Programa que imprime na tela os números de 1 a 20.
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
            System.out.println("i tem valor: " + i );
        }
    }
}
