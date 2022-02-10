package com.vinnivso.cursojava.exerciciosclassesparametros;

public class ExercicioClassesParametros01 {
    public static class Lampada {
        String modelo;
        String tensao;
        int potencia;
        String cor;
        String tipoLuz;
        int garantiaMeses;
        String[] tipos;
        boolean tipoAbajur;
        boolean ligada;

        void ligar() {
            ligada = true;
        }

        void desligar() {
            ligada = false;
        }

        void mostrarEstado() {
            if (ligada) System.out.println("Lâmpada está ligada");
            else System.out.println("Lâmpada está desligada");
        }

        void mudarEstado() {
            if (ligada) desligar();
            else ligar();
        }
    }

    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.ligar();
        lampada.mostrarEstado();
        lampada.desligar();
        lampada.mostrarEstado();
        lampada.mudarEstado();
        lampada.mostrarEstado();
    }
}
