class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {
		this.ano = ano;

		if (mes >= 1 && mes <= 12) {
			this.mes = mes;
		}
		
		if (dia <= 31) {
			// abril, junho, setembro, novembro: 30 dias
			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				if (dia <= 30) {
					this.dia = dia;
				}
			}

			// fevereiro
			if (mes == 2) {

				// se ano bissexto
				if ((ano%4 == 0 && ano%100 != 0) || (ano%400 == 0)) {
					if (dia <= 29) {
						this.dia = dia;
					}
				} else { // caso não seja bissexto
					if (dia <= 28) {
						this.dia = dia;
					}
				}
			}
		}
	}

	public String getDataFormatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}