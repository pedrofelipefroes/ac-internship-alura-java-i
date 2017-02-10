import conta.*;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class TestaMapa {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente(1, "Ash");
		c1.deposita(8000);

		Conta c2 = new ContaCorrente(2, "Gary");
		c2.deposita(3000);

		// cria o mapa
		Map<String, Conta> mapaDeContas = new HashMap<>();
		//Map mapaDeContas = new HashMap();

		// adiciona duas chaves e seus valores
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);

		// qual a conta do diretor?
		Conta contaDoDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
	}
}
