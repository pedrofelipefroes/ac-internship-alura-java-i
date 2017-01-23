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

	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: R$ " + this.salario);
		System.out.println("Data de entrada: " + this.dataEntrada);
		System.out.println("RG: " + this.rg);
		System.out.println("Calcula ganho anual: " + this.calculaGanhoAnual());
	}
}