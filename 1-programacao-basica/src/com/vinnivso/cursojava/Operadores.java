package com.vinnivso.cursojava;

public class Operadores {
    public static void main(String[] args) {
        /* OPERADORES ARITMÉTICOS
        *  + -----> adição (mais unário)
        *  - -----> subtração (menos unário)
        *  * -----> multiplicação
        *  / -----> divisão
        *  % -----> módulo
        *  ++ ----> incremento (pos ou pré fix)
        *  -- ----> decremento (pos ou pré fix)
        * */

        //Operadores Artiméticos
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado -= 1; //Assim como no Javascript, podemos escrever como: resultado = resultado - 1;
        System.out.println(resultado);

        resultado *= 2;
        System.out.println(resultado);//Assim como no Javascript, podemos escrever como: resultado = resultado * 2;

        resultado /= 2;
        System.out.println(resultado);//Assim como no Javascript, podemos escrever como: resultado = resultado / 2;

        resultado += 8;
        System.out.println(resultado);//Assim como no Javascript, podemos escrever como: resultado = resultado + 8;

        resultado %= 7;
        System.out.println(resultado);//Assim como no Javascript, podemos escrever como: resultado = resultado % 7;

        String primeiroNome = "Esta é ";
        String segundoNome = "uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        resultado++;
        System.out.println(resultado); //4 -> Assim como no Javascript, estou realizando um incremento da variável.

        resultado--;
        System.out.println(resultado); //3 -> Assim como no Javascript, estou realizando um decremento da variável.

        ++resultado;
        System.out.println(resultado); //4 -> Nesse caso, estou realizando o fator de incremento antes da variável.

        --resultado;
        System.out.println(resultado); //3 -> Nesse caso, estou realizando o fator de decremento antes da variável.



        /* OPERADORES RELACIONAIS
         *  == -----> igual a
         *  != -----> diferente de
         *  > ------> maior que
         *  < ------> menor que
         *  >= -----> maior ou igual que
         *  <= -----> menor ou igual que
         * */

        long valor1 = 1;
        long valor2 = 2;

        System.out.println("valor1 == valor2: " + (valor1 == valor2));
        System.out.println("valor1 != valor2: " + (valor1 != valor2));
        System.out.println("valor1 > valor2: " + (valor1 > valor2));
        System.out.println("valor1 >= valor2: " + (valor1 >= valor2));
        System.out.println("valor1 < valor2: " + (valor1 < valor2));
        System.out.println("valor1 <= valor2: " + (valor1 <= valor2));



        /* OPERADORES LÓGICOS
         *  & -----> AND
         *  | -----> OR
         *  ^ -----> XOR, só dá false se for TRUE && TRUE ou FALSE && FALSE
         *  || ----> OR curto circuito
         *  && ----> AND curto circuito
         *  ! -----> NOT
         * */

        long valueOne = 1;
        long valueTwo = 2;

        boolean resultOne = (valueOne == 1) && (valueTwo == 2);
        System.out.println("valueOne é 1 AND Short Circuit valueTwo é 2, resultado: " + resultOne); //True

        boolean resultTwo = (valueOne == 1) || (valueTwo == 2);
        System.out.println("valueOne é 1 OR Short Circuit valueTwo é 2, resultado: " + resultTwo); //True

        boolean verdadeiro = true;
        boolean verdadeiroTwo = true;
        boolean falso = false;
        boolean falsoTwo = false;
        System.out.println(verdadeiro && falso); //false
        System.out.println(verdadeiro || falso); //true
        System.out.println(verdadeiro ^ falso); //true
        System.out.println(verdadeiro ^ verdadeiroTwo); //false
        System.out.println(falso ^falsoTwo); //false
        System.out.println(!verdadeiro && falso); //false
    }
}
