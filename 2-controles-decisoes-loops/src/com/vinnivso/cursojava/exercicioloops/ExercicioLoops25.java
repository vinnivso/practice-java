package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        boolean sair = false;
        String continuarCompra;
        int qtdProdutos;
        double preco;
        double total;
        String output;
        double valorPago, troco;

        do {
            System.out.println("Deseja informar uma nova compra? S/N");
            continuarCompra = input.next();
            if (continuarCompra.equalsIgnoreCase("s")) {
                output = "Lojas Tabajara\n";
                System.out.println("Digite a quantidade de produtos da compra:");
                qtdProdutos = input.nextInt();
                total = 0;
                for (int i = 1; i <= qtdProdutos; i++) {
                    System.out.println("Informe preço do produto " + i);
                    preco = input.nextDouble();
                    total += preco;
                    output += "Produto " + i + ": R$ " + preco + "\n";
                }
                output += "Total: R$ " + total;
                System.out.println("Total: R$ " + decimalFormat.format(total));
                System.out.println("Entre com o valor pago:");
                valorPago = input.nextDouble();
                output += "Dinheiro: R$ " + decimalFormat.format(valorPago) + "\n";
                troco = total - valorPago;
                output += "Troco: R$ " + decimalFormat.format(troco);
                System.out.println(output);
            } else {
                sair = true;
            }
        } while (!sair);
    }
}
