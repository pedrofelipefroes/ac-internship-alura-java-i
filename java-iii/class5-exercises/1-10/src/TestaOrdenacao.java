import conta.Conta;
import conta.ContaPoupanca;

import java.util.*;

public class TestaOrdenacao {
	public static void main(String[] args) {
//		Conta cc1 = new ContaPoupanca(1, "Ash Ketchum");
//		Conta cc2 = new ContaPoupanca(2, "Gary Oak");
//		Conta cc3 = new ContaPoupanca(3, "Misty");
//		Conta cc4 = new ContaPoupanca(4, "Brock");

		List<Conta> ccList = new LinkedList<>();

		System.out.println(ccList.toString());

		for (int i = 0; i < 5; i++) {
			Conta cc = new ContaPoupanca(i, String.format("Conta%s", i));
			Random rnd = new Random();
			cc.setSaldo(rnd.nextInt(100));
			ccList.add(cc);
		}

//		ccList.add(cc1);
//		ccList.add(cc2);
//		ccList.add(cc3);
//		ccList.add(cc4);

		System.out.println(ccList);

		Collections.reverse(ccList); // inverter a ordem da lista
		System.out.println(ccList);

		Collections.shuffle(ccList); // embaralhar a ordem da lista
		System.out.println(ccList);

		Collections.rotate(ccList, 2); // rotacionar em 2 unidades a lista
		System.out.println(ccList);
	}
}
