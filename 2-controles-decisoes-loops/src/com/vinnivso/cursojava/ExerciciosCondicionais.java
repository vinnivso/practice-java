package com.vinnivso.cursojava;

import java.util.Scanner;

public class ExerciciosCondicionais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        //1. Programa que peça dois números e imprima o maior deles.
//        System.out.println("Digite o primeiro valor");
//        double primeiroValor = scan.nextDouble();
//        System.out.println("Digite o segundo valor");
//        double segundoValor = scan.nextDouble();
//        if (primeiroValor > segundoValor) {
//            System.out.println(primeiroValor + " é maior que " + segundoValor);
//        } else if (segundoValor > primeiroValor) {
//            System.out.println(segundoValor + " é maior que " + primeiroValor);
//        } else {
//            System.out.println("Os valores informados são equivalentes");
//        }
//
//
//        //2. Programa que peça um valor e diga se é negativo ou positivo.
//        System.out.println("Digite um valor valor inteiro");
//        double valorInformado = scan.nextDouble();
//        if (valorInformado < 0) {
//            System.out.println("O valor informado é negativo: " + valorInformado);
//        } else {
//            System.out.println("O valor informado é positivo: " + valorInformado);
//        }


        //3. Programa que verifica "M" ou "F"
        System.out.println("Informe seu sexo M para Masculino ou F para Feminino");
        String stringInformada = scan.nextLine();
        switch (stringInformada) {
            case "M" -> System.out.println(stringInformada + " - Masculino");
            case "F" -> System.out.println(stringInformada + " - Feminino");
            default -> System.out.println(stringInformada + " Representa um sexo inválido");
        }
    }
}
