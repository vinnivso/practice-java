package com.vinnivso.cursojava.exerciciosclassesatributos;

import java.util.Date;

public class ExercicioClassesAtributos04 {
    static class LivroDeBiblioteca {
        String nome;
        String autor;
        int qtdPaginas;
        int anoLancamento;
        String isbn;
        boolean emprestado;
        Date dataEntrega;
        String emprestadoA;
    }

    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        livro.nome = "WW2";
        livro.autor = "Historiador Vinnivso";
        livro.anoLancamento = 2022;
        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "Danielle";

        System.out.println("Nome do livro = " + livro.nome);
        System.out.println("Emprestado para = " + livro.emprestadoA);

        LivroDeBiblioteca livro2 = new LivroDeBiblioteca();
        livro2.nome = "WW2";
        livro2.autor = "Historiador Vinnivso";
        livro2.anoLancamento = 2022;
        livro2.emprestado = false;
        livro2.dataEntrega = new Date();

        System.out.println("Nome do livro = " + livro2.nome);
        System.out.println("Emprestado para = " + livro2.emprestadoA);
    }
}
