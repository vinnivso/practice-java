package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //2. Programa que peça um valor e diga se é negativo ou positivo.
        System.out.println("Digite um valor valor inteiro");
        double valorInformado = input.nextDouble();
        if (valorInformado < 0) {
            System.out.println("O valor informado é negativo: " + valorInformado);
        } else if (valorInformado == 0) {
            System.out.println("O valor informado é nulo");
        } else {
            System.out.println("O valor informado é positivo: " + valorInformado);
        }
    }
}
