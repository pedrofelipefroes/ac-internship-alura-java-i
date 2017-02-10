/**
 * Created by pfroes on 1/30/17.
 */
public class GerenciadorDeImpostoDeRenda {
	private double total;

	void adiciona(Tributavel t) {
		System.out.println("Adicionando tributavel: " + t);
		this.total += t.calculaTributos();
	}

	public double getTotal() {
		return this.total;
	}
}
