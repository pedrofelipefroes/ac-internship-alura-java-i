class TestaEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.funcionarios = new Funcionario[10];

		for (int i = 0; i < 5; i++) {
			Funcionario f = new Funcionario();
			f.nome = "Funcionario " + i;
			f.salario = 1000 + i*100;
			empresa.adicionaEmpregado(f);
		}

		empresa.mostraTodasAsInformacoes();

		Funcionario g = new Funcionario();

		System.out.println(empresa.contem(g));
	}
}