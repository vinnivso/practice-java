package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //21. Programa que calcula gasto em posto de gasolina.
        System.out.println("Entre com a qtd de litros vendidos");
        double litros = input.nextDouble();

        System.out.println("Entre com o tipode combustível");
        String tipo = input.next();

        double precoGas = 2.5;
        double precoAlc = 1.9;
        int percDesconto = 0;
        double total = 0;
        double totalDesc = 0;

        if (tipo.equalsIgnoreCase("a")){

            if (litros <= 20){
                percDesconto = 3;
            } else {
                percDesconto = 5;
            }

            total = litros * precoAlc;

        } else if (tipo.equalsIgnoreCase("g")){

            if (litros <= 20){
                percDesconto = 4;
            } else {
                percDesconto = 6;
            }

            total = litros * precoGas;
        }

        totalDesc = (total / 100) * percDesconto;

        double precoAPagar = total - totalDesc;

        System.out.println("Valor a ser pago: " + precoAPagar);
    }
}
