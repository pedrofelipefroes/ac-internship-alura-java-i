class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Danilo";
		f1.salario = 100;
		f1.dataEntrada.dia = 23;
		f1.dataEntrada.mes = 1;
		f1.dataEntrada.ano = 2017;

		// Funcionario.salario = 1234;
		// Funcionario.calculaGanhoAnual();

		//f1.dataEntrada =  d1;

		f1.mostra();
	}
}