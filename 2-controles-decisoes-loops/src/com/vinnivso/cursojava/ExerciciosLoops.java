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


//        //12. Programa capaz de gerar tabuada de 1 a 10.
//        System.out.println("Entre com o número para gerar a tabuada: Lembrando que a tabuada deve receber valores inteiros");
//        int numeroTabuada = input.nextInt();
//        System.out.println("Tabuada de " + numeroTabuada + ":");
//        for (int i=1; i<=10; i++){
//            System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada*i));
//        }


//        //13. Programa que peça dois números e demonstre base e expoente.
//        System.out.println("Entre com a base:");
//        int base = input.nextInt();
//        System.out.println("Entre com a potência");
//        int expoente = input.nextInt();
//
//        int resultado = base;
//        for (int i=1; i < expoente; i++){
//            resultado *= base;
//        }
//        System.out.println("Resultado: " + resultado);


//        //14. Programa pede dois números inteiros e demonstre os números pares e ímpares entre eles.
//        int numeroDefinidoPeloUsuario;
//        int pares = 0;
//        int impares = 0;
//
//        System.out.println("Entre com 10 números inteiros, separados por SPACE ou ENTER: ");
//        for (int i = 0; i < 10; i++) {
//            numeroDefinidoPeloUsuario = input.nextInt();
//
//            if (numeroDefinidoPeloUsuario % 2 == 0) {
//                pares++;
//            } else {
//                impares++;
//            }
//        }
//        System.out.println("Pares: " + pares);
//        System.out.println("Ímpares: " + impares);


//        //15. Programa capaz de gerar uma sequência de Fibonacci, até o n-ésimo termo.
//        System.out.println("Entre com o n-ésimo termo da série de Fibonacci que deseja gerar");
//        int n = input.nextInt();
//        int primeiroTermo = 1;
//        int segundoTermo = 1;
//        int proximoTermo;
//        System.out.println(primeiroTermo);
//        System.out.println(segundoTermo);
//
//        //1,1,2,3,5
//        //primeiro = 1
//        //segundo = 2
//        //proximo = 3
//
//        for (int i = 3; i <= n; i++) {
//            proximoTermo = primeiroTermo + segundoTermo;
//            primeiroTermo = segundoTermo;
//            segundoTermo = proximoTermo;
//            System.out.println("Número da série: " + proximoTermo + ", presente no termo: " + i);
//        }


//        //16. Programa com nova série de Fibonacci, gerar até que o valor seja <= 500.
//        int primeiroTermoNovaFibonacci = 1;
//        int segundoTermoNovaFibonacci = 1;
//        int proximoTermoNovaFibonacci = 0;
//        System.out.println(primeiroTermoNovaFibonacci);
//        System.out.println(segundoTermoNovaFibonacci);
//
//        do {
//            proximoTermoNovaFibonacci = primeiroTermoNovaFibonacci + segundoTermoNovaFibonacci;
//            primeiroTermoNovaFibonacci = segundoTermoNovaFibonacci;
//            segundoTermoNovaFibonacci = proximoTermoNovaFibonacci;
//            System.out.println(proximoTermoNovaFibonacci);
//        } while (proximoTermoNovaFibonacci <= 500);


//        //17. Programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
//        System.out.println("Informe um número inteiro");
//        int numeroInteiroInformado = input.nextInt();
//        int fatorial = 1;
//
//        if (numeroInteiroInformado == 0) {
//            fatorial = 1;
//        } else {
//            for (int i = numeroInteiroInformado; i > 0; i--) {
//                fatorial *= i;
//                System.out.println(i);
//            }
//        }
//        System.out.println("Resultado de " + numeroInteiroInformado + "!" + " é " + fatorial);


//        //18. Programa que peça número inteiro e determine se ele é ou não um número primo.
//        System.out.println("Entre com um número inteiro");
//        int numeroPrimo = input.nextInt();
//        boolean primo = true;
//
//        for (int i = 2; i < numeroPrimo; i++) {
//            if (numeroPrimo % i == 0) {
//                System.out.println("Não é primo - divisível por " + i);
//                primo = false;
//                break;
//            }
//        }
//        if (primo) {
//            System.out.println("O número informado é um número primo");
//        }


//        //19. Programa que mostre e calcule a média aritmética de N notas.
//        System.out.println("Entre com o número de notas");
//        int notasN = input.nextInt();
//        double somaNotasN = 0;
//        double mediaNotasN;
//        double notaNotasN;
//
//        if (notasN <= 0) {
//            System.out.println("Por favor, insira uma quantidade de notas válidas que possam ser verificadas, no caso, valores inteiros > 0");
//        } else {
//            for (int i = 0; i < notasN; i++) {
//                System.out.println("Entre com a nota " + (i + 1));
//                notaNotasN = input.nextDouble();
//                if (notaNotasN < 0 || notaNotasN > 10) {
//                    System.out.println("Nota inválida, não podem ser inseridas notas menores do que ZERO ou maiores do que DEZ");
//                    break;
//                } else {
//                    somaNotasN += notasN;
//                }
//            }
//            mediaNotasN = somaNotasN / notasN;
//            System.out.println("Soma: " + somaNotasN);
//            System.out.println("Média: " + mediaNotasN);
//        }


        //20. Programa pede idade para n usuários e verifica com base nas idades, se a turma é JOVEM, ADULTA ou IDOSA.
        System.out.println("Entre com a quantidade de idades");
        int idades = input.nextInt();
        int idadeIndividuo;
        int somaIdadeIndividuo = 0;

        for (int i = 0; i < idades; i++){

            System.out.println("Entre com a idade da pessoa " + (i+1));
            idadeIndividuo = input.nextInt();

            somaIdadeIndividuo += idadeIndividuo;
        }
        double mediaIdade = somaIdadeIndividuo / idades;
        System.out.println("Média de idade: " + mediaIdade);

        if (mediaIdade >= 0 && mediaIdade <=25){
            System.out.println("Média da turma é JOVEM");
        } else if (mediaIdade >= 26 && mediaIdade <=60){
            System.out.println("Média da turma é ADULTA");
        } else if (mediaIdade > 60){
            System.out.println("Média da turma é IDOSA");
        }
    }
}
