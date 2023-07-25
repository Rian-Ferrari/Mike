package com.algaworks.banco.modelo;

import java.util.Objects;

public class Conta {
    private Pessoa titular;
    private int agencia;
    private int numeroConta;
    private double saldo;

    Conta() {

    }
    public Conta(Pessoa titular, int agencia, int numeroConta) {
        Objects.requireNonNull(titular);
        this.titular = titular;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que 0!");
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que 0!");
        }

        if (saldo - valor < 0) {
            throw new IllegalStateException("Saldo insuficiente!");
        }
        saldo -= valor;
    }

    public void sacar(double valor, double taxaSaque) {
        sacar(valor + taxaSaque);
    }

    public Pessoa getTitular() {
        return titular;
    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
}
