package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Conta;
import com.algaworks.banco.modelo.Pessoa;

public class Principal {

    public static void main(String[] args) {
        Pessoa cliente = new Pessoa();
        cliente.setNome("Rian Ferrari");
        cliente.setDocumento(381145074);

        Pessoa cliente2 = new Pessoa();
        cliente2.setNome("Lukas Ferrari");
        cliente2.setDocumento(382993109);

        Conta minhaConta = new Conta(cliente, 987, 123);
//        minhaConta.titular = cliente;
//        minhaConta.numeroConta = 123;
//        minhaConta.agencia = 987;
//        minhaConta.saldo = 18_000;
        minhaConta.depositar(18_000);

        Conta contaBb = new Conta(cliente2, 321, 287);
//        contaBb.titular = cliente2;
//        contaBb.numeroConta = 321;
//        contaBb.agencia = 287;
//        contaBb.saldo = 20_000;
        contaBb.depositar(20_000);

        minhaConta.sacar(1_000, 10);

        System.out.println("Titular : " + minhaConta.getTitular().getNome());
        System.out.println("Saldo : " + minhaConta.getSaldo());

        System.out.println("Titular : " + contaBb.getTitular().getNome());
        System.out.println("Saldo : " + contaBb.getSaldo());
    }

}
