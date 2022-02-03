package com.vinnivso.cursojava.aulas;

import java.util.Random;
import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();

        //EXEMPLO 01
        int[] notas = new int[10];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = randomNumber.nextInt(10);
        }

        for (int i = 0; i < notas.length; i++) {
            int nota = notas[i];
            System.out.println(nota);
        }

        System.out.println("Usando o for each");
        for (int nota : notas) {
            System.out.println(nota);
        }
    }
}
