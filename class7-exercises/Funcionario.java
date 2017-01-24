class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private String rg;
	private Data dataEntrada;
	private int id;

	public static int identificador = 0;

	public Funcionario(String nome) {
		this.nome = nome;
		this.id = Funcionario.identificador++;
	}

	public int getIdentificador() {
		return this.id;
	}

	public Funcionario() {
		this.id = Funcionario.identificador++;
	}

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

	public void setDataEntrada(int dia, int mes, int ano) {
		this.dataEntrada = new Data(dia, mes, ano);
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
		System.out.println("RG: " + this.rg);
		System.out.println("Calcula ganho anual: " + this.getGanhoAnual());
		System.out.println("ID: " + this.id);
	}
}