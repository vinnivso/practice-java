package com.vinnivso.cursojava.aulas;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = .2;
        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numPassageiros);
        System.out.println(van.capCombustivel);
        System.out.println(van.consumoCombustivel);
        System.out.println();

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = .15;
        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        System.out.println(fusca.numPassageiros);
        System.out.println(fusca.capCombustivel);
        System.out.println(fusca.consumoCombustivel);
        System.out.println();

    }
}
