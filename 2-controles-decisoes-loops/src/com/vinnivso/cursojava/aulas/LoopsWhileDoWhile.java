package com.vinnivso.cursojava.aulas;

public class LoopsWhileDoWhile {
    public static void main (String[] args) {

        //WHILE
        int i = 0;
        int max = 10;
        System.out.println("Contando até " + max);
        while (i < max) {
            System.out.println("Valor de i: " + i);
            i++;
        }
        System.out.println(i); //Somente para verificar o valor de i, após a execução do Loop.


        //DO WHILE
        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 11);
        System.out.println(i);


        /* CONCLUSÃO:
        * A diferença principal entre WHILE e DO WHILE é que, como o próprio nome já diz, no WHILE ele verifica a
        * condição primeiramente e depois disso executa os parâmetros passados, no caso do DO WHILE, ele executa
        * primeiramente os parâmetros e depois verifica a condição.
        */
    }
}
