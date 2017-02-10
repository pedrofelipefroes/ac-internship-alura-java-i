package br.com.empresa.banco;

/**
 * Created by pfroes on 1/30/17.
 */
public class TesteDeposita {
	public static void main(String[] args) {
		Conta cp = new ContaCorrente();

		try {
			cp.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
}
