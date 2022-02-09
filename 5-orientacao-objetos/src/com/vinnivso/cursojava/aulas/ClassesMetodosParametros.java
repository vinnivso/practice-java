package com.vinnivso.cursojava.aulas;

import java.util.Scanner;

public class ClassesMetodosParametros {
    static Scanner input = new Scanner(System.in);
    static class Carro4 {
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
        double calcularCombustivel(double km) {
            return km / consumoCombustivel;
        }
    }

    public static void main(String[] args) {
        Carro4 van = new Carro4();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = .2;
        System.out.println(van.marca);
        System.out.println(van.modelo);
        van.exibirAutonomia();
        System.out.println("A autonomia do carro é: " + van.obterAutonomia() + " km");
        System.out.println("Por favor, insira a quilometragem: ");
        double km = input.nextDouble();
        System.out.println("O combustível necessário para percorrer " + km + "km" + " é " + van.calcularCombustivel(km) + "l");
    }
}
