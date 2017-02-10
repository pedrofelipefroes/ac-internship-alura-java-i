/**
 * Created by pfroes on 1/26/17.
 */

public abstract class Conta {

    protected double saldo;

    void deposita(double valor) {
    	if (valor < 0) {
    		throw new ValorInvalidoException(valor);
	    } else {
		    this.saldo += valor - 0.10;
	    }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public abstract void atualiza(double taxa);

    public void saca(double valor) {
        if (valor > saldo) {
            System.out.println("Nao e possivel sacar!");
        } else {
            this.saldo -= valor;
        }
    }
}