package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Entre com um número");
        int num = input.nextInt();
        boolean primo;

        for (int i=1; i<=num; i++){
            primo = true;
            for (int j=2; j<i; j++){
                if (i % j == 0){
                    primo = false;
                }
            }

            if (primo){
                System.out.println(i);
            }
        }
    }
}
