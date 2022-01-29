package com.vinnivso.cursojava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

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
