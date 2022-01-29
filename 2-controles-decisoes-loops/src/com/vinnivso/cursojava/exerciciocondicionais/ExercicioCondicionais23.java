package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //23. Programa que simula compra realizada com cartão.
        System.out.println("Entre com o tipo da carne:");
        System.out.println("1 - file duplo");
        System.out.println("2 - alcatra");
        System.out.println("3 - picanha");
        int tipoInformado = input.nextInt();

        System.out.println("Entre com a quantidade (kg):");
        double qtd = input.nextDouble();

        double precoKg = 0;

        if (tipoInformado == 1){

            System.out.println(qtd + "kg - file duplo");

            if (qtd < 5){
                precoKg = 4.9;
            } else {
                precoKg = 5.8;
            }


        } else if (tipoInformado == 2){

            System.out.println(qtd + "kg - alcatra");

            if (qtd < 5){
                precoKg = 5.9;
            } else {
                precoKg = 6.8;
            }
        } else if (tipoInformado == 3){

            System.out.println(qtd + "kg - picanha");

            if (qtd < 5){
                precoKg = 6.9;
            } else {
                precoKg = 7.8;
            }
        }

        double totalQtdPrecoKg = qtd * precoKg;
        System.out.println(qtd + "kg * " + precoKg + " = " + totalQtdPrecoKg);

        System.out.println("Compra no cartão? digite 1 para sim:");
        int cartao = input.nextInt();

        if (cartao == 1){
            double desconto = (totalQtdPrecoKg / 100) * 5;
            System.out.println("Desconto de: " + desconto);
            System.out.println("Valor a pagar: " + (totalQtdPrecoKg - desconto));
        } else {
            System.out.println("Valor a pagar: " + totalQtdPrecoKg);
        }
    }
}
