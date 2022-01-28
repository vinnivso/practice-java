package com.vinnivso.cursojava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerciciosLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

//        //1. Valide número inserido por usuário.
//        System.out.println("insira a nota");
//        boolean notaValida = false;
//        double nota; // -> Por uma questão de performance, será declarado as variáveis que serão utilizadas
//        // no loop, fora do escopo do loop.
//
//        do {
//            System.out.println("Entre com uma nota");
//            nota = input.nextDouble();
//            if (nota >= 0 && nota <= 10) {
//                notaValida = true;
//                System.out.println("Você digitou: " + nota);
//            } else {
//                //notaValida = true; -> Sem necessidade uma vez que a outra condição já está como true.
//                System.out.println("Nota inválida, digite novamente");
//            }
//        } while (!notaValida);
//
//
//        //2. Programa que leia nome de usuário e senha, não aceita senha igual ao nome de usuário, mostrando erro e
//        // pedindo para inserir novamente.
//        boolean userNameValido = false;
//        String userNameInput;
//        String passwordInput;
//
//        do {
//            System.out.println("Entre com o nome de usuário: ");
//            userNameInput = input.next();
//            System.out.println("Entre com a senha: ");
//            passwordInput = input.next();
//            if (userNameInput.equalsIgnoreCase(passwordInput)) {
//                //userNameValido = false; -> Sem necessidade uma vez que a outra condição já está como true.
//                System.out.println("Senha igual a usuário, digite novamente");
//            } else {
//                userNameValido = true;
//                System.out.println("Senha e usuário informado estão válidos.");
//            }
//        } while (!userNameValido);
//
//
//        //3. Programa que leia e valide as seguintes informações:
//        //a. Nome: maior que 3 chars;
//        //b. Idade: entre 0 e 150;
//        //c. Salário: Maior que zero;
//        //d. Sexo: 'f' ou 'm';
//        //e. Estado Civil: 's', 'c', 'v', 'd';
//        boolean infoValida = false;
//        String nome;
//        int idade;
//        double salario;
//        String sexo;
//        String estadoCivil;
//
//        do {
//            System.out.println("Entre com o nome: ");
//            nome = input.next();
//            if (!(nome.length() > 3)) {
//                System.out.println("O nome deve possuir mais de três caracteres");
//            } else {
//                infoValida = true;
//                System.out.println("Nome válido");
//            }
//        } while (!infoValida);
//
//        infoValida = false;
//        do {
//            System.out.println("Entre com a idade: ");
//            idade = input.nextInt();
//            if (!(idade >= 0 && idade <= 150)) {
//                System.out.println("A idade deve ser um valor entre 0 e 150");
//            } else {
//                infoValida = true;
//                System.out.println("Idade válida");
//            }
//        } while (!infoValida);
//
//        infoValida = false;
//        do {
//            System.out.println("Entre com o salário: ");
//            salario = input.nextDouble();
//            if (!(salario > 0)) {
//                System.out.println("O salário deve ser maior que ZERO");
//            } else {
//                infoValida = true;
//                System.out.println("Salário válido");
//            }
//        } while (!infoValida);
//
//        infoValida = false;
//        do {
//            System.out.println("Entre com o sexo: ");
//            sexo = input.next();
//            if (!(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m"))) {
//                System.out.println("O sexo deve seguir o formato: 'f - feminino' e 'm - masculino' ");
//            } else {
//                infoValida = true;
//                System.out.println("Sexo válido");
//            }
//        } while (!infoValida);
//
//        infoValida = false;
//        do {
//            System.out.println("Entre com o estado civil: ");
//            estadoCivil = input.next();
//            if (!(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d"))) {
//                System.out.println("O estado civil deve seguir o formato: 's - solteiro', 'c - casado', 'v - viúvo' e 'd - divorciado' ");
//            } else {
//                infoValida = true;
//                System.out.println("Estado Civil válido");
//            }
//        } while (!infoValida);
//        System.out.println("Nome: " + nome);
//        System.out.println("Idade: " + idade);
//        System.out.println("Salário: " + decimalFormat.format(salario));
//        System.out.println("Sexo: " + sexo);
//        System.out.println("Estado civil: " + estadoCivil);


//        //4. Programa que calcule e escreve quantos anos a população de um país A vai ultrapassar país B.
//        int popA = 80000;
//        int popB = 200000;
//        int i = 0;
//        while (popA <= popB) {
//            popA += popA * .03;
//            popB += popB * .015;
//            i++;
//        }
//        System.out.println("População do País A: " + popA);
//        System.out.println("População do País B: " + popB);
//        System.out.println("Para o país A ultrapassar ou igualar com a população do país B, vão demorar " + i + " anos");


