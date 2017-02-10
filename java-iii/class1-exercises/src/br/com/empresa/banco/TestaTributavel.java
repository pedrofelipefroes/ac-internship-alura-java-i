package br.com.empresa.banco;

/**
 * Created by pfroes on 1/30/17.
 */
public class TestaTributavel {
	public static void main(String[] args) {
//		br.com.empresa.banco.conta.ContaCorrente cc = new br.com.empresa.banco.conta.ContaCorrente();
//		cc.deposita(100);
//		System.out.println(cc.calculaTributos());
//		System.out.printf("O saldo é: %.2f", cc.getSaldo());

		// testanto polimorfismo:
//		br.com.empresa.banco.sistema.Tributavel t = cc;
//		System.out.println(t.calculaTributos());

		System.out.println("inicio do main");
		metodo1();
		System.out.println("fim do main");
	}

	static void metodo1() {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}

	static void metodo2() {
		System.out.println("inicio do metodo2");
		int[] array = new int[10];
		for (int i = 0; i <=  15; i++) {
			array[i] = i;
			System.out.println(i);
		}
		System.out.println("fim do metodo2");
	}
}
