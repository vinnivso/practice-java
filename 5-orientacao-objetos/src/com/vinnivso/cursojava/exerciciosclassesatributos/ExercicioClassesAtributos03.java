package com.vinnivso.cursojava.exerciciosclassesatributos;

public class ExercicioClassesAtributos03 {
    static class LivroLivraria {
        String nome;
        String autor;
        int qtdPaginas;
        int anoLancamento;
        String isbn;
        double preco;
    }

    public static void main(String[] args) {
        LivroLivraria livro = new LivroLivraria();
        livro.nome = "Princípios do Jeet Kune Do";
        livro.autor = "Mestre Vinnivso";
        livro.anoLancamento = 2022;
        livro.preco = 666.66;

        System.out.println("Nome do livro = " + livro.nome);
        System.out.println("Autor do livro = " + livro.autor);
        System.out.println("Ano de Lançamento do livro = " + livro.anoLancamento);
        System.out.println("Preço do livro = " + livro.preco);
    }
}
