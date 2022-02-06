package com.vinnivso.cursojava.exerciciosclassesatributos;

public class ExercicioClassesAtributos02 {
    static class Livro {
        String nome;
        String autor;
        int qtdPaginas;
        int anoLancamento;
        String isbn;
    }

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Princípios do Jeet Kune Do";
        livro.autor = "Mestre Vinnivso";
        livro.anoLancamento = 2022;

        System.out.println("Nome do livro = " + livro.nome);
        System.out.println("Autor do livro = " + livro.autor);
    }
}
