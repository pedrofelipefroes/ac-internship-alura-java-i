class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}

	public void roda(Conta c) {
		System.out.println("Saldo anterior: R$ " + c.getSaldo());
		c.atualiza(this.selic);
		System.out.println("Saldo final: R$ " + c.getSaldo());
		this.saldoTotal += c.TgetSaldo();
	}
}