class Funcionario {
	String nome;
	String departamento;
	double salario;
	String rg;
	Data dataEntrada;

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
		System.out.println("Data de entrada: " + this.dataEntrada.dia + "/" + this.dataEntrada.mes + "/" + this.dataEntrada.ano);
		System.out.println("RG: " + this.rg);
		System.out.println("Calcula ganho anual: " + this.calculaGanhoAnual());
	}
}