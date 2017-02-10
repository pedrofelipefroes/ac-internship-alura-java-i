import conta.Conta;
import conta.ContaCorrente;
import conta.ValorInvalidoException;

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
