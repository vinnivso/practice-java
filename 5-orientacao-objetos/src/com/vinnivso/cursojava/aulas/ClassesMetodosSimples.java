package com.vinnivso.cursojava.aulas;

public class ClassesMetodosSimples {
    static class Carros {
        String marca;
        String modelo;
        int numPassageiros;
        double capCombustivel;
        double consumoCombustivel;

        void exibirAutonomia() {
            System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
        }
    }

    public static void main(String[] args) {
        Carros van = new Carros();
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
        van.exibirAutonomia();
        System.out.println();
    }
}
