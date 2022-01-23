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
        System.out.println("Digite o valor do primeiro número");
        int primeiroNumero = scan.nextInt();
        System.out.println("Digite o valor do segundo número");
        int segundoNumero = scan.nextInt();
        System.out.println("O valor da soma é: " + (primeiroNumero + segundoNumero));
    }
}
