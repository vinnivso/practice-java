package com.vinnivso.cursojava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerciciosLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //1. Valide número inserido por usuário.
        System.out.println("insira a nota");
        boolean notaValida = false;
        double nota; // -> Por uma questão de performance, será declarado as variáveis que serão utilizadas
        // no loop, fora do escopo do loop.

        do {
            System.out.println("Entre com uma nota");
            nota = input.nextDouble();
            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            } else {
                //notaValida = true; -> Sem necessidade uma vez que a outra condição já está como true.
                System.out.println("Nota inválida, digite novamente");
            }
        } while (!notaValida);


        //2. Programa que leia nome de usuário e senha, não aceita senha igual ao nome de usuário, mostrando erro e
        // pedindo para inserir novamente.
        boolean userNameValido = false;
        String userNameInput;
        String passwordInput;

        do {
            System.out.println("Entre com o nome de usuário: ");
            userNameInput = input.next();
            System.out.println("Entre com a senha: ");
            passwordInput = input.next();
            if (userNameInput.equalsIgnoreCase(passwordInput)) {
                //userNameValido = false; -> Sem necessidade uma vez que a outra condição já está como true.
                System.out.println("Senha igual a usuário, digite novamente");
            } else {
                userNameValido = true;
                System.out.println("Senha e usuário informado estão válidos.");
            }
        } while (!userNameValido);


        //3. Programa que leia e valide as seguintes informações:
        //a. Nome: maior que 3 chars;
        //b. Idade: entre 0 e 150;
        //c. Salário: Maior que zero;
        //d. Sexo: 'f' ou 'm';
        //e. Estado Civil: 's', 'c', 'v', 'd';
        boolean infoValida = false;
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do {
            System.out.println("Entre com o nome: ");
            nome = input.next();
            if (!(nome.length() > 3)) {
                System.out.println("O nome deve possuir mais de três caracteres");
            } else {
                infoValida = true;
                System.out.println("Nome válido");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Entre com a idade: ");
            idade = input.nextInt();
            if (!(idade >= 0 && idade <= 150)) {
                System.out.println("A idade deve ser um valor entre 0 e 150");
            } else {
                infoValida = true;
                System.out.println("Idade válida");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Entre com o salário: ");
            salario = input.nextDouble();
            if (!(salario > 0)) {
                System.out.println("O salário deve ser maior que ZERO");
            } else {
                infoValida = true;
                System.out.println("Salário válido");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Entre com o sexo: ");
            sexo = input.next();
            if (!(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m"))) {
                System.out.println("O sexo deve seguir o formato: 'f - feminino' e 'm - masculino' ");
            } else {
                infoValida = true;
                System.out.println("Sexo válido");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Entre com o estado civil: ");
            estadoCivil = input.next();
            if (!(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d"))) {
                System.out.println("O estado civil deve seguir o formato: 's - solteiro', 'c - casado', 'v - viúvo' e 'd - divorciado' ");
            } else {
                infoValida = true;
                System.out.println("Estado Civil válido");
            }
        } while (!infoValida);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + decimalFormat.format(salario));
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
    }
}
