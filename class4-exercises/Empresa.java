class Empresa {
	String nome;
	String cnpj;
	Funcionario[] funcionarios;
	int livre = 0;

	void adicionaEmpregado(Funcionario f) {
		funcionarios[this.livre] = f;
		this.livre++;
	}

	void mostraEmpregado() {
		for (Funcionario empregado : this.funcionarios) {
			if (empregado == null) continue;
			System.out.println("R$ " + empregado.salario);
		}
	}

	void mostraTodasAsInformacoes() {
		for (Funcionario empregado : this.funcionarios) {
			if (empregado == null) continue;
			empregado.mostra();
			System.out.println();
		}
	}

	boolean contem(Funcionario f) {
		for (Funcionario empregado : this.funcionarios) {
			if (empregado == f) {
				return true;
			}
		}
		return false;
	}
}