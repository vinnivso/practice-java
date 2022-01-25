package com.vinnivso.cursojava;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        /*
        * 1. Faça um programa que mostre "Alô mundo" na tela.
        */
        System.out.println("Alô mundo");


        /*
         * 2. Faça um programa que peça um número e então mostre a mensagem "O número informado foi x".
        */
        System.out.println("Digite um número.");
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


        /*
         * 8. Faça um programa que pergunta sua remuneração horária, horas trabalhadas no mês e retorne seu salário.
        */
        System.out.println("Quanto recebe por hora?");
        double valorHora = scan.nextDouble();
        System.out.println("Quantas horas trabalha por mês?");
        double valorHoraMes = scan.nextDouble();
        double salarioHoraMes = valorHora * valorHoraMes;
        System.out.println("Seu salário será de: " + "R$"+ decimalFormat.format(salarioHoraMes));


        /*
         * 9. Faça um programa que peça Fahrenheit e mostre a temperatura em Celsius.
        */
        System.out.println("Digite o valor de ºF para serem convertidos para ºC.");
        double grausFahrenheit = scan.nextDouble();
        double grausCelsius = (5 * (grausFahrenheit - 32) / 9);
        System.out.println("Temperatura em Celsius é: " + decimalFormat.format(grausCelsius)+"ºC");


        /*
         * 10. Faça um programa que peça Celsius e mostre a temperatura em Fahrenheit.
        */
        System.out.println("Digite o valor de ºC para serem convertidos para ºF.");
        double grausCelsiusConverter = scan.nextDouble();
        double grausFahrenheitConverter = (grausCelsiusConverter * 5 / 9) + 32;
        System.out.println("Temperatura em Celsius é: " + decimalFormat.format(grausFahrenheitConverter)+"ºC");


        /*
         * 11. Peça 2 números inteiros e 1 real. Realize operações:
         * A. O produto do dobro do primeiro com metade do segundo.
         * B. A soma do triplo do primeiro com o terceiro.
         * C. O terceiro elevado ao cubo.
        */
        System.out.println("Entre com um número inteiro.");
        long numero1 = scan.nextInt();
        System.out.println("Entre com um segundo número inteiro.");
        long numero2 = scan.nextInt();
        System.out.println("Entre com um número real.");
        double numero3 = scan.nextDouble();

        double resultA = (2 * numero1) * (numero2 / 2);
        System.out.println("Resultado A: " + decimalFormat.format(resultA));
        double resultB = (3 * numero1) + numero3;
        System.out.println("Resultado B: " + decimalFormat.format(resultB));
        double resultC = Math.pow(numero3, 3);
        System.out.println("Resultado C: " + decimalFormat.format(resultC));


        /*
         * 12. Altura em metros como parâmetro, calcule o peso ideal.
        */
        System.out.println("Digite o valor de sua altura em metros.");
        double altura = scan.nextDouble();
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal em é de: " + decimalFormat.format(pesoIdeal)+"kg.");


        /*
         * 13. Calcule seu salário Líquido.
        */
        System.out.println("Entre com seu valor/hora.");
        double valorHoraLiquido = scan.nextDouble();
        System.out.println("Entre com horas trabalhadas no mês.");
        double horasMesLiquido = scan.nextDouble();
        double salarioSample = valorHoraLiquido * horasMesLiquido;
        double ir = salarioSample * 11 / 100;
        double inss = salarioSample * 8 / 100;
        double sindicato = salarioSample * 5 / 100;
        double salarioLiquido = salarioSample - (ir + inss + sindicato);
        System.out.println("Seu salário nesse mês, será de: R$"+decimalFormat.format(salarioLiquido));


        /*
         * 14. Parâmetro arquivo para download em MB e velocidade de um link na Internet em Mbps. t em minutos.
        */
        System.out.println("Tamanho do arquivo em MB.");
        double arquivo = scan.nextDouble();
        System.out.println("Velocidade de conexão da internet");
        double velocidade = scan.nextDouble();
        double tempo = arquivo / velocidade;

        System.out.println("Tempo de download é "+decimalFormat.format(tempo));
    }
}
