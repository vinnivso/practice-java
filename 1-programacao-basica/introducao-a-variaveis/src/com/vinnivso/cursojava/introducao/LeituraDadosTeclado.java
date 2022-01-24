package com.vinnivso.cursojava.introducao;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scan.nextLine(); //Com esse método nextLine(), ele vai ler tudo que for digitado na
        // linha seguinte.
        System.out.println("Seu nome completo é: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome");
        String primeiroNome = scan.next(); //Com esse método next(), será lido somente o que vier primeiro.
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.println("Digite sua idade");
        int idade = scan.nextInt();//Com esse método nextInt(), será lido o valor inteiro.
        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite sua altura em metros");
        double altura = scan.nextDouble();//Com esse método nextDouble(), será lido o valor em ponto flutuante.
        System.out.println("Sua altura em metros é: " + altura);


        System.out.println("Digite seu primeiro nome, idade, número de dependentes, altura e se possui pet como true/false");
        String primeiroNomeGeneral = scan.next();
        long idadeGeneral = scan.nextInt();
        byte qtdDependentes = scan.nextByte();
        double alturaGeneral = scan.nextDouble();
        boolean temPet = scan.nextBoolean();
        System.out.println("Você digitou os seguintes valores:");
        System.out.println("Primeiro nome: " + primeiroNomeGeneral);
        System.out.println("Idade: " + idadeGeneral + "anos");
        System.out.println("Quantidade de Dependentes: " + qtdDependentes);
        System.out.print("Altura: " + alturaGeneral+"m");
        System.out.println("Possui pet: " + temPet);

    }
}
