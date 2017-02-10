class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private String rg;
	private Data dataEntrada = new Data();

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg =  rg;
	}

	public Data getDataEntrada() {
		return this.dataEntrada;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public void recebeAumento(double valor) {
		this.salario += valor;
	}

	public double getGanhoAnual() {
		return this.salario*12;
	}

	public void getDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: R$ " + this.salario);
		System.out.println("Data de entrada: " + this.dataEntrada.getFormatada());
		System.out.println("RG: " + this.rg);
		System.out.println("Calcula ganho anual: " + this.getGanhoAnual());
	}
}