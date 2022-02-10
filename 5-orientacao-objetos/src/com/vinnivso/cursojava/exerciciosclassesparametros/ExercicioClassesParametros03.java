package com.vinnivso.cursojava.exerciciosclassesparametros;

import java.util.Scanner;

public class ExercicioClassesParametros03 {
    static Scanner input = new Scanner(System.in);

    public static class Aluno {
        String nome;
        String matricula;
        String nomeCurso;
        String[] nomeDisciplinas = new String[3];
        double[][] notasDisciplinas = new double[3][4];

        void mostrarInfo() {
            System.out.println("Nome: " + nome);
            System.out.println("Matrícula: " + matricula);
            System.out.println("Nome do curso: " + nomeCurso);

            for (int i = 0; i < notasDisciplinas.length; i++) {
                System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
                for (int j = 0; j < notasDisciplinas[i].length; j++) {
                    System.out.print(notasDisciplinas[i][j] + " ");
                }
                System.out.println();
            }
        }

        boolean verificarAprovado(int indice) {
            if (obterMedia(indice) >= 7) {
                return true;
            }
            return false;
        }

        double obterMedia(int indice) {
            double soma = 0;
            for (int i = 0; i < notasDisciplinas[indice].length; i++) {
                soma += notasDisciplinas[indice][i];
            }
            double media = soma / 4;
            return media;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno");
        aluno.nome = input.next();

        System.out.println("Entre com o nome do curso");
        aluno.nomeCurso = input.next();

        System.out.println("Entre com a matricula");
        aluno.matricula = input.next();

        //aluno.nomeDisciplinas = new String[3];
        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.nomeDisciplinas[i] = input.next();
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.nomeDisciplinas[i]);
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                System.out.println("Entre com a nota " + (j + 1));
                aluno.notasDisciplinas[i][j] = input.nextDouble();
            }
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - reprovado");
            }
        }
    }
}
