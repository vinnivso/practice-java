package com.vinnivso.cursojava.exerciciosclassesparametros;

public class ExercicioClassesParametros02 {
    public static class ContaCorrente {
        String numero;
        String agencia;
        boolean especial;
        double limiteEspecial;
        double saldo;

        boolean realizarSaque(double quantiaASacar) {

            //tem saldo na conta
            if (saldo >= quantiaASacar) {
                saldo -= quantiaASacar;
                return true;
            } else { //não tem saldo na conta
                if (especial) {
                    //verificar se o limite especial tem saldo
                    double limite = limiteEspecial + saldo;
                    if (limite >= quantiaASacar) {
                        saldo -= quantiaASacar;
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return false; //não é especial e não tem saldo suficiente
                }
            }
        }

        void depositar(double valorDepositado) {

            saldo += valorDepositado;
        }

        void consultarSaldo() {
            System.out.println("Saldo atual da conta = " + saldo);
        }

        boolean verificarUsoChequeEspecial() {
            return saldo < 0;
        }
    }

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;

        System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);

        boolean saqueEfetuado = conta.realizarSaque(10);

        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente");
        }

        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de 500 reais");
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso");
            conta.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar saque. Saldo insuficiente");
        }

        System.out.println("Depósito de 500 reais");
        conta.depositar(500);
        conta.consultarSaldo();

        if (conta.verificarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }

        conta.realizarSaque(600);
        conta.consultarSaldo();
        if (conta.verificarUsoChequeEspecial()) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }
    }
}
