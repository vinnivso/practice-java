package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("###,###.##");

        double salario = 1000; //95
        double percentual = 1.5; // 96
        salario += (salario/100) * percentual; //96

        for (int i=1997; i<=2015; i++){
            percentual *= 2;
            salario += (salario/100) * percentual;
            System.out.println(i + " = " + decimalFormat.format(salario) + " - " + percentual + "%");
        }
    }
}
