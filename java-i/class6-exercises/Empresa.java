class Empresa {
	private String nome;
	private String cnpj;
	private Funcionario[] funcionarios;
	private int livre = 0;

	public Empresa(int numeroFuncionarios) {
		this.funcionarios = new Funcionario[numeroFuncionarios];
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Funcionario getFuncionario(int posicao) {
		return this.funcionarios[posicao];
	}

	public void setFuncionario(Funcionario f) {
		funcionarios[this.livre] = f;
		this.livre++;
	}

	public void getInformacoesDosFuncionarios() {
		for (Funcionario funcionario : this.funcionarios) {
			if (funcionario == null) continue;
			funcionario.getDados();
			System.out.println();
		}
	}

	public boolean contem(Funcionario f) {
		for (Funcionario empregado : this.funcionarios) {
			if (empregado == f) {
				return true;
			}
		}
		return false;
	}
}