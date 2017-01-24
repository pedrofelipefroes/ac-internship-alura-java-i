class TestaModificador {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setNome("Lana Del Rey");
		f.setSalario(1000.0);
		f.setDepartamento("Música Alternativa");

		f.getDados();

		Data d1 = new Data(29, 2, 2012);
		System.out.println(d1.getDataFormatada());
	}
}