//        //5. Programa que refatore o EX.4, usuário passando os parâmetros dos países.
//        boolean validaInputDoUsuario = false;
//        int popAUser;
//        int popBUser;
//        double crescimentoA;
//        double crescimentoB;
//        int i = 0;
//
//        do {
//            System.out.println("Informe a população do país A");
//            popAUser = input.nextInt();
//            if (!(popAUser >= 0)) {
//                System.out.println("O valor da população deve ser maior que ZERO");
//            } else {
//                validaInputDoUsuario = true;
//                System.out.println("Informação da população A: " + popAUser);
//            }
//        } while (!validaInputDoUsuario);
//
//        validaInputDoUsuario = false;
//        do {
//            System.out.println("Informe a população do país B");
//            popBUser = input.nextInt();
//            if (!(popBUser >= 0)) {
//                System.out.println("O valor da população deve ser maior que ZERO");
//            } else {
//                validaInputDoUsuario = true;
//                System.out.println("Informação da população B: " + popBUser);
//            }
//        } while (!validaInputDoUsuario);
//
//        validaInputDoUsuario = false;
//        do {
//            System.out.println("Informe a taxa de crescimento do país A");
//            crescimentoA = input.nextInt();
//            if (!(crescimentoA >= 0)) {
//                System.out.println("O valor da taxa de crescimento deve ser maior que ZERO");
//            } else {
//                validaInputDoUsuario = true;
//                System.out.println("Taxa de crescimento da população A: " + crescimentoA + "%");
//            }
//        } while (!validaInputDoUsuario);
//
//        validaInputDoUsuario = false;
//        do {
//            System.out.println("Informe a taxa de crescimento do país B");
//            crescimentoB = input.nextInt();
//            if (!(crescimentoB >= 0)) {
//                System.out.println("O valor da taxa de crescimento deve ser maior que ZERO");
//            } else {
//                validaInputDoUsuario = true;
//                System.out.println("Taxa de crescimento da população B: " + crescimentoB + "%");
//            }
//        } while (!validaInputDoUsuario);
//
//        while (popAUser <= popBUser) {
//            popAUser += popAUser * (crescimentoA / 100);
//            popBUser += popBUser * (crescimentoB / 100);
//            i++;
//        }
//        System.out.println("População do País A: " + popAUser);
//        System.out.println("População do País B: " + popBUser);
//        System.out.println("Para o país A ultrapassar ou igualar com a população do país B, vão demorar " + i + " anos");


//        //6. Programa que imprime na tela os números de 1 a 20.
//        for (int i = 0; i <= 20; i++) {
//            System.out.println(i);
//            System.out.println("i tem valor: " + i );
//        }


//        //7. Programa que leia 5 números e informe o maior número.
//        double num;
//        double maior = Double.MIN_VALUE;
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Entre com um número");
//            num = input.nextDouble();
//
//            if (num > maior) {
//                maior = num;
//                System.out.println("O número maior mudou: " + maior);
//            }
//        }
//        System.out.println("O maior número digitado foi: " + maior);


//        //8. Programa que leia 5 números e informe a soma e a média dos números.
//        double numeroInform;
//        double mediaInform;
//        double somaInform = 0;
//
//        for (int i = 0; i< 5; i++) {
//            System.out.println("Digite um número");
//            numeroInform = input.nextDouble();
//            somaInform += numeroInform;
//        }
//        mediaInform = somaInform / 5;
//        System.out.println("Soma: " + decimalFormat.format(somaInform));
//        System.out.println("Média: " + decimalFormat.format(mediaInform));


//        //9. Programa que imprima na tela apenas os números primos entre 1 e 50.
//        for (int i = 1; i < 50; i++) {
//            if ( i % 2 != 0) {
//                System.out.println(i);
//            }
//        }


//        //10. Programa recebe dois números inteiros e gere os números inteiros que estão no intervalo entre eles.
//        System.out.println("Entre com o primeiro número inteiro");
//        int primeiroNumeroInteiro = input.nextInt();
//        System.out.println("Entre com o segundo número inteiro");
//        int segundoNumeroInteiro = input.nextInt();
//
//        for (int i = primeiroNumeroInteiro; i < segundoNumeroInteiro; i++) {
//            System.out.println(i);
//        }


//        //11. Altera o programa 10 para mostrar no final a soma dos números.
//        System.out.println("Entre com o primeiro número inteiro");
//        int primeiroNumeroParaSomar = input.nextInt();
//        System.out.println("Entre com o segundo número inteiro");
//        int segundoNumeroParaSomar = input.nextInt();
//        int soma = 0;
//        for (int i = primeiroNumeroParaSomar; i < segundoNumeroParaSomar; soma += i++) {
//            System.out.println("Soma atual: " + soma);
//        }
//        System.out.println("Soma total: " + soma);


        //12. Programa capaz de gerar tabuada de 1 a 10.
        System.out.println("Entre com o número para gerar a tabuada: Lembrando que a tabuada deve receber valores inteiros");
        int numeroTabuada = input.nextInt();
        System.out.println("Tabuada de " + numeroTabuada + ":");
        for (int i=1; i<=10; i++){
            System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada*i));
        }
    }
}
