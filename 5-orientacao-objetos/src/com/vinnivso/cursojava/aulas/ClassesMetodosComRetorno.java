package com.vinnivso.cursojava.aulas;

public class ClassesMetodosComRetorno {
    static class Carro3 {
        String marca;
        String modelo;
        int numPassageiros;
        double capCombustivel;
        double consumoCombustivel;

        void exibirAutonomia() {
            System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
        }
        double obterAutonomia() {
            System.out.println("Método obter Autonomia foi chamado");
            return capCombustivel * consumoCombustivel;
        }
    }

    public static void main(String[] args) {
        Carro3 van = new Carro3();
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
        System.out.println("A autonomia do carro é: " + van.obterAutonomia() + " km");
        System.out.println();
    }
}
