package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ValorInvalidoException;

/**
 * Created by pfroes on 1/30/17.
 */
public class TesteDeposita {
	public static void main(String[] args) {
		Conta cp = new ContaCorrente(0, "Sylvia");

		try {
			cp.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
}
