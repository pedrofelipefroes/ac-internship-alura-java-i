class Funcionario {
	String nome;
	String departamento;
	double salario;
	String dataEntrada;
	String rg;

	void recebeAumento(double valor) {
		this.salario += valor;
	}

	double calculaGanhoAnual() {
		return this.salario*12;
	}
}