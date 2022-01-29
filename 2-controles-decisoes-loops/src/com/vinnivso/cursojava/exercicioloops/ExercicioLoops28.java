package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Entre com um número");
        int num = input.nextInt();
        boolean primo = true;

        for (int i=2; i<num; i++){
            if (num % i == 0){
                System.out.println("Não é primo - divisível por " + i);
                primo = false;
                break;
            }
        }
        if (primo){
            System.out.println("É número primo");
        }
    }
}
