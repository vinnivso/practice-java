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

    }
}
