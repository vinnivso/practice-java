package com.vinnivso.cursojava.introducao;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        /*
        * 1. Faça um programa que mostre "Alô mundo" na tela.
        */
        System.out.println("Alô mundo");


        /*
         * 2. Faça um programa que peça um número e então mostre a mensagem "O número informado foi x".
        */
        System.out.println("Digite um número inteiro");
        Scanner scan = new Scanner(System.in);
        int numeroInformado = scan.nextInt();
        System.out.println("O número informado foi " + numeroInformado);


        /*
         * 3. Faça um programa que peça dois números e imprima a soma.
        */
        System.out.println("Digite o valor do primeiro número inteiro");
        int primeiroNumero = scan.nextInt();
        System.out.println("Digite o valor do segundo número inteiro");
        int segundoNumero = scan.nextInt();
        System.out.println("O valor da soma é: " + (primeiroNumero + segundoNumero));


        /*
         * 4. Faça um programa que peça as 4 notas bimetras e mostre a média.
        */
        System.out.println("Informe a nota da P1, seguindo a notação de ponto flutuante");
        double  notaP1 = scan.nextDouble();
        System.out.println("Informe a nota da P2, seguindo a notação de ponto flutuante");
        double  notaP2 = scan.nextDouble();
        System.out.println("Informe a nota da P3, seguindo a notação de ponto flutuante");
        double  notaP3 = scan.nextDouble();
        System.out.println("Informe a nota da P4, seguindo a notação de ponto flutuante");
        double  notaP4 = scan.nextDouble();
        double media = (notaP1 + notaP2 + notaP3 + notaP4) / 4;
        System.out.println("A média é: " + media);
    }
}
