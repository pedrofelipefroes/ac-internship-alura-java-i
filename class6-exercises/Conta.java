class Conta {
	int numero;
	Cliente titular;
	private double saldo;
	private double limite;

	public void saca(double valor) {
		if (valor > this.saldo + this.limite) {
			System.out.println("Saque inválido");
		} else {
			this.saldo = this.saldo - valor;
		}
	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setLimite(double novoLimite) {
		this.limite = novoLimite;
	}
}