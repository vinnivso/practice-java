package com.vinnivso.cursojava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {

        //Variáveis Inteiras
        byte idade01 = 20;
        short idade02 = 21;
        int idade03 = 22;
        long idade04 = 23;

        System.out.println("Valor variável idade = " + idade01);
        System.out.println("Valor variável idade = " + idade02);
        System.out.println("Valor variável idade = " + idade03);
        System.out.println("Valor variável idade = " + idade04);


        //Variáveis Ponto Flutuante
        float valor01 = 1.30f;
        double valor02 = 1.30; //No caso do double, não é necessário colocar o "f", sendo assim, o mesmo é mais utilizado.

        System.out.println("Valor = " + valor01);
        System.out.println("Valor = " + valor02);


        //Variáveis Char
        char o = 'o';
        char i = 'i';
        char interrogracao = '?'; // Ou, podemos usar os valores da ASCII, sendo assim ficaria: char interrogacao = 0x00E1;

        System.out.println("" + o + i + interrogracao); //Necessário colocar o "", para converter os valores como String.


        //Variáveis Boolean
        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println("O valor de verdadeiro é = " + verdadeiro);
        System.out.println("O valor de falso é = " + falso);

        //Curiosidade
        int oct31 = 031;
        int dec25 = 25;

        System.out.println(oct31 == dec25); //Vai retornar como True
    }
}
