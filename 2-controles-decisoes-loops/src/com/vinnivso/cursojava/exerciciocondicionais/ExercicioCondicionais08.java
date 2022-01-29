package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //8. Pergunte o preço de três produtos e informe qual deve ser comprado, com base no menor preço.
        System.out.println("Informe o preço da laranja");
        double precoLaranja = input.nextDouble();
        System.out.println("Informe o preço da uva");
        double precoUva = input.nextDouble();
        System.out.println("Informe o preço da Maça");
        double precoMaca = input.nextDouble();

        if (precoLaranja < precoUva && precoLaranja < precoMaca) {
            System.out.println("Você deve comprar a laranja, que está mais barata");
        } else if (precoUva < precoLaranja && precoUva < precoMaca) {
            System.out.println("Você deve comprar a Uva, que está mais barata");
        } else if (precoMaca < precoLaranja && precoMaca < precoUva) {
            System.out.println("Você deve comprar a Maça, que está mais barata");
        } else {
            System.out.println("Os preços são equivalentes");
        }
    }
}
