package com.vinnivso.cursojava;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ExerciciosCondicionais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

//        //1. Programa que peça dois números e imprima o maior deles.
//        System.out.println("Digite o primeiro valor");
//        double primeiroValor1 = scan.nextDouble();
//        System.out.println("Digite o segundo valor");
//        double segundoValor = scan.nextDouble();
//        if (primeiroValor1 > segundoValor) {
//            System.out.println(primeiroValor1 + " é maior que " + segundoValor);
//        } else if (segundoValor > primeiroValor1) {
//            System.out.println(segundoValor + " é maior que " + primeiroValor1);
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
//
//
//        //3. Programa que verifica "M" ou "F"
//        System.out.println("Informe seu sexo M para Masculino ou F para Feminino");
//        String stringInformada = scan.nextLine();
//        switch (stringInformada) {
//            case "M" -> System.out.println(stringInformada + " - Masculino");
//            case "F" -> System.out.println(stringInformada + " - Feminino");
//            default -> System.out.println(stringInformada + " Representa um sexo inválido");
//        }
//
//
//        //4. Programa que verifique vogal ou consoante.
//        System.out.println("Digite qualquer letra para verificar se é vogal ou consoante");
//        String stringVogalConsoante = scan.nextLine();
//        switch (stringVogalConsoante.toUpperCase()) {
//            case "A","E","I","O","U" -> System.out.println("Caracter informado corresponde uma " +
//                    "vogal");
//            default -> System.out.println("Caracter informado corresponde uma consoante");
//        }


//        //5. Programa para ler duas notas parciais de um aluno.
//        System.out.println("Informe a primeira nota");
//        double primeiraNota = scan.nextDouble();
//        System.out.println("Informe a segunda nota");
//        double segundaNota = scan.nextDouble();
//        double mediaDoAluno = (primeiraNota + segundaNota) / 2;
//        if (mediaDoAluno >= 7 && mediaDoAluno < 10) {
//            System.out.println("Aprovado");
//        } else if (mediaDoAluno == 10) {
//            System.out.println("Aprovado com distinção");
//        } else if (mediaDoAluno > 10) {
//            System.out.println("A nota máxima possível é 10");
//        } else if (mediaDoAluno < 0) {
//            System.out.println("A nota mínima possível é 0");
//        } else {
//            System.out.println("Reprovado");
//        }


//        //6. Programa para ler três números e mostrar o maior deles.
//        System.out.println("Informe três números, separados por SPACE ou dando ENTER para cada valor inserido");
//        double primeiroNumeroInformado = scan.nextDouble();
//        double segundoNumeroInformado = scan.nextDouble();
//        double terceiroNumeroInformado = scan.nextDouble();
//        double maxPrimeiroSegundo = Math.max(primeiroNumeroInformado, segundoNumeroInformado);
//        if (maxPrimeiroSegundo > terceiroNumeroInformado) {
//            System.out.println("O valor máximo dentre os números informados é: " + maxPrimeiroSegundo);
//        } else if (maxPrimeiroSegundo == terceiroNumeroInformado) {
//            System.out.println("Os valores valores informados são equivalentes dentre si");
//        } else {
//            System.out.println("O valor máximo dentre os números informados é: " + terceiroNumeroInformado);
//        }


//        //7. Programa para ler três número e mostrar o maior e menor deles.
//        System.out.println("Informe três números, separados por SPACE ou dando ENTER para cada valor inserido");
//        double firstInputNumber = scan.nextDouble();
//        double secondInputNumber = scan.nextDouble();
//        double thirdInputNumber = scan.nextDouble();
//        double minFirstSecond = Math.min(firstInputNumber, secondInputNumber);
//        double maxFirstSecond = Math.max(firstInputNumber, secondInputNumber);
//        if (minFirstSecond < thirdInputNumber && maxFirstSecond < thirdInputNumber) {
//            System.out.println("O mínimo valor é: " + minFirstSecond + " e o máximo valor é: " + thirdInputNumber);
//        } else if (minFirstSecond > thirdInputNumber && maxFirstSecond > thirdInputNumber) {
//            System.out.println("O mínimo valor é: " + thirdInputNumber + " e o máximo valor é: " + maxFirstSecond);
//        } else {
//            System.out.println("O valores são equivalentes entre seus máximos e mínimos");
//        }


//        //8. Pergunte o preço de três produtos e informe qual deve ser comprado, com base no menor preço.
//        System.out.println("Informe o preço da laranja");
//        double precoLaranja = scan.nextDouble();
//        System.out.println("Informe o preço da uva");
//        double precoUva = scan.nextDouble();
//        System.out.println("Informe o preço da Maça");
//        double precoMaca = scan.nextDouble();
//
//        if (precoLaranja < precoUva && precoLaranja < precoMaca) {
//            System.out.println("Você deve comprar a laranja, que está mais barata");
//        } else if (precoUva < precoLaranja && precoUva < precoMaca) {
//            System.out.println("Você deve comprar a Uva, que está mais barata");
//        } else if (precoMaca < precoLaranja && precoMaca < precoUva) {
//            System.out.println("Você deve comprar a Maça, que está mais barata");
//        } else {
//            System.out.println("Os preços são equivalentes");
//        }


//        //9. Programa que leia três números e mostre em ordem crescente. Resolvi com Array ao invés de IF/ ELSE.
//        System.out.println("Digite três números, separados por SPACE ou por ENTER");
//        double primeiroNumeroDigitado = scan.nextDouble();
//        double segundoNumeroDigitado = scan.nextDouble();
//        double terceiroNumeroDigitado = scan.nextDouble();
//        double[] array = new double[] {primeiroNumeroDigitado, segundoNumeroDigitado, terceiroNumeroDigitado};
//        for (double i : array) {
//            System.out.println(i+"");
//        }
//        Arrays.sort(array);
//        System.out.println("\n Após aplicar a ordem crescente ...");
//        for (double i : array) {
//            System.out.println(i+"");
//        }


//        //10. Programa M-Matutino, V-Vespertino e N-Noturno, sendo assim, "Bom dia", "Boa tarde", "Boa Noite" ou
//        // "Valor Indálido!".
//        System.out.println("Informe seu turno de estudo, como 'M-Matutino','V-Vespertino' e 'N-Noturno'");
//        String periodoInformado = scan.nextLine();
//        switch (periodoInformado.toUpperCase()) {
//            case "M" -> System.out.println("Matutino");
//            case "V" -> System.out.println("Vespertino");
//            case "N" -> System.out.println("Noturno");
//            default -> System.out.println("Valor Inválido!");
//        }


        //11. Salário Tabajara.
        System.out.println("Informe seu salário");
        double salarioInformado = scan.nextDouble();
        if (salarioInformado <= 280) {
            salarioInformado += (salarioInformado * .2);
            System.out.println("Com a correção seu salário será de: " + "R$"+decimalFormat.format(salarioInformado));
        } else if (salarioInformado > 280 && salarioInformado <= 700) {
            salarioInformado += (salarioInformado * .15);
            System.out.println("Com a correção seu salário será de: " + "R$"+decimalFormat.format(salarioInformado));
        } else if (salarioInformado > 700 && salarioInformado <= 1500) {
            salarioInformado += (salarioInformado * .1);
            System.out.println("Com a correção seu salário será de: " + "R$"+decimalFormat.format(salarioInformado));
        } else {
            salarioInformado += (salarioInformado * .05);
            System.out.println("Com a correção seu salário será de: " + "R$"+decimalFormat.format(salarioInformado));
        }
    }
}
