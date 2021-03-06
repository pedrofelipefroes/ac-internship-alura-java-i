package br.com.empresa.banco.conta;

/**
 * Created by pfroes on 1/26/17.
 */

public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
}

