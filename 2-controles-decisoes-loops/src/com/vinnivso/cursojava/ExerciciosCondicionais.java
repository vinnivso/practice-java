package com.vinnivso.cursojava;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ExerciciosCondicionais {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

//        //1. Programa que peça dois números e imprima o maior deles.
//        System.out.println("Digite o primeiro valor");
//        double primeiroValor1 = input.nextDouble();
//        System.out.println("Digite o segundo valor");
//        double segundoValor = input.nextDouble();
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
//        double valorInformado = input.nextDouble();
//        if (valorInformado < 0) {
//            System.out.println("O valor informado é negativo: " + valorInformado);
//        } else if (valorInformado == 0) {
//            System.out.println("O valor informado é nulo");
//        } else {
//            System.out.println("O valor informado é positivo: " + valorInformado);
//        }
//
//
//        //3. Programa que verifica "M" ou "F"
//        System.out.println("Informe seu sexo M para Masculino ou F para Feminino");
//        String stringInformada = input.nextLine();
//        switch (stringInformada) {
//            case "M" -> System.out.println(stringInformada + " - Masculino");
//            case "F" -> System.out.println(stringInformada + " - Feminino");
//            default -> System.out.println(stringInformada + " Representa um sexo inválido");
//        }
//
//
//        //4. Programa que verifique vogal ou consoante.
//        System.out.println("Digite qualquer letra para verificar se é vogal ou consoante");
//        String stringVogalConsoante = input.nextLine();
//        switch (stringVogalConsoante.toUpperCase()) {
//            case "A","E","I","O","U" -> System.out.println("Caracter informado corresponde uma " +
//                    "vogal");
//            default -> System.out.println("Caracter informado corresponde uma consoante");
//        }
//
//
//        //5. Programa para ler duas notas parciais de um aluno.
//        System.out.println("Informe a primeira nota");
//        double primeiraNota = input.nextDouble();
//        System.out.println("Informe a segunda nota");
//        double segundaNota = input.nextDouble();
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
//
//
//        //6. Programa para ler três números e mostrar o maior deles.
//        System.out.println("Informe três números, separados por SPACE ou dando ENTER para cada valor inserido");
//        double primeiroNumeroInformado = input.nextDouble();
//        double segundoNumeroInformado = input.nextDouble();
//        double terceiroNumeroInformado = input.nextDouble();
//        double maxPrimeiroSegundo = Math.max(primeiroNumeroInformado, segundoNumeroInformado);
//        if (maxPrimeiroSegundo > terceiroNumeroInformado) {
//            System.out.println("O valor máximo dentre os números informados é: " + maxPrimeiroSegundo);
//        } else if (maxPrimeiroSegundo == terceiroNumeroInformado) {
//            System.out.println("Os valores valores informados são equivalentes dentre si");
//        } else {
//            System.out.println("O valor máximo dentre os números informados é: " + terceiroNumeroInformado);
//        }
//
//
//        //7. Programa para ler três número e mostrar o maior e menor deles.
//        System.out.println("Informe três números, separados por SPACE ou dando ENTER para cada valor inserido");
//        double firstInputNumber = input.nextDouble();
//        double secondInputNumber = input.nextDouble();
//        double thirdInputNumber = input.nextDouble();
//        double minFirstSecond = Math.min(firstInputNumber, secondInputNumber);
//        double maxFirstSecond = Math.max(firstInputNumber, secondInputNumber);
//        if (minFirstSecond < thirdInputNumber && maxFirstSecond < thirdInputNumber) {
//            System.out.println("O mínimo valor é: " + minFirstSecond + " e o máximo valor é: " + thirdInputNumber);
//        } else if (minFirstSecond > thirdInputNumber && maxFirstSecond > thirdInputNumber) {
//            System.out.println("O mínimo valor é: " + thirdInputNumber + " e o máximo valor é: " + maxFirstSecond);
//        } else {
//            System.out.println("O valores são equivalentes entre seus máximos e mínimos");
//        }
//
//
//        //8. Pergunte o preço de três produtos e informe qual deve ser comprado, com base no menor preço.
//        System.out.println("Informe o preço da laranja");
//        double precoLaranja = input.nextDouble();
//        System.out.println("Informe o preço da uva");
//        double precoUva = input.nextDouble();
//        System.out.println("Informe o preço da Maça");
//        double precoMaca = input.nextDouble();
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
//
//
//        //9. Programa que leia três números e mostre em ordem crescente. Resolvi com Array ao invés de IF/ ELSE.
//        System.out.println("Digite três números, separados por SPACE ou por ENTER");
//        double primeiroNumeroDigitado = input.nextDouble();
//        double segundoNumeroDigitado = input.nextDouble();
//        double terceiroNumeroDigitado = input.nextDouble();
//        double[] array = new double[] {primeiroNumeroDigitado, segundoNumeroDigitado, terceiroNumeroDigitado};
//        for (double i : array) {
//            System.out.println(i+"");
//        }
//        Arrays.sort(array);
//        System.out.println("\n Após aplicar a ordem crescente ...");
//        for (double i : array) {
//            System.out.println(i+"");
//        }
//
//
//        //10. Programa M-Matutino, V-Vespertino e N-Noturno, sendo assim, "Bom dia", "Boa tarde", "Boa Noite" ou
//        // "Valor Indálido!".
//        System.out.println("Informe seu turno de estudo, como 'M-Matutino','V-Vespertino' e 'N-Noturno'");
//        String periodoInformado = input.nextLine();
//        switch (periodoInformado.toUpperCase()) {
//            case "M" -> System.out.println("Matutino");
//            case "V" -> System.out.println("Vespertino");
//            case "N" -> System.out.println("Noturno");
//            default -> System.out.println("Valor Inválido!");
//        }
//
//
////        11. Salário Tabajara.
//        System.out.println("Informe seu salário");
//        double salarioInformado = input.nextDouble();
//        double percentual = 0;
//        if (salarioInformado <= 280) {
//            percentual = 20;
//        } else if (salarioInformado > 280 && salarioInformado < 700) {
//            percentual = 15;
//        } else if (salarioInformado >= 700 && salarioInformado < 1500) {
//            percentual = 10;
//        } else if (salarioInformado >= 1500) {
//            percentual = 5;
//        }
//        double aumento = salarioInformado * (percentual / 100);
//        double salarioAjustado = salarioInformado + aumento;
//        System.out.println("Salário: " + salarioInformado);
//        System.out.println("Percentual: " + percentual);
//        System.out.println("Aumento: " + aumento);
//        System.out.println("Salário ajustado: " + salarioAjustado);
//
//
//        //12. Folha de Pagamento.
//        System.out.println("Informe seu valor/hora");
//        double valorHora = input.nextDouble();
//        System.out.println("Informe horas trabalhadas no mês");
//        double horasMes = input.nextDouble();
//
//        double salarioBruto = valorHora * horasMes;
//        double percentualIR = 0;
//        if (salarioBruto <= 900) {
//            percentualIR = 0;
//        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
//            percentualIR = .5;
//        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
//            percentualIR = .1;
//        } else if (salarioBruto > 2500) {
//            percentualIR = .2;
//        }
//        double ir = salarioBruto * percentualIR;
//        double inss = salarioBruto * .1;
//        double fgts = salarioBruto * .11;
//        double totalDescontos = ir + inss;
//        double salarioLiquido = salarioBruto - totalDescontos;
//
//        System.out.println("Salário bruto: (" + valorHora + "*" + horasMes + "): " + decimalFormat.format(salarioBruto));
//        System.out.println("(-) IR (" + percentualIR+"% ):" + decimalFormat.format(ir));
//        System.out.println("(-) INSS ( 10% ): " + decimalFormat.format(inss));
//        System.out.println("(-) FGTS ( 11% ): " + decimalFormat.format(fgts));
//        System.out.println("Total de descontos: " + decimalFormat.format(totalDescontos));
//        System.out.println("Salário Líquido: " + decimalFormat.format(salarioLiquido));
//
//
//        //13. Programa dia da semana.
//        System.out.println("Por favor, insira um valor inteiro para representar um dia da semana");
//        int diaDaSemana = input.nextInt();
//        switch (diaDaSemana) {
//            case 1 -> System.out.println("Domingo");
//            case 2 -> System.out.println("Segunda");
//            case 3 -> System.out.println("Terça");
//            case 4 -> System.out.println("Quarta");
//            case 5 -> System.out.println("Quinta");
//            case 6 -> System.out.println("Sexta");
//            case 7 -> System.out.println("Sábado");
//            default -> System.out.println("Valor inválido");
//        }
//
//
//        //14. Programa para ler notas e dizer APROVADO/REPROVADO
//        System.out.println("Informe a nota da P1");
//        double notaP1 = input.nextDouble();
//        System.out.println("Informe a nota da P2");
//        double notaP2 = input.nextDouble();
//
//        double mediaProvas = (notaP1 + notaP2) / 2;
//        String conceito = null;
//        if (mediaProvas <= 10 && mediaProvas > 9) {
//            conceito = "A";
//        } else if (mediaProvas <= 9 && mediaProvas > 7.5) {
//            conceito = "B";
//        } else if (mediaProvas <= 7.5 && mediaProvas > 6.0) {
//            conceito = "C";
//        } else if (mediaProvas <= 6.0 && mediaProvas > 4.0) {
//            conceito = "D";
//        } else if (mediaProvas <= 4.0 && mediaProvas >= 0) {
//            conceito = "E";
//        } else {
//            conceito = "Inválido";
//        }
//        System.out.println("Nota da P1: " + notaP1);
//        System.out.println("Nota da P2: " + notaP2);
//        System.out.println("Média das Notas: " + decimalFormat.format(mediaProvas));
//        System.out.println("O conceito do aluno é: " + conceito);
//
//        switch (conceito) {
//            case "A", "B", "C" -> System.out.println("APROVADO");
//            case "D", "E" -> System.out.println("REPROVADO");
//            default -> System.out.println("INVÁLIDO");
//        }
//
//
//        //15. Programa verifica se é um triângulo e qual característica do mesmo, escaleno, isósceles ou equilátero.
//        System.out.println("Entre com o valor do primeiro lado");
//        double valorPrimeiroLado = input.nextDouble();
//        System.out.println("Entre com o valor do segundo lado");
//        double valorSegundoLado = input.nextDouble();
//        System.out.println("Entre com o valor do terceiro lado");
//        double valorTerceiroLado = input.nextDouble();
//
//        if (((valorPrimeiroLado + valorSegundoLado) > valorTerceiroLado) || ((valorPrimeiroLado + valorTerceiroLado) > valorSegundoLado) || ((valorSegundoLado + valorTerceiroLado) > valorPrimeiroLado)) {
//            if (valorPrimeiroLado == valorSegundoLado && valorPrimeiroLado == valorTerceiroLado) {
//                System.out.println("Equilátero");
//            } else if (valorPrimeiroLado == valorSegundoLado || valorPrimeiroLado == valorTerceiroLado || valorSegundoLado == valorTerceiroLado) {
//                System.out.println("Isósceles");
//            } else {
//                System.out.println("Escaleno");
//            }
//        } else {
//            System.out.println("Os valores informados não correspondem com um triângulo");
//        }
//
//
//        //16. Faça um programa que calcule as raízes da equação de segundo grau. ax² + bx + c.
//        System.out.println("Informe os valores de a, b e c. Cada valor separado por SPACE ou ENTER");
//        double a = input.nextDouble();
//        double b = input.nextDouble();
//        double c = input.nextDouble();
//        double delta = Math.pow(b, 2) - (4 * a * c);
//        if (a == 0) {
//            double x = -c / b;
//            System.out.println("Os parâmetros inseridos são de uma equação do primeiro grau, logo: x = " + decimalFormat.format(x));
//        } else {
//            if (delta < 0) {
//                System.out.println("O resultado de Delta é < 0, sendo assim a equação não possui raízes reais.");
//            } else {
//                System.out.println("O valor de delta, corresponde: " + decimalFormat.format(delta));
//                double x1 = (-b + Math.sqrt(delta)) / 2 * a;
//                double x2 = (-b - Math.sqrt(delta)) / 2 * a;
//                System.out.println("x1 = " + decimalFormat.format(x1));
//                System.out.println("x2 = " + decimalFormat.format(x2));
//            }
//        }
//
//
//        //17. Ano bissexto ou não?
//        System.out.println("Informe o ano que deseja saber se é bissexto");
//        long anoInformado = input.nextLong();
//        if ((anoInformado % 4 == 0 && anoInformado % 100 != 0) || (anoInformado % 400 == 0)) {
//            System.out.println("O ano inserido é bissexto.");
//        } else {
//            System.out.println("O ano inserido não é bissexto.");
//        }
//
//
//        //18. Par ou ímpar?
//        System.out.println("Informe um número natural");
//        int numeroNatural = input.nextInt();
//        if (numeroNatural == 0) {
//            System.out.println("O número: " + numeroNatural + " não corresponde a classificação ÍMPAR ou PAR");
//        } else if (numeroNatural % 2 == 0) {
//            System.out.println("O número: " + numeroNatural + " é PAR");
//        }
//        else {
//            System.out.println("O número: " + numeroNatural + " é ÍMPAR");
//        }


        //19. Programa pede dois números e solicita operação básica para o usuário.
        System.out.println("Informe o valor do primeiro número natural");
        long primeiroNumeroNatural = input.nextLong();
        System.out.println("Informe o valor do segundo número natural");
        long segundoNumeroNatural = input.nextLong();
        System.out.println("Informe a operação desejada (+ , - , * , / )");
        String operacaoDesejada = input.next();

        switch (operacaoDesejada) {
            case "+" -> System.out.println("Resultado da soma: " + String.valueOf(decimalFormat.format(primeiroNumeroNatural + segundoNumeroNatural)));
            case "-" -> System.out.println("Resultado da subtração: " + String.valueOf(decimalFormat.format(primeiroNumeroNatural - segundoNumeroNatural)));
            case "*" -> System.out.println("Resultado da multiplicação: " + String.valueOf(decimalFormat.format(primeiroNumeroNatural * segundoNumeroNatural)));
            case "/" -> System.out.println("Resultado da divisão: " + String.valueOf(decimalFormat.format(primeiroNumeroNatural / segundoNumeroNatural)));
            default -> System.out.println("Por favor, insira uma operação com base nos modelos apresentados");
        }

        if (primeiroNumeroNatural == 0) {
            System.out.println("O número: " + primeiroNumeroNatural + " não corresponde a classificação ÍMPAR ou PAR");
        } else if (primeiroNumeroNatural % 2 == 0) {
            System.out.println("O número: " + primeiroNumeroNatural + " é PAR");
        } else if (segundoNumeroNatural == 0) {
            System.out.println("O número: " + segundoNumeroNatural + " não corresponde a classificação ÍMPAR ou PAR");
        } else if (segundoNumeroNatural % 2 == 0) {
            System.out.println("O número: " + segundoNumeroNatural + " é PAR");
        }
        else {
            System.out.println("O número: " + primeiroNumeroNatural + " é ÍMPAR");
            System.out.println("O número: " + segundoNumeroNatural + " é ÍMPAR");
        }


    }
}
