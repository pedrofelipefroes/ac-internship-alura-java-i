class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Danilo";
		f1.salario = 100;

		Data d1 = new Data();
		d1.dia = 23;
		d1.mes = 1;
		d1.ano = 2017;

		f1.dataEntrada =  d1;

		f1.mostra();
	}
}