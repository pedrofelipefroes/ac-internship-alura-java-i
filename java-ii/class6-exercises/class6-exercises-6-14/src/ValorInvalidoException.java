/**
 * Created by pfroes on 1/30/17.
 */
public class ValorInvalidoException extends RuntimeException {
	public ValorInvalidoException(double valor) {
		super("Valor invalido: " + valor);
	}
}
