class TestaModificador {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setNome("Lana Del Rey");
		f.setSalario(1000.0);
		f.setDepartamento("Música Alternativa");

		f.getDados();
	}
}