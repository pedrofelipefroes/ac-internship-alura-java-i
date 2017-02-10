
public class Conta {

	protected double saldo;

	void deposita(double valor) {
		this.saldo += valor;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

	public void saca(double valor) {
		if (valor > saldo) {
			System.out.println("Nao e possivel sacar!");
		} else {
			this.saldo -= valor;
		}
	}
}