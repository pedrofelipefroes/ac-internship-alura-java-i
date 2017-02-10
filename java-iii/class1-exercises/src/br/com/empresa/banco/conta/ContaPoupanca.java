package br.com.empresa.banco.conta;

/**
 * Created by pfroes on 1/26/17.
 */

public class ContaPoupanca extends Conta {
    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }
}

