
public class Principal {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100.0);
		conta.saca(50);

		System.out.println(conta.getSaldo());
	}
}