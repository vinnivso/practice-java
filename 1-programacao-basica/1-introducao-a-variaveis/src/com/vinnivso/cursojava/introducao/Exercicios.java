package com.vinnivso.cursojava.introducao;

import java.util.Scanner;
import java.lang.Math;

public class Exercicios {
    public static void main(String[] args) {
        /*
        * 1. Faça um programa que mostre "Alô mundo" na tela.
        */
        System.out.println("Alô mundo");


        /*
         * 2. Faça um programa que peça um número e então mostre a mensagem "O número informado foi x".
        */
        System.out.println("Digite um número.");
        Scanner scan = new Scanner(System.in);
        double numeroInformado = scan.nextDouble();
        System.out.println("O número informado foi " + numeroInformado);


        /*
         * 3. Faça um programa que peça dois números e imprima a soma.
        */
        System.out.println("Digite o valor do primeiro número.");
        double primeiroNumero = scan.nextDouble();
        System.out.println("Digite o valor do segundo número.");
        double segundoNumero = scan.nextDouble();
        System.out.println("O valor da soma é: " + (primeiroNumero + segundoNumero));


        /*
         * 4. Faça um programa que peça as 4 notas bimetras e mostre a média.
        */
        System.out.println("Informe a nota da P1.");
        double  notaP1 = scan.nextDouble();
        System.out.println("Informe a nota da P2.");
        double  notaP2 = scan.nextDouble();
        System.out.println("Informe a nota da P3.");
        double  notaP3 = scan.nextDouble();
        System.out.println("Informe a nota da P4.");
        double  notaP4 = scan.nextDouble();
        double media = (notaP1 + notaP2 + notaP3 + notaP4) / 4;
        System.out.println("A média é: " + media);


        /*
         * 5. Faça um programa que converta metros para centímetros.
        */
        System.out.println("Digite o valor em metros para ser convertido em centímetros " +
                "flutuante.");
        double valorInformadoMetros = scan.nextDouble();
        double valorConvertidoCentimetros = valorInformadoMetros * 100;
        System.out.println("A conversão é: " + valorConvertidoCentimetros+"cm");


        /*
         * 6. Faça um programa que peça o raio de um círcule. Calcule e mostra sua área.
        */
        System.out.println("Digite o valor do raio");
        double valorRaio = scan.nextDouble();
        double valorArea = Math.PI * (valorRaio * valorRaio);
        System.out.println("Área é: " + valorArea);


        /*
         * 7. Faça um programa que calcule a área do quadrado e mostre o dobro para o usuário.
        */
        System.out.println("Digite o valor corresponde ao vértice do quadrado.");
        double valorVertice = scan.nextDouble();
        double valorAreaQuadrado = Math.pow(valorVertice, 2);
        double dobroValorAreaQuadrado = 2 * valorAreaQuadrado;
        System.out.println("O dobro da área é: " + dobroValorAreaQuadrado);
    }
}
