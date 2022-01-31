package com.vinnivso.cursojava.aulas;

public class Vetores {
    public static void main(String[] args) {

        //VETORES -> Mais conhecidos como ARRAYS
        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;
        System.out.println("O valor da temperatura no primeiro dia é: " + temperaturas[0] + "ºC");
        System.out.println("O tamanho do array é: " + temperaturas.length); //365

        //Vamos verificar os valores que estão dentro do Array
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i + 1) + " é " + temperaturas[i]);
        }

        //Semelhante ao For Each no JAVASCRIPT, podemos fazer o seguinte no JAVA
        for (double element: temperaturas) {
                System.out.println(element);
        }
    }
}
