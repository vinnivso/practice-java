package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

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
