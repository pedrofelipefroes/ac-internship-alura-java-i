package conta;

import java.util.Comparator;

/**
 * Created by pfroes on 1/26/17.
 */

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, String nome) {
        super(numero, nome);
    }

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }
}

