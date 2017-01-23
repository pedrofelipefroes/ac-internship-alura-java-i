class BalancoTrimestral {
	public static void main (String[] args) {
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;

		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

		System.out.println("Gastos do trimestre: R$ " + gastosTrimestre + "\nValor da média mensal: R$ " + gastosTrimestre/3);
	}
